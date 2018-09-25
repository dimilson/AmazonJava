package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demoAmazon.repositorios.CarrinhoRepository;

@Controller
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	@Autowired
	CarrinhoRepository clienteRepository;

}
