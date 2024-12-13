package Models;

public class Pessoa extends Endereco {
	private String nome;
	//private String cpf;
	private String dataNascimento;
	private String telefone;
	private String tipoSanguineo;
	private double altura;
	private double peso;
	
	public Pessoa(String nome, /*String cpf,*/ String dataNascimento, String telefone, 
			String tipoSanguineo, double altura, double peso, String logradouro, String bairro,
			int numero, String cep, String cidade, String estado) {
		super(logradouro, bairro,numero, cep, cidade, estado);
		this.nome = nome;
		//this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.tipoSanguineo = tipoSanguineo;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	/*public String getCPF() {
		return cpf;
	}
	*/
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	@Override
	public String toString() {
	    return "Nome: " + nome +
	           "\nData de Nascimento: " + dataNascimento +
	           "\nTelefone: " + telefone +
	           "\nTipo Sanguíneo: " + tipoSanguineo +
	           "\nAltura: " + altura +
	           "\nPeso: " + peso +
	           "\nEndereço:\n" + super.toString();  // Chama o toString da classe Endereco
	}


	
}
