package Views;

import Views.Funcionario;

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
	
	public void ImprimirInformacoes() {
		System.out.println("NOME: "+nome);
		System.out.println("CRM: "+this.crm);
		System.out.println("ESPECIALIDADE: "+this.especialidade);
		System.out.println("HORARIOS DE ATENDIMENTO: "+this.horarioAtendimento);
		System.out.println("DATA DE NASCIMENTO: "+dataNascimento);
		System.out.println("ID CLÍNICA: "+id+"");
		System.out.println("CPF: "+getCPF());
		System.out.println("SALÁRIO: "+getSalario());
	}
}
