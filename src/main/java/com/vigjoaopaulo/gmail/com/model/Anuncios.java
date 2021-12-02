package com.vigjoaopaulo.gmail.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "anuncios")
public class Anuncios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String posto;
	private String nomeComb;
	private Double preco;
	private String endereco;
	private String numero;
	
	public Anuncios() {
		
	}

	

	public Anuncios(Long id, String posto, String nomeComb, Double preco, String endereco, String numero) {
		super();
		this.id = id;
		this.posto = posto;
		this.nomeComb = nomeComb;
		this.preco = preco;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPosto() {
		return posto;
	}



	public void setPosto(String posto) {
		this.posto = posto;
	}



	public String getNomeComb() {
		return nomeComb;
	}



	public void setNomeComb(String nomeComb) {
		this.nomeComb = nomeComb;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	@Override
	public String toString() {
		return "id = " + id + "\nNome do Posto = " + posto + "\nNome do Combustível = " + nomeComb + "\nEndereço = " + endereco
				+ "\nPreço = " + preco;
	}
	
	

}
