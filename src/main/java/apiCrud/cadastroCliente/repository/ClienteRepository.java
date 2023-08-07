package apiCrud.cadastroCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apiCrud.cadastroCliente.cliente.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente,Long> {

}
