package com.vigjoaopaulo.gmail.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

	public boolean verificarPorNome(Perfil perfil) {
		return repository.existsByPerfil(perfil);
	}

	@GetMapping("/admim")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Perfil> getPerfil() {
		return repository.findAll();
	}
	

	@PostMapping("/admim")
	@ResponseStatus(HttpStatus.CREATED)
	public String addPerfil(@RequestBody Perfil perfil) {
		 
		repository.findById(perfil.getId());
		
		if(verificarPorId(null))

		repository.save(perfil);

		return "Inserido com sucesso id: ";

	}

	@GetMapping("/admim/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String getId(@PathVariable Long id) {

		if (verificarPorId(id) != true) {
			return "Registro não encontrado...";
		} else {
			List<Perfil> lista = new ArrayList<>();
			Perfil p = repository.findById(id).get();
			p.getId();
			p.getPerfil();
			lista.add(p);

			return "" + lista;
		}
	}

	@DeleteMapping("/admim/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String deletePerfil(@PathVariable Long id) {

		if (verificarPorId(id) != true) {
			return "Registro não encontrado";
		} else {
			repository.deleteById(id);
			return "Deletado com sucesso id: " + id;
		}

	}

	@PutMapping("/admim/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String updatePerfil(@PathVariable Long id, @RequestBody Perfil perfil) {

		Perfil newObj = repository.findById(id).get();

		newObj.setPerfil(perfil.getPerfil());

		repository.save(newObj);

		return "Atualizado com sucesso id: " + id;

	}

}
