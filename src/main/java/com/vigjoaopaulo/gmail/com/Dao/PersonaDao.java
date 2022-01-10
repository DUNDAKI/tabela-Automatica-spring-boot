package com.vigjoaopaulo.gmail.com.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vigjoaopaulo.gmail.com.model.Personas;
import com.vigjoaopaulo.gmail.com.repository.PersonaInteface;

public class PersonaDao implements PersonaInteface {
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> lista = template.queryForList("select * from personas");
		return lista;
	}

	@Override
	public List<Map<String, Object>> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personas add(Personas p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personas edit(Personas p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
