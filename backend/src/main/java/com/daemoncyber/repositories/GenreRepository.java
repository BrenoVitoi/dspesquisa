package com.daemoncyber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daemoncyber.entities.Record;

@Repository
public interface GenreRepository extends JpaRepository<Record, Long> {

}
