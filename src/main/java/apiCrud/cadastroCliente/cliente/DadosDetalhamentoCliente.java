package apiCrud.cadastroCliente.cliente;

import apiCrud.cadastroCliente.endereco.Endereco;

public record DadosDetalhamentoCliente(Long id, String nome, String email, String cpf, Endereco endereco) {
	public DadosDetalhamentoCliente(Cliente cliente) {
		this(cliente.getId(),cliente.getNome(),cliente.getEmail(),cliente.getCpf(),cliente.getEndereco());
	}
}
