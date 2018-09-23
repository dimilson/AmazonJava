package com.example.demoAmazon.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoAmazon.model.Endereco;
import com.example.demoAmazon.repositorios.EnderecoRepository;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoResource {
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@GetMapping
	public List<Endereco> get(){
		return enderecoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Endereco get(@PathVariable("id") Integer id) {
		return enderecoRepository.getOne(id);
	}
	
	@PostMapping
	public Endereco save(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	@PutMapping
	public Endereco update(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		enderecoRepository.deleteById(id);
	}

}
