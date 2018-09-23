package com.example.demoAmazon.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoAmazon.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
