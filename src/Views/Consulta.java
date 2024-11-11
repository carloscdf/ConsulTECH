package Views;


public class Consulta {
	private String data;
	private String hora;
	private Medico medico;
	private Paciente paciente;
	private String queixaPaciente;
	private String tipoConsulta;
	private String convenio;
	private String observacoes;
	//private String materiaisUtilizados;
	
	public Consulta(String data, String hora, Medico medico, Paciente paciente, String queixaPaciente,
	String tipoConsulta, String observacoes) {
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.paciente = paciente;
		this.queixaPaciente = queixaPaciente;
		this.tipoConsulta = tipoConsulta;
		this.observacoes = observacoes;
	}
	
	 // Getters
    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
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

    // Setters
    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
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

	
}
