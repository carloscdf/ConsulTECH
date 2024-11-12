package Models;

public class Funcionario {
	public String nome;
	public String dataNascimento;
	private String cpf;
	public String id;
	private double salario;
	
	public Funcionario(String nome, String dataNascimento, String id) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.id = id;
	}
	
	//Getters
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	//Setters
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
