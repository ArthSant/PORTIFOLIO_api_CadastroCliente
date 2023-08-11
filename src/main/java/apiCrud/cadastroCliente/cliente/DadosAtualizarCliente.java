package apiCrud.cadastroCliente.cliente;

import apiCrud.cadastroCliente.endereco.DadosEndereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarCliente(
		@NotNull
		Long id,
		@Email
		String email,
		DadosEndereco endereco) {

}
