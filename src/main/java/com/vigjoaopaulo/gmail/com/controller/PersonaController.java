package com.vigjoaopaulo.gmail.com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.gmail.com.model.Personas;
import com.vigjoaopaulo.gmail.com.repository.PersonaRepository;

@RestController
@RequestMapping(path = "/personas")
public class PersonaController {
	
	@Autowired
	JdbcTemplate template;
	
	@Autowired
	PersonaRepository repository;	

	@GetMapping("/getListar")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Personas> getPerfil() {
		return repository.findAll();
	}
	
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> lista = template.queryForList("SELECT id, nombres, apellidos FROM personas");
		return lista;
	}
	
	
//	@Autowired
//	PersonaService service;
//	
//	@GetMapping("/getListarPersona")
//	public List<Map<String, Object>>listar(){
//		return service.listar();
//	}

}
