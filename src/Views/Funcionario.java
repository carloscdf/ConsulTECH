package Views;

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
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
