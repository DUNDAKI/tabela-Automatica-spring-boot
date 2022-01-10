package com.vigjoaopaulo.gmail.com.repository;

import java.util.List;
import java.util.Map;

import com.vigjoaopaulo.gmail.com.model.Personas;

public interface PersonaInteface  {
	public List<Map<String, Object>> listar();
	public List<Map<String, Object>> listar(int id);
	public Personas add(Personas p);
	public Personas edit(Personas p);
	public void delete(int id);
}
