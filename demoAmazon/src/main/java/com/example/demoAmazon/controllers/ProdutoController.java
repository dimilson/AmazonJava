package com.example.demoAmazon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoAmazon.model.Cliente;
import com.example.demoAmazon.model.Produto;
import com.example.demoAmazon.repositorios.ProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping(value = "list")
	public String listarProduto(ModelMap model) {
		List<Produto> produtos = produtoRepository.findAll();

		model.addAttribute("listaProdutos", produtos);

		return "produto/list";
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public String form(ModelMap model) {
		
		Produto produto = new Produto();
		model.addAttribute("produto", produto);

		return "produto/cadastro";
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String form(Produto produto) {

		produtoRepository.save(produto);
		

		return "redirect:/produto/list";
	}
	
	@RequestMapping("/deletar")
	public String deletarProduto(Integer id) {

		produtoRepository.deleteById(id);

		return "redirect:/produto/list";
	}
}
