package com.daemoncyber.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daemoncyber.dto.RecordDTO;
import com.daemoncyber.dto.RecordInsertDTO;
import com.daemoncyber.entities.Game;
import com.daemoncyber.entities.Record;
import com.daemoncyber.repositories.GameRepository;
import com.daemoncyber.repositories.RecordRepository;



@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;

	@Autowired
	private GameRepository GameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {

		Record entity = new Record();

		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = GameRepository.getOne(dto.getGameId());
		entity.setGame(game);

		entity = repository.save(entity);
		return new RecordDTO(entity);
		
	}
	
	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
}
