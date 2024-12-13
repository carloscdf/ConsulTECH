package Models;

import java.util.ArrayList;

public class Paciente extends Pessoa{
	private ArrayList<String> historicoMedico = new ArrayList<String>();
	private String convenio = "";
	
	public Paciente(String nome, /*String cpf,*/ String dataNascimento, String telefone, String tipoSanguineo,
			double altura, double peso, String logradouro, String bairro, int numero, String cep, String cidade,
			String estado, String convenio) {
		super(nome, /*cpf,*/ dataNascimento, telefone, tipoSanguineo, altura, peso, logradouro, bairro, numero, cep, cidade,
				estado);
	}
	
	//Getters
	
	public ArrayList<String> getHistoricoMedico(){
		return historicoMedico;
	}
	
	public String getConvenio() {
		return convenio;
	}
	
	//Setters
	
	public void setHistoricoMedico(String historicoMedico){
		this.historicoMedico.add(historicoMedico);
	}
	
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder(super.toString());  // Inclui as informações da classe Pessoa
	    sb.append("\nHistórico Médico: ");
	    
	    // Exibe o histórico médico
	    if (historicoMedico.isEmpty()) {
	        sb.append("Nenhum histórico médico registrado.");
	    } else {
	        for (String historico : historicoMedico) {
	            sb.append("\n- ").append(historico);
	        }
	    }
	    
	    sb.append("\nConvênio: ").append(convenio.isEmpty() ? "Nenhum convênio registrado" : convenio);
	    
	    return sb.toString();
	}

}
