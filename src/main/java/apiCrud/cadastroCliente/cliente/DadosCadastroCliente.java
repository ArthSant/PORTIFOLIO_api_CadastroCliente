package apiCrud.cadastroCliente.cliente;

import apiCrud.cadastroCliente.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(
		@NotBlank
		String nome,

		@NotBlank
		@Email
		String email,

		
		@NotBlank
		@Pattern(regexp = "\\d{11}")
		String cpf,
		
		@Valid
		@NotNull
		DadosEndereco endereco
		) 
{
	
	
}
