package Models;

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

public class CadastroMedico extends JPanel{
	
	public CadastroMedico() {
		//PANEL SETTINGS
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setSize(830, 600);
		setMinimumSize(new Dimension(400, 400));
		setPreferredSize(new Dimension(588, 600));
		
		//SECONDARY PANEL SETTINGS
		JPanel secondaryPanel = new JPanel();
		secondaryPanel.setBackground(Theme.BACKGROUND_COLOR);
		
		//TITLE & SUBTITLE SETTINGS
		JLabel title = new JLabel("Cadastro Médico");
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setForeground(Theme.TITLE_COLOR);
		
		JLabel subtitle = new JLabel("Dados pessoais e profissionais");
		subtitle.setHorizontalAlignment(SwingConstants.LEFT);
		subtitle.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		subtitle.setForeground(Theme.TITLE_COLOR);
		
		//LABELS AND INPUTS SETTINGS
		InputLabel nomeLabel = new InputLabel("Nome:*");
		Input nomeInput = new Input();
		
		InputLabel especialidadeLabel = new InputLabel("Especialidade:*");
		Input especialidadeInput = new Input();

		InputLabel crmLabel = new InputLabel("CRM:*");
		Input crmInput = new Input();
		
		InputLabel contatoLabel = new InputLabel("Contato:*");
		Input contatoInput = new Input();
		
		InputLabel valorConsultaLabel = new InputLabel("Valor da consulta particular:*");
		Input valorConsultaInput = new Input();
		
		InputLabel horarioAtendimentoLabel = new InputLabel("Horários de atendimento:*");
		Input horarioAtendimentoInput = new Input();

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
		GroupLayout gl_secondaryPanel = new GroupLayout(secondaryPanel);
		gl_secondaryPanel.setHorizontalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(nomeLabel)
						.addComponent(nomeInput, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
						.addComponent(especialidadeLabel)
						.addComponent(especialidadeInput, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
						.addComponent(crmLabel)
						.addComponent(crmInput, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
						.addComponent(contatoLabel)
						.addComponent(contatoInput, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
						.addComponent(valorConsultaLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addComponent(valorConsultaInput, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
						.addComponent(horarioAtendimentoLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addComponent(horarioAtendimentoInput, GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
					.addGap(24))
		);
		gl_secondaryPanel.setVerticalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel.createSequentialGroup()
					.addGap(11)
					.addComponent(nomeLabel)
					.addGap(11)
					.addComponent(nomeInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(especialidadeLabel)
					.addGap(11)
					.addComponent(especialidadeInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(crmLabel)
					.addGap(11)
					.addComponent(crmInput, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(contatoLabel)
					.addGap(11)
					.addComponent(contatoInput, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(valorConsultaLabel)
					.addGap(11)
					.addComponent(valorConsultaInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(horarioAtendimentoLabel)
					.addGap(11)
					.addComponent(horarioAtendimentoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
		);
		secondaryPanel.setLayout(gl_secondaryPanel);
		setLayout(groupLayout);
	}
}
