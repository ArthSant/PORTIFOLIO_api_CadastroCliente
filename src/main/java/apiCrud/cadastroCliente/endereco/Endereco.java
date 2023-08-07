package apiCrud.cadastroCliente.endereco;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
		private String cidade;
		private String uf;
		private String rua;
		private String complemento;
		
		public Endereco() {}

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
		
		
	
}
