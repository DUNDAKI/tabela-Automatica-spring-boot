package com.vigjoaopaulo.gmail.com.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.vigjoaopaulo.gmail.com.Dao.PersonaDao;
import com.vigjoaopaulo.gmail.com.model.Personas;
import com.vigjoaopaulo.gmail.com.repository.PersonaInteface;

@Service
public class PersonaService implements PersonaInteface {
	
	PersonaDao dao;
	
	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> listar(int id) {
		
		return dao.listar();
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
