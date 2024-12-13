package Models;

public class Funcionario {
	public String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	//Getters
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
	    return "Nome: " + nome;
	}
	
}
