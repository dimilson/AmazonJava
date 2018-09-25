package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.example.demoAmazon.model.Cliente;
import com.example.demoAmazon.repositorios.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	
	@GetMapping(value = "/cliente")
	public String listCliente (ModelMap model) {
		List<Cliente> clientes = clienteRepository.findAll();
		model.addAttribute("clienteList", clientes);
		
		
		return "cliente/list";
	}
	
	
}
