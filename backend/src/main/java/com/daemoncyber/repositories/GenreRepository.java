package com.daemoncyber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daemoncyber.entities.Record;

public interface GenreRepository extends JpaRepository<Record, Long> {

}
