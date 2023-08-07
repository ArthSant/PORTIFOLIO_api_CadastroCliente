package apiCrud.cadastroCliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")


public class ClienteController {
	
	@GetMapping
	public String hello() {
		return "hello world";
	}
		
}
