package Views;

import Styles.ActionButton;
import Styles.ClearButton;
import Styles.GoBackButton;
import Styles.Input;
import Styles.InputLabel;
import Styles.SubmitButton;
import Styles.HomePageActionButton;
import Styles.Theme;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Models.Endereco;
import Models.Paciente;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class CadastroPaciente extends JPanel{
	private GoBackButton goBackBtn = new GoBackButton();

	public CadastroPaciente() {

		// PANEL SETTINGS
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setSize(730, 800);
		setMinimumSize(new Dimension(400, 400));

		// DECLARING VIEWS
		GerenciarFuncionarioActions gerenciarFuncionarios = new GerenciarFuncionarioActions();
		
		// SECONDARY PANEL SETTINGS
		JPanel secondaryPanel = new JPanel();
		secondaryPanel.setBackground(Theme.BACKGROUND_COLOR);
		secondaryPanel.setBorder(BorderFactory.createLineBorder(Theme.LIGHT_BORDER_COLOR));

		
		//LEFT AND RIGHT INPUT PANELS SETTINGS
		JPanel formPanelLeft = new JPanel();
		formPanelLeft.setBackground(Theme.BACKGROUND_COLOR);
		formPanelLeft.setPreferredSize(new Dimension(269, 213));
		Input nomeInput = new Input();
		
		JPanel formPanelRight = new JPanel();
		formPanelRight.setBackground(Theme.BACKGROUND_COLOR);
		formPanelRight.setPreferredSize(new Dimension(269, 213));
		
		// TITLE & SUBTITLE SETTINGS
		JLabel title = new JLabel("Cadastro Paciente");
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setForeground(Theme.TITLE_COLOR);

		JLabel subtitle = new JLabel("Dados pessoais e clínicos");
		subtitle.setHorizontalAlignment(SwingConstants.LEFT);
		subtitle.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		subtitle.setForeground(Theme.TITLE_COLOR);
		
		// LABELS AND INPUTS SETTINGS
		InputLabel nomeLabel = new InputLabel("Nome:*");

		InputLabel dataNascimentoLabel = new InputLabel("");
		dataNascimentoLabel.setText("Data de nascimento:*");
		Input dataNascimentoInput = new Input();

		InputLabel telefoneLabel = new InputLabel("");
		telefoneLabel.setText("Telefone:*");
		Input telefoneInput = new Input();

		InputLabel historicoMedicoLabel = new InputLabel("");
		historicoMedicoLabel.setText("Historico médico:*");
		Input historicoMedicoInput = new Input();

		InputLabel alturaLabel = new InputLabel("Altura:*");
		Input alturaInput = new Input();
		
		Input pesoInput = new Input();
		InputLabel pesoLabel = new InputLabel("Peso:*");
		
		InputLabel tipoSanguineoLabel = new InputLabel("");
		tipoSanguineoLabel.setText("Tipo sanguíneo:*");
		Input tipoSanguineoInput = new Input();
		
		InputLabel convenioLabel = new InputLabel("");
		convenioLabel.setText("Convênio:*");
		Input convenioInput = new Input();
		
		JPanel secondaryPanel_1 = new JPanel();
		secondaryPanel_1.setBorder(BorderFactory.createLineBorder(Theme.LIGHT_BORDER_COLOR));
		secondaryPanel_1.setBackground(Color.WHITE);
		
		JPanel formPanelLeft_1 = new JPanel();
		formPanelLeft_1.setPreferredSize(new Dimension(269, 213));
		formPanelLeft_1.setBackground(Color.WHITE);
		
		Input numeroInput = new Input();
		
		InputLabel numeroLabel = new InputLabel("Especialidade:*");
		numeroLabel.setText("Número:*");
		
		Input bairroInput = new Input();
		
		InputLabel bairroLabel = new InputLabel("CRM:*");
		bairroLabel.setText("Bairro:*");
		
		Input logradouroInput = new Input();
		
		InputLabel logradouroLabel = new InputLabel("Nome:*");
		logradouroLabel.setText("Logradouro:*");
		GroupLayout gl_formPanelLeft_1 = new GroupLayout(formPanelLeft_1);
		gl_formPanelLeft_1.setHorizontalGroup(
			gl_formPanelLeft_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 338, Short.MAX_VALUE)
				.addGroup(gl_formPanelLeft_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_formPanelLeft_1.createParallelGroup(Alignment.LEADING)
						.addComponent(numeroInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(numeroLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addComponent(bairroInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(bairroLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(logradouroInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(logradouroLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_formPanelLeft_1.setVerticalGroup(
			gl_formPanelLeft_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 288, Short.MAX_VALUE)
				.addGroup(gl_formPanelLeft_1.createSequentialGroup()
					.addGap(11)
					.addComponent(logradouroLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(logradouroInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(bairroLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(bairroInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(numeroLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(numeroInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(92))
		);
		formPanelLeft_1.setLayout(gl_formPanelLeft_1);
		
		JPanel formPanelRight_1 = new JPanel();
		formPanelRight_1.setPreferredSize(new Dimension(269, 213));
		formPanelRight_1.setBackground(Color.WHITE);
		
		InputLabel cepLabel = new InputLabel("Contato:*");
		cepLabel.setText("CEP:*");
		
		Input cepInput = new Input();
		
		InputLabel cidadeLabel = new InputLabel("Contato:*");
		cidadeLabel.setText("Cidade:*");
		
		Input cidadeInput = new Input();
		
		Input estadoInput = new Input();
		
		InputLabel estadoLabel = new InputLabel("Contato:*");
		estadoLabel.setText("Estado:*");
		GroupLayout gl_formPanelRight_1 = new GroupLayout(formPanelRight_1);
		gl_formPanelRight_1.setHorizontalGroup(
			gl_formPanelRight_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_formPanelRight_1.createParallelGroup(Alignment.LEADING)
						.addComponent(cepLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cepInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
					.addGap(10))
				.addGroup(gl_formPanelRight_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_formPanelRight_1.createParallelGroup(Alignment.LEADING)
						.addComponent(cidadeLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
						.addComponent(cidadeInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
					.addGap(10))
				.addGroup(gl_formPanelRight_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_formPanelRight_1.createParallelGroup(Alignment.LEADING)
						.addComponent(estadoLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
						.addComponent(estadoInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_formPanelRight_1.setVerticalGroup(
			gl_formPanelRight_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(cepLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(cepInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cidadeLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(cidadeInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(estadoLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(estadoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		formPanelRight_1.setLayout(gl_formPanelRight_1);
		GroupLayout gl_secondaryPanel_1 = new GroupLayout(secondaryPanel_1);
		gl_secondaryPanel_1.setHorizontalGroup(
			gl_secondaryPanel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_secondaryPanel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(formPanelLeft_1, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(formPanelRight_1, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_secondaryPanel_1.setVerticalGroup(
			gl_secondaryPanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel_1.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_secondaryPanel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(formPanelLeft_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(formPanelRight_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		secondaryPanel_1.setLayout(gl_secondaryPanel_1);
		
		ClearButton clearBtn = new ClearButton();
		
		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					nomeInput.setText("");
		            dataNascimentoInput.setText("");
		            telefoneInput.setText("");
		            historicoMedicoInput.setText("");  // Histórico médico como texto
		            alturaInput.setText("");
		            pesoInput.setText("");
		            tipoSanguineoInput.setText("");
		            convenioInput.setText("");
		           
		            // setar os dados do endereço
		            numeroInput.setText("");
		            bairroInput.setText("");
		            logradouroInput.setText("");
		            cepInput.setText("");
		            cidadeInput.setText("");
		            estadoInput.setText("");
			}
		});
		
		
		SubmitButton submitBtn = new SubmitButton();
		
		submitBtn.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            // Capturar os dados do paciente
		            String nome = nomeInput.getText();
		            String dataNascimento = dataNascimentoInput.getText();
		            String telefone = telefoneInput.getText();
		            String historicoMedicoText = historicoMedicoInput.getText();  // Histórico médico como texto
		            String alturaText = alturaInput.getText();
		            double altura = Double.parseDouble(alturaText);  // Converter altura para double
		            String pesoText = pesoInput.getText();
		            double peso = Double.parseDouble(pesoText);  // Converter peso para double
		            String tipoSanguineo = tipoSanguineoInput.getText();
		            String convenio = convenioInput.getText();
		            
		            
		            // Capturar os dados do endereço
		            String numero = numeroInput.getText();
		            String bairro = bairroInput.getText();
		            String logradouro = logradouroInput.getText();
		            String cep = cepInput.getText();
		            String cidade = cidadeInput.getText();
		            String estado = estadoInput.getText();
		            

		            // Criar o objeto Endereco
		            Endereco endereco = new Endereco(logradouro, bairro, Integer.parseInt(numero), cep, cidade, estado);

		            // Criar o objeto Paciente e adicionar histórico médico
		            Paciente paciente = new Paciente(nome, dataNascimento, telefone, tipoSanguineo, altura, peso, logradouro, bairro, Integer.parseInt(numero), cep, cidade, estado, convenio);
		            paciente.setHistoricoMedico(historicoMedicoText);  // Adicionando histórico médico

		            // Salvar no arquivo .txt
		            saveToFile(paciente);

		            JOptionPane.showMessageDialog(null, "Dados cadastrados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
					nomeInput.setText("");
		            dataNascimentoInput.setText("");
		            telefoneInput.setText("");
		            historicoMedicoInput.setText("");  // Histórico médico como texto
		            alturaInput.setText("");
		            pesoInput.setText("");
		            tipoSanguineoInput.setText("");
		            convenioInput.setText("");
		           
		            // setar os dados do endereço
		            numeroInput.setText("");
		            bairroInput.setText("");
		            logradouroInput.setText("");
		            cepInput.setText("");
		            cidadeInput.setText("");
		            estadoInput.setText("");
		        } catch (Exception ex) {
		            // Exibir mensagem de erro com JOptionPane
		            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados! Confira os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
		            ex.printStackTrace();
		        }
		    }

		    private void saveToFile(Paciente paciente) throws Exception {
		        // Caminho do arquivo
		        String filePath = "src/Data/pacientes.txt";

		        // Abrir o arquivo em modo de escrita
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
		            writer.write(paciente.toString());  // Escrever os dados do paciente
		            writer.newLine();
		            writer.write("========================================");
		            writer.newLine(); 
		        }
		    }
		});
		
		//GROUPS
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(secondaryPanel, GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(title, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
								.addComponent(subtitle))
							.addPreferredGap(ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
							.addComponent(submitBtn, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(secondaryPanel_1, GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
							.addGap(0)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(title, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(subtitle)
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(submitBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addComponent(secondaryPanel, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(secondaryPanel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(129, Short.MAX_VALUE))
		);
		GroupLayout gl_secondaryPanel = new GroupLayout(secondaryPanel);
		gl_secondaryPanel.setHorizontalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_secondaryPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(formPanelLeft, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(formPanelRight, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_secondaryPanel.setVerticalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_secondaryPanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(formPanelRight, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
						.addComponent(formPanelLeft, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		
		
		GroupLayout gl_formPanelRight = new GroupLayout(formPanelRight);
		gl_formPanelRight.setHorizontalGroup(
			gl_formPanelRight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
						.addComponent(historicoMedicoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(historicoMedicoInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addGroup(gl_formPanelRight.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(alturaLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(alturaInput, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
								.addComponent(pesoLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoInput, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
						.addComponent(tipoSanguineoLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
						.addComponent(tipoSanguineoInput, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_formPanelRight.setVerticalGroup(
			gl_formPanelRight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight.createSequentialGroup()
					.addContainerGap()
					.addComponent(historicoMedicoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(historicoMedicoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addComponent(alturaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(alturaInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addComponent(pesoLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(pesoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tipoSanguineoLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tipoSanguineoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(127, Short.MAX_VALUE))
		);
		formPanelRight.setLayout(gl_formPanelRight);
		

		GroupLayout gl_formPanelLeft = new GroupLayout(formPanelLeft);
		gl_formPanelLeft.setHorizontalGroup(
			gl_formPanelLeft.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_formPanelLeft.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
						.addComponent(telefoneInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(telefoneLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addComponent(dataNascimentoInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(dataNascimentoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(nomeInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(nomeLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(convenioLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(convenioInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_formPanelLeft.setVerticalGroup(
			gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelLeft.createSequentialGroup()
					.addGap(11)
					.addComponent(nomeLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(nomeInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(dataNascimentoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(dataNascimentoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(telefoneLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(telefoneInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(convenioLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(convenioInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
		);
		formPanelLeft.setLayout(gl_formPanelLeft);
		secondaryPanel.setLayout(gl_secondaryPanel);
		setLayout(groupLayout);
	}

	public GoBackButton getGoBackBtn() {
		return this.goBackBtn;
		// goBackBtn behavior is located at ProgramLayout.java
	}
}
