package apiCrud.cadastroCliente.endereco;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
		private String cidade;
		private String uf;
		private String rua;
		private String complemento;
		
		public Endereco() {}
		
		public Endereco(DadosEndereco dados) {
			this.cidade = dados.cidade();
			this.uf = dados.uf();
			this.rua = dados.rua();
			this.complemento = dados.complemento();
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getUf() {
			return uf;
		}

		public void setUf(String uf) {
			this.uf = uf;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public void atualizar(DadosEndereco dados) {
			if(dados.cidade() != null)
				this.cidade = dados.cidade();
			if(dados.uf() != null)
				this.uf = dados.uf();
			if(dados.rua() != null)
				this.rua = dados.rua();
			if(dados.complemento() != null)
				this.complemento = dados.complemento();
			
		}
		
		
	
}
