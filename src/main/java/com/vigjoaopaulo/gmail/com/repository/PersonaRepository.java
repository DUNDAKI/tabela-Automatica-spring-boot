package com.vigjoaopaulo.gmail.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vigjoaopaulo.gmail.com.model.Personas;

@Repository
public interface PersonaRepository extends JpaRepository<Personas, Long> {
	
}
