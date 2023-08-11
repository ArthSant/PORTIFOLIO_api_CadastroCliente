package apiCrud.cadastroCliente.cliente;

import apiCrud.cadastroCliente.endereco.DadosEndereco;

public record DadosAtualizarCliente(Long id,String email,DadosEndereco endereco) {

}
