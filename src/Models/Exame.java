package Models;

public class Exame {
	private String nome;
	private String desc;
	private String tipo;
	private double preco;
	private String material;
	private String medico;
	
	public Exame(String nome, String desc, String tipo, double preco, String material, String medico) {
		this.nome = nome;
		this.desc = desc;
		this.tipo = tipo;
		this.preco = preco;
		this.material = material;
		this.medico = medico;
	}
	
	@Override
	public String toString() {
	    return "Nome: " + nome 
	    		+ "\nDescrição: " + desc +
	           "\nTipo de exame: " + tipo +
	           "\nPreço: " + preco +
	           "\nMaterial utilizado: " + material +
	           "\nMédico: " + medico;
	    
	}
}
