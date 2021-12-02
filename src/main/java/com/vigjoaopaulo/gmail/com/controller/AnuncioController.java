package com.vigjoaopaulo.gmail.com.controller;

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

import com.vigjoaopaulo.gmail.com.model.Anuncios;
import com.vigjoaopaulo.gmail.com.repository.AnuncioRepository;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {
	
	@Autowired
	private AnuncioRepository repository;
	
	public boolean verificarPorId(Long id) {
		return repository.existsById(id);
	}
	
	@GetMapping("/listar")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Anuncios> getPerfil() {
		return repository.findAll();
	}

	@PostMapping("/inserir")
	@ResponseStatus(HttpStatus.CREATED)
	public String addPerfil(@RequestBody Anuncios anuncio) {

		repository.save(anuncio);
		return "Inserido com sucesso id: ";

	}
	
	@GetMapping("/buscarId/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String getId(@PathVariable Long id) {

		if (verificarPorId(id) != true) {
			return "Registro não encontrado...";
		} else {

			Anuncios p = repository.findById(id).get();

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
	public String updatePerfil(@PathVariable Long id, @RequestBody Anuncios anuncio) {

		if (verificarPorId(id) != true) {
			return "Registro não encontrado";
		} else {
			Anuncios newObj = repository.findById(id).get();
			
			newObj.setPosto(anuncio.getPosto());
			newObj.setNomeComb(anuncio.getNomeComb());
			newObj.setPreco(anuncio.getPreco());
			newObj.setEndereco(anuncio.getEndereco());
			newObj.setNumero(anuncio.getNumero());
			repository.save(newObj);
			return "Deletado com sucesso id: " + id;
		}
	}

}
