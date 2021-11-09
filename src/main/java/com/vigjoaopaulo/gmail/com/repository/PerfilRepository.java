package com.vigjoaopaulo.gmail.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vigjoaopaulo.gmail.com.model.Perfil;

@Repository
public interface PerfilRepository  extends JpaRepository<Perfil, Long>{

}
 