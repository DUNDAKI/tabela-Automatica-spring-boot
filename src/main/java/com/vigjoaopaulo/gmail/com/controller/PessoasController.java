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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vigjoaopaulo.gmail.com.model.Pessoas;
import com.vigjoaopaulo.gmail.com.repository.PessoasRepository;

@RestController
public class PessoasController {

	@Autowired
	private PessoasRepository pessoaRepository;	

	
	@PostMapping("/pessoas")
	public String addPessoa(@RequestBody Pessoas pessoa) {		
		
		pessoaRepository.save(pessoa);
		
		return "Inserido com sucesso...";
	}
	
	@GetMapping("/pessoas")
	public List<Pessoas>  listaAll() {
		 return pessoaRepository.findAll();
		
	}
	
	
	@GetMapping("/pessoas/{id}")
	public Pessoas getCliente(@PathVariable Long id) {
		return pessoaRepository.findById(id).get();
	}	
		
	@DeleteMapping("/pessoas/{id}")
	public String deleteCliente(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
		
		return "Deletado com sucesso id: " + id;
	}
	
	
	@PutMapping("/pessoas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public String updateCliente(@PathVariable Long id,  @RequestBody Pessoas cliente) {
		
		Pessoas newObj = pessoaRepository.findById(id).get();
		
		newObj.setNome(cliente.getNome());
		
		
		pessoaRepository.save(newObj);
		
		return "Atualizado com sucesso id: " + id;
	
	
	}
	
} 
