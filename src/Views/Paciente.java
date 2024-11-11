package Views;

import java.util.ArrayList;

public class Paciente extends Pessoa{
	private ArrayList<Consulta> historicoMedico = new ArrayList<Consulta>();
	private String convenio = "";
	
	public Paciente(String nome, String cpf, String dataNascimento, String telefone, String tipoSanguineo,
			double altura, double peso, String logradouro, String bairro, int numero, String cep, String cidade,
			String estado) {
		super(nome, cpf, dataNascimento, telefone, tipoSanguineo, altura, peso, logradouro, bairro, numero, cep, cidade,
				estado);
	}
	
	//Getters
	
	public ArrayList<Consulta> getHistoricoMedico(){
		return historicoMedico;
	}
	
	public String getConvenio() {
		return convenio;
	}
	
	//Setters
	
	public void setHistoricoMedico(Consulta historicoMedico){
		this.historicoMedico.add(historicoMedico);
	}
	
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

}
