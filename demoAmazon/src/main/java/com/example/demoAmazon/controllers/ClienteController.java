package com.example.demoAmazon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demoAmazon.model.Cliente;
import com.example.demoAmazon.repositorios.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	
	@GetMapping(value = "/list")
	public String listCliente (ModelMap model) {
		
		List<Cliente> clientes = clienteRepository.findAll();
		model.addAttribute("clienteList", clientes);
		
		
		return "cliente/list";
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public String cadastrar(ModelMap model) {
		
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		
		return "cliente/cadastro";
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrar(Cliente user) {
		clienteRepository.save(user);

		return "redirect:/cliente/list";
	}
	
	@RequestMapping("/deletar")
	public String deletar(Integer id) {
		
		clienteRepository.deleteById(id);
		
		return "redirect:/cliente/list";
	}
	
	
}
