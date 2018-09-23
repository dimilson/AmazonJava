package com.example.demoAmazon.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoAmazon.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
