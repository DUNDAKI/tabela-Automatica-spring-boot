package com.vigjoaopaulo.gmail.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vigjoaopaulo.gmail.com.model.Cadastro;

@Repository
public interface CadastroRepository  extends JpaRepository<Cadastro, Long>{

	
	
	boolean existsByApelido(Cadastro apelido);
	boolean existsById(int id);

}
 