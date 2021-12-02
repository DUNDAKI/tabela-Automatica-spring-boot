package com.vigjoaopaulo.gmail.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.gmail.com.model.Anuncios;

@RestController
public interface AnuncioRepository extends JpaRepository<Anuncios, Long> {

}
