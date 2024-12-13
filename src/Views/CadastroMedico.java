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
import Models.Medico;
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
import java.io.IOException;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class CadastroMedico extends JPanel {
	private GoBackButton goBackBtn = new GoBackButton();

	public CadastroMedico() {

		// PANEL SETTINGS
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setSize(730, 600);
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
		JLabel title = new JLabel("Cadastro Médico");
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setForeground(Theme.TITLE_COLOR);

		JLabel subtitle = new JLabel("Dados pessoais e profissionais");
		subtitle.setHorizontalAlignment(SwingConstants.LEFT);
		subtitle.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		subtitle.setForeground(Theme.TITLE_COLOR);

		// LABELS AND INPUTS SETTINGS
		InputLabel nomeLabel = new InputLabel("Nome:*");

		InputLabel crmLabel = new InputLabel("CRM:*");
		Input crmInput = new Input();

		InputLabel especialidadeLabel = new InputLabel("Especialidade:*");
		Input especialidadeInput = new Input();

		InputLabel valorConsultaLabel = new InputLabel("Valor da consulta particular:*");
		Input valorConsultaInput = new Input();

		InputLabel contatoLabel = new InputLabel("Contato:*");
		Input contatoInput = new Input();

		InputLabel horarioAtendimentoLabel = new InputLabel("Horários de atendimento:*");
		Input horarioAtendimentoInput = new Input();

		// SUBMIT BUTTON SETTINGS

		SubmitButton submitBtn = new SubmitButton();
		
		submitBtn.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
	                  // Coletando dados do formulário
                    String nome = nomeInput.getText();
                    String crm = crmInput.getText();
                    String especialidade = especialidadeInput.getText();
                    String valorConsultaText = valorConsultaInput.getText();
                    Double valorConsulta = Double.parseDouble(valorConsultaText);
                    String contato = contatoInput.getText();
                    String horarioAtendimento = horarioAtendimentoInput.getText();

                    // Criando o objeto Médico
                    Medico medico = new Medico(crm, especialidade, nome, horarioAtendimento, contato, valorConsulta);

		            // Salvar no arquivo .txt
		            saveToFile(medico);

		            JOptionPane.showMessageDialog(null, "Dados cadastrados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		            
                    nomeInput.setText("");
                    crmInput.setText("");
                    especialidadeInput.setText("");
                    valorConsultaInput.setText("");
                    contatoInput.setText("");
                    horarioAtendimentoInput.setText("");
		        } catch (Exception ex) {
		            // Exibir mensagem de erro com JOptionPane
		            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados! Confira os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
		            ex.printStackTrace();
		        }
		    }

		    private void saveToFile(Medico medico) throws Exception {
		        // Caminho do arquivo
		        String filePath = "src/Data/medicos.txt";

		        // Abrir o arquivo em modo de escrita
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
		            writer.write(medico.toString());  // Escrever os dados do médico
		            writer.newLine();
		            writer.write("========================================");
		            writer.newLine(); 
		        }
		    }
		});

		ClearButton clearBtn = new ClearButton();
		
		clearBtn.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
                    nomeInput.setText("");
                    crmInput.setText("");
                    especialidadeInput.setText("");
                    valorConsultaInput.setText("");
                    contatoInput.setText("");
                    horarioAtendimentoInput.setText("");
                    }
		        });
		
		//GROUPS
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(27)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(submitBtn, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING)
								.addComponent(title, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
								.addComponent(subtitle)
								.addComponent(secondaryPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
								.addGap(25)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(9)
						.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(title, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE).addGap(6)
						.addComponent(subtitle).addGap(18)
						.addComponent(secondaryPanel, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(submitBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGap(190)));
		GroupLayout gl_secondaryPanel = new GroupLayout(secondaryPanel);
		gl_secondaryPanel.setHorizontalGroup(gl_secondaryPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_secondaryPanel.createSequentialGroup().addGap(5)
						.addComponent(formPanelLeft, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE).addGap(5)
						.addComponent(formPanelRight, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE).addGap(5)));
		gl_secondaryPanel.setVerticalGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel.createSequentialGroup().addGap(5)
						.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(formPanelLeft, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(formPanelRight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(73)));
		GroupLayout gl_formPanelRight = new GroupLayout(formPanelRight);
		gl_formPanelRight.setHorizontalGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight.createSequentialGroup().addGap(10)
						.addGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_formPanelRight.createSequentialGroup()
										.addComponent(horarioAtendimentoInput, GroupLayout.DEFAULT_SIZE, 242,
												Short.MAX_VALUE)
										.addContainerGap())
								.addComponent(valorConsultaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(contatoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(horarioAtendimentoLabel, GroupLayout.PREFERRED_SIZE, 248,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.TRAILING, gl_formPanelRight.createSequentialGroup()
										.addGroup(gl_formPanelRight.createParallelGroup(Alignment.TRAILING)
												.addComponent(contatoInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
														242, Short.MAX_VALUE)
												.addComponent(valorConsultaInput, GroupLayout.DEFAULT_SIZE, 242,
														Short.MAX_VALUE))
										.addContainerGap()))));
		gl_formPanelRight.setVerticalGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight.createSequentialGroup().addGap(11)
						.addComponent(valorConsultaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(valorConsultaInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(contatoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(contatoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(horarioAtendimentoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(horarioAtendimentoInput, GroupLayout.PREFERRED_SIZE, 25,
								GroupLayout.PREFERRED_SIZE)
						.addGap(17)));
		formPanelRight.setLayout(gl_formPanelRight);
		GroupLayout gl_formPanelLeft = new GroupLayout(formPanelLeft);
		gl_formPanelLeft.setHorizontalGroup(gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelLeft.createSequentialGroup().addGap(10).addGroup(gl_formPanelLeft
						.createParallelGroup(Alignment.LEADING)
						.addComponent(especialidadeLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addComponent(crmLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(nomeLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)))
				.addGroup(Alignment.TRAILING,
						gl_formPanelLeft.createSequentialGroup().addContainerGap()
								.addComponent(especialidadeInput, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
								.addContainerGap())
				.addGroup(gl_formPanelLeft.createSequentialGroup().addGap(10)
						.addGroup(gl_formPanelLeft.createParallelGroup(Alignment.TRAILING)
								.addComponent(crmInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 242,
										Short.MAX_VALUE)
								.addComponent(nomeInput, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
						.addContainerGap()));
		gl_formPanelLeft.setVerticalGroup(gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelLeft.createSequentialGroup().addGap(11)
						.addComponent(nomeLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(nomeInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(crmLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(crmInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(especialidadeLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(especialidadeInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(17)));
		formPanelLeft.setLayout(gl_formPanelLeft);
		secondaryPanel.setLayout(gl_secondaryPanel);
		setLayout(groupLayout);
	}

	public GoBackButton getGoBackBtn() {
		return this.goBackBtn;
		// goBackBtn behavior is located at ProgramLayout.java
	}
}
