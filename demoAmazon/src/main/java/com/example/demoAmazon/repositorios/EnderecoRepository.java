package com.example.demoAmazon.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoAmazon.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
