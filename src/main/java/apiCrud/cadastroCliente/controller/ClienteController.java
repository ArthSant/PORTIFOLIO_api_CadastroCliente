package apiCrud.cadastroCliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import apiCrud.cadastroCliente.cliente.Cliente;
import apiCrud.cadastroCliente.cliente.DadosAtualizarCliente;
import apiCrud.cadastroCliente.cliente.DadosCadastroCliente;
import apiCrud.cadastroCliente.cliente.DadosDetalhamentoCliente;
import apiCrud.cadastroCliente.cliente.DadosListagemCliente;
import apiCrud.cadastroCliente.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("clientes") //Mapeamento 

public class ClienteController {

	@Autowired
	ClienteRepository repository;

	@PostMapping
	@Transactional
	
	
	/*
	 * Estou usando os métodos com retorno ResponseEntity para retornar o código de status referente 
	 * as requisições http.
	 */
	
	public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroCliente dados, UriComponentsBuilder uriBuilder) {
		var cliente = new Cliente(dados);
		repository.save(cliente);
		var uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new DadosDetalhamentoCliente(cliente));
	
	}
	
	
	/*
	 * O método get vai retornar em ordem alfabética.
	 */
	
	@GetMapping
	public ResponseEntity<Page<DadosListagemCliente>> listar(@PageableDefault(sort = {"nome"}) Pageable pagina) {
		var page = repository.findAll(pagina).map(DadosListagemCliente::new);
		return ResponseEntity.ok(page);
	
	}
	
	@PutMapping
	@Transactional
	public ResponseEntity atualizar(@RequestBody @Valid	DadosAtualizarCliente dados) {
		var cliente = repository.getReferenceById(dados.id());
		cliente.atualizar(dados);
		return ResponseEntity.ok(new DadosDetalhamentoCliente(cliente));
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity excluir(@PathVariable	Long id) {
		var cliente = repository.getReferenceById(id);
		repository.delete(cliente);
		
		return ResponseEntity.noContent().build();
	}
}
