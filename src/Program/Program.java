package Program;

import java.awt.Dimension;

import javax.swing.JFrame;

import Models.ProgramLayout;
import Views.Consulta;
import Views.Medico;
import Views.Paciente;

public class Program extends JFrame {
	public Program() {
	}

	public static void main(String[] args) {
		String title = "ConsulTECH - Sistema de Gerenciamento Clínico";

		JFrame mainFrame = new JFrame(); // the main frame
		ProgramLayout mainPage = new ProgramLayout(); // the main page

		mainFrame.getContentPane().add(mainPage); // setting the main page on the main frame
		mainFrame.setVisible(true); // setting them visible
		// MAIN FRAME STYLES
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setSize(850, 650);
		mainFrame.setMinimumSize(new Dimension(750, 650));
		mainFrame.setTitle(title);

		//TERMINAL PRINT ONLY
		Medico medico1 = new Medico("123456-SP", "Ortopedista", "Segunda a Sexta, 08:00 - 18:00",
				"Dr. José Carlos Almeida", "12/05/1975", "M12345");
		Medico medico2 = new Medico("122457-SP", "Cardiologia", "Segunda a Sexta, 08:00 - 18:00", "Dr. Antonio Gomes",
				"12/05/1980", "M54321");
		Paciente pessoa1 = new Paciente("Carlos", "45355000", "18/12/2004", "739986540", "O+", 1.65, 70,
				"Av José Novais", "Centro", 62, "45355000", "Apuarema", "Bahia");
		Consulta consulta = new Consulta("15/11/2024", "10:30", medico1, pessoa1, "Dor no joelho", "Exame de rotina",
				"Nenhuma observação adicional");
		Consulta consulta2 = new Consulta("16/12/2024", "11:30", medico2, pessoa1, "Dor no coração", "Exame de rotina",
				"Nenhuma observação adicional");

		pessoa1.setHistoricoMedico(consulta);
		pessoa1.setHistoricoMedico(consulta2);

		consulta.setConvenio(pessoa1.getConvenio());
		consulta2.setConvenio(pessoa1.getConvenio());

		// Imprimir os dados básicos do paciente
		System.out.println("Dados do Paciente:");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("CPF: " + pessoa1.getCPF());
		System.out.println("Convenio: " + pessoa1.getConvenio());
		System.out.println("Data de Nascimento: " + pessoa1.getDataNascimento());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		System.out.println("Tipo Sanguíneo: " + pessoa1.getTipoSanguineo());
		System.out.println("Altura: " + pessoa1.getAltura());
		System.out.println("Peso: " + pessoa1.getPeso());
		System.out.println(
				"Endereço: " + pessoa1.getLogradouro() + ", " + pessoa1.getBairro() + ", " + pessoa1.getNumero() + ", "
						+ pessoa1.getCep() + ", " + pessoa1.getCidade() + ", " + pessoa1.getEstado());
		System.out.println("--------------------------------------------");

		// Imprimir o histórico médico do paciente
		System.out.println("Histórico Médico do Paciente:");
		if (pessoa1.getHistoricoMedico().isEmpty()) {
			System.out.println("Nenhuma consulta registrada.");
		} else {
			for (Consulta consulta1 : pessoa1.getHistoricoMedico()) {
				System.out.println("Data da Consulta: " + consulta1.getData());
				System.out.println("Hora: " + consulta1.getHora());
				System.out.println("Médico: " + consulta1.getMedico().getNome());
				System.out.println("Especialidade: " + consulta1.getMedico().getEspecialidade());
				System.out.println("Queixa: " + consulta1.getQueixaPaciente());
				System.out.println("Tipo de Consulta: " + consulta1.getTipoConsulta());
				System.out.println("Observações: " + consulta1.getObservacoes());
				System.out.println("--------------------------------------------");
			}
		}

	}

}