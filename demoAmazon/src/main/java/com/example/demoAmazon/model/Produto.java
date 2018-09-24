package com.example.demoAmazon.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private Integer codigo;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@Column
	private String marca;
	
	@Column
	private Double preco;
	
	@ManyToOne
	private Carrinho carrinho;
	
	
	public Produto() {
		
	}
	
	

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	

}
