package com.daemoncyber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daemoncyber.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
