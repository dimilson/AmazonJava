package com.example.demoAmazon.model;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Carrinho {
	
	@Id
	@GeneratedValue
	private Integer id ;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "codigo")
	private List<Produto> produto = new ArrayList<Produto>();
	
	@Column
	private Cliente cliente;

	public Carrinho() {
		
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
