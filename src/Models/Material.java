package Models;

public class Material {
	private String nome;
	private int quantidadeMinima;
	private int quantidade;
	private String fornecedor;
	private double preco;
	private boolean qtdEstoqueBaixa;
	
	public Material(String nome, int quantidadeMinima, int quantidade, String fornecedor, double preco) {
		this.nome = nome;
		this.quantidadeMinima = quantidadeMinima;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String getFornecedor() {
		return fornecedor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public boolean getQtdEstoqueBaixa() {
		return qtdEstoqueBaixa;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void getPreco(double preco) {
		this.preco = preco;
	}
	
	public void getQtdEstoqueBaixa(boolean qtdEstoqueBaixa) {
		this.qtdEstoqueBaixa = qtdEstoqueBaixa;
	}
	
	@Override
	public String toString() {
	    return "Nome: " + nome 
	    		+ "\nQuantidade mínima: " + quantidadeMinima +
	           "\nQuantidade em estoque: " + quantidade +
	           "\nFornecedor: " + fornecedor +
	           "\nPreço: " + preco;
	}
	
}
