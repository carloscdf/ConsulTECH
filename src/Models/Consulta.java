package Models;


public class Consulta {
	private String data;
	private String hora;
	private String medico;
	private String paciente;
	private String queixaPaciente;
	private String tipoConsulta;
	private String convenio;
	private String observacoes;
	private double preco;
	private String materiaisUtilizados;
	
	public Consulta(String data, String hora, String medico, String paciente, String queixaPaciente,
	String tipoConsulta, String convenio, String observacoes, double preco, String materiaisUtilizados) {
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.paciente = paciente;
		this.queixaPaciente = queixaPaciente;
		this.tipoConsulta = tipoConsulta;
		this.convenio = convenio;
		this.observacoes = observacoes;
		this.preco = preco;
		this.materiaisUtilizados = materiaisUtilizados;
	}
	
	@Override
	public String toString() {
	    return "Data: " + data 
	    		+ "\nHora: " + hora +
	           "\nMédico: " + medico +
	           "\nPaciente: " + paciente +
	           "\nQueixa do paciente: " + queixaPaciente +
	           "\nTipo da consulta: " + tipoConsulta +
	           "\nConvênio: " + convenio +
	           "\nObservações: " + observacoes +
	           "\nPreço: " + preco +
	           "\nMateriais utilizados: " + materiaisUtilizados;          
	}
	
	 // Getters
    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getMedico() {
        return medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getQueixaPaciente() {
        return queixaPaciente;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
    public String getConvenio() {
    	return convenio;
    }
    
    public double getPreco() {
    	return preco;
    }
    
    public String getMateriaisUtilizados() {
    	return materiaisUtilizados;
    }


    // Setters
    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setQueixaPaciente(String queixaPaciente) {
        this.queixaPaciente = queixaPaciente;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public void setConvenio(String convenio) {
    	this.convenio = convenio;
    }

    public void setConvenio(double preco) {
    	this.preco = preco;
    }
    
    public void setMateriaisUtilizados(String materiaisUtilizados) {
    	this.materiaisUtilizados = materiaisUtilizados;
    }
	
}
