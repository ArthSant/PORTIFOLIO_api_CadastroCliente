package apiCrud.cadastroCliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiCrud.cadastroCliente.repository.ClienteRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("clientes")


public class ClienteController {
		
	@Autowired
	 ClienteRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar() {
	}
	
	
	
	}
		

