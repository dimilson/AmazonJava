package com.example.demoAmazon.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoAmazon.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	List <Cliente> findByNomeContainingIgnoreCase(String nome);

}
