package Views;

import Styles.ActionButton;
import Styles.Input;
import Styles.InputLabel;
import Styles.HomePageActionButton;
import Styles.Theme;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;

public class CadastroPaciente extends JPanel{
	
	public CadastroPaciente() {
		//PANEL SETTINGS
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setSize(830, 600);
		setMinimumSize(new Dimension(400, 400));
		setPreferredSize(new Dimension(588, 600));
		
		//SECONDARY PANEL SETTINGS
		JPanel secondaryPanel = new JPanel();
		secondaryPanel.setBackground(Theme.BACKGROUND_COLOR);
		
		//TITLE & SUBTITLE SETTINGS
		JLabel title = new JLabel("Cadastro Paciente");
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setForeground(Theme.TITLE_COLOR);
		
		JLabel subtitle = new JLabel("Dados pessoais");
		subtitle.setHorizontalAlignment(SwingConstants.LEFT);
		subtitle.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		subtitle.setForeground(Theme.TITLE_COLOR);
		
		//LABELS AND INPUTS SETTINGS
		InputLabel nomeLabel = new InputLabel("Nome:*");
		nomeLabel.setBounds(20, 11, 58, 20);
		Input nomeInput = new Input();
		nomeInput.setBounds(20, 42, 494, 25);
		
		InputLabel especialidadeLabel = new InputLabel("Data de Nascimento:*");
		especialidadeLabel.setBounds(20, 78, 166, 20);
		Input especialidadeInput = new Input();
		especialidadeInput.setBounds(20, 109, 494, 25);

		InputLabel crmLabel = new InputLabel("CRM:*");
		crmLabel.setBounds(20, 145, 49, 20);
		Input crmInput = new Input();
		crmInput.setBounds(20, 176, 494, 21);
		
		InputLabel contatoLabel = new InputLabel("Contato:*");
		contatoLabel.setBounds(20, 208, 73, 20);
		Input contatoInput = new Input();
		contatoInput.setBounds(20, 239, 494, 21);
		
		InputLabel valorConsultaLabel = new InputLabel("Valor da consulta particular:*");
		valorConsultaLabel.setBounds(20, 271, 248, 20);
		Input valorConsultaInput = new Input();
		valorConsultaInput.setBounds(20, 302, 494, 25);
		
		InputLabel horarioAtendimentoLabel = new InputLabel("Horários de atendimento:*");
		horarioAtendimentoLabel.setBounds(20, 338, 248, 20);
		Input horarioAtendimentoInput = new Input();
		horarioAtendimentoInput.setBounds(20, 369, 494, 25);

		//SUBMIT BUTTON SETTINGS
		
		ActionButton submit = new ActionButton();
		submit.setText("Salvar");
		submit.setSize(200,100);
		submit.setEnabled(false);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		//GROUPS AND LAYOUT STRUCTURE
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(submit, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(title, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(subtitle)
						.addComponent(secondaryPanel, GroupLayout.PREFERRED_SIZE, 538, Short.MAX_VALUE))
					.addGap(23))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(subtitle)
					.addGap(18)
					.addComponent(secondaryPanel, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		secondaryPanel.setLayout(null);
		secondaryPanel.add(nomeLabel);
		secondaryPanel.add(nomeInput);
		secondaryPanel.add(especialidadeLabel);
		secondaryPanel.add(especialidadeInput);
		secondaryPanel.add(crmLabel);
		secondaryPanel.add(crmInput);
		secondaryPanel.add(contatoLabel);
		secondaryPanel.add(contatoInput);
		secondaryPanel.add(valorConsultaLabel);
		secondaryPanel.add(valorConsultaInput);
		secondaryPanel.add(horarioAtendimentoLabel);
		secondaryPanel.add(horarioAtendimentoInput);
		setLayout(groupLayout);
	}
}
