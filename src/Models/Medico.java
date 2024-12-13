package Models;

public class Medico extends Funcionario {
	public String crm;
	public String especialidade;
	public String horarioAtendimento;
	public String contato;
	public double valorConsulta;
	
	
	public Medico(String crm, String especialidade, String nome, String horarioAtendimento, String contato, double valorConsulta){
		super(nome);
		this.crm = crm;
		this.especialidade = especialidade;
		this.horarioAtendimento = horarioAtendimento;
		this.contato = contato;
		this.valorConsulta = valorConsulta;
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
	
	@Override
	public String toString() {
	    return "Funcionário: \n" + super.toString()
	    		+ "\nCRM: " + crm +
	           "\nEspecialidade: " + especialidade +
	           "\nHorario de Atendimento: " + horarioAtendimento +
	           "\nContato: " + contato +
	           "\nValor da consulta: " + valorConsulta;
	}
}
