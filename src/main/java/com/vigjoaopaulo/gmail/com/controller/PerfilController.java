package com.vigjoaopaulo.gmail.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.gmail.com.model.Perfil;
import com.vigjoaopaulo.gmail.com.repository.PerfilRepository;

@RestController
@RequestMapping
public class PerfilController {

	
	@Autowired
	private PerfilRepository repository;

	public boolean verificarPorId(Long id) {
		return repository.existsById(id);
	}


	@GetMapping("/buscaPerfil")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Perfil> getPerfil() {
		return repository.findAll();
	}
	

	@PostMapping("/inserir")
	@ResponseStatus(HttpStatus.CREATED)
	public String addPerfil(@RequestBody Perfil perfil) {
		
		repository.save(perfil);
		
		return "Inserido com sucesso id: ";

	}

	@GetMapping("/buscarId/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String getId(@PathVariable Long id) {

		if (verificarPorId(id) != true) {
			return "Registro não encontrado...";
		} else {
			
			Perfil p = repository.findById(id).get();
			

			return "" + p;
		}
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String deletePerfil(@PathVariable Long id) {

		if (verificarPorId(id) != true) {
			return "Registro não encontrado";
		} else {
			repository.deleteById(id);
			return "Deletado com sucesso id: " + id;
		}

	}

	@PutMapping("/atualizar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String updatePerfil(@PathVariable Long id, @RequestBody Perfil perfil) {		
		
		if (verificarPorId(id) != true) {
			return "Registro não encontrado";
		} else {
			Perfil newObj = repository.findById(id).get();
			newObj.setPerfil(perfil.getPerfil());
			repository.save(newObj);
			return "Deletado com sucesso id: " + id;
		}
		
			

			

			//return "Atualizado com sucesso id: " + id;
		

		

	}

	
	
}
