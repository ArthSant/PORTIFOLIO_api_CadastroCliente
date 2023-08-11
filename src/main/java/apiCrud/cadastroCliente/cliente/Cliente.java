package apiCrud.cadastroCliente.cliente;

import apiCrud.cadastroCliente.endereco.Endereco;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity(name="Cliente")
@Table(name = "cliente")
@EqualsAndHashCode(of = "id")
public class Cliente {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String email;
		private String nome;
		private String cpf;
		
		@Embedded
		private Endereco endereco;
		
		
		public Cliente() {}
		
		public Cliente(DadosCadastroCliente dados) {
			this.nome = dados.nome();
			this.email = dados.email();
			this.cpf = dados.cpf();
			this.endereco = new Endereco(dados.endereco());
		}

		public Long getId() {
			return id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public Endereco getEndereco() {
			return endereco;
		}

		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}

		public void atualizar(DadosAtualizarCliente dados) {
			if(dados.email() != null)
				this.email = dados.email();
			if(dados.endereco() != null)
				this.endereco.atualizar(dados.endereco());
			
		}
		
		
	
}
