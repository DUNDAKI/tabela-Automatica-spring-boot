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
	
	private String nomeEmpresa;
	private String nomeProduto;
	private Double preco; 
	private String endereco;
	private String numero;
	private String cidade;
	private String estado;
	
	public Anuncios() {
		
	}

	public Anuncios(Long id, String nomeEmpresa, String nomeProduto, Double preco, String endereco, String numero,
			String cidade, String estado) {
		super();
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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

	public String getCidade() {
		return cidade; 
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Anuncios [id=" + id + ", nomeEmpresa=" + nomeEmpresa + ", nomeProduto=" + nomeProduto + ", preco="
				+ preco + ", endereco=" + endereco + ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado
				+ "]";
	}

	

}
