package com.vigjoaopaulo.gmail.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cadastro")
public class Cadastro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="apelido", nullable = false)
	private String apelido;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="senha", nullable = false)
	private String senha;
	
	@Column(name="perfil", nullable = false)
	private String perfil;
	
	public Cadastro() {
		
	}

	public Cadastro(Long id, String apelido, String email, String nome, String senha, String perfil) {
		super();
		this.id = id;
		this.apelido = apelido;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.perfil = perfil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "id = " + id + "\napelido = " + apelido + "\nemail = " + email + "\nnome = " + nome + "\nsenha = "
				+ senha + "\nperfil = " + perfil;
	}

	
}
