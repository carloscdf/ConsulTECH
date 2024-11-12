package Models;

public class Medico extends Funcionario {
	public String crm;
	public String especialidade;
	public String horarioAtendimento;
	
	
	public Medico(String crm, String especialidade, String horarioAtendimento, String nome,
		String dataNascimento, String id){
		super(nome, dataNascimento, id);
		this.crm = crm;
		this.especialidade = especialidade;
		this.horarioAtendimento = horarioAtendimento;
	}
	
	//Getters
	
	public String getCrm() {
		return crm;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public String horarioAtendimento() {
		return horarioAtendimento;
	}
}
