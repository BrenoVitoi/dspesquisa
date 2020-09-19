package com.daemoncyber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daemoncyber.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
