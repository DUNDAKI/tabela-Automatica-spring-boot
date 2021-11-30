package com.vigjoaopaulo.gmail.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vigjoaopaulo.gmail.com.model.Cadastro;

@Repository
public interface CadastroRepository  extends JpaRepository<Cadastro, Long>{

	@Query("select apelido from Cadastro apelido where apelido.apelido like ?1")
    Optional<Cadastro> findCadastroByApelido(String cpf);
	
	boolean existsByApelido(Cadastro apelido);
	boolean existsById(int id);

}
 