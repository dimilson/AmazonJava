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

import com.example.demoAmazon.model.Categoria;
import com.example.demoAmazon.repositorios.CategoriaRepository;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaResource {
	
	@Autowired
	CategoriaRepository categoriaepository;
	
	@GetMapping
	public List<Categoria> get(){
		return categoriaepository.findAll();
	}
	
	@GetMapping("{id}")
	public Categoria get(@PathVariable("id") Integer id) {
		return categoriaepository.getOne(id);
	}
	
	@PostMapping
	public Categoria save(@RequestBody Categoria categoria) {
		return categoriaepository.save(categoria);
	}
	
	@PutMapping
	public Categoria update(@RequestBody Categoria nome) {
		return categoriaepository.save(nome);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		categoriaepository.deleteById(id);
	}


}
