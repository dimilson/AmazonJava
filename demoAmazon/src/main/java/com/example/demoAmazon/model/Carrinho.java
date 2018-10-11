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
import javax.persistence.OneToOne;


@Entity
public class Carrinho {
	
	@Id
	@GeneratedValue
	private Integer id ;
	
	@OneToMany(mappedBy = "carrinho",cascade=CascadeType.ALL)
	private List<Produto> produto = new ArrayList<Produto>();
	
	@OneToOne
	private Cliente cliente;

	public Carrinho() {
		
	}
	
	

	public Integer getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
