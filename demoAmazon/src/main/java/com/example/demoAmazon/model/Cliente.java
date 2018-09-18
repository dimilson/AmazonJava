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

public class Cliente {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "Id_endereco")
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	@Column
	private String email;
	
	@Column
	private String senha;
	
	@Column
	private String telefone;
	
	
	public Cliente()
	{
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public List<Endereco> getEnderecos() {
		return enderecos;
	}


	public void setEnderecos(List<Endereco>endereco) {
		this.enderecos = endereco;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
