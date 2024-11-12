package Models;

public class Endereco {
	private String logradouro;
	private String bairro;
	private int numero;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco ( String logradouro, String bairro, int numero, String cep, 
			String cidade, String estado) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEstado() {
		return estado;
	}

}
