package com.example.demoAmazon.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Categoria {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String tipo;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name = "produtos")
	private List<Produto> produtos;
	
	public Categoria() {
	}
	
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	

}
