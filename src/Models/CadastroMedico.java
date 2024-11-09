package Models;

import Styles.ActionButton;
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
		setPreferredSize(new Dimension(588, 435));
		
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
		JLabel nomeLabel = new JLabel("Nome:*");
		nomeLabel.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		nomeLabel.setForeground(Theme.TEXT_COLOR);
		
		JTextField nomeInput = new JTextField();
		nomeInput.setFont(new Font("Inter", Font.PLAIN, 12));
		nomeInput.setColumns(Theme.COLUMNS_QTD);
		nomeInput.setPreferredSize(new Dimension(nomeInput.getWidth(),25));
		
		JLabel especialidadeLabel = new JLabel("Especialidade:*");
		especialidadeLabel.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		especialidadeLabel.setForeground(Theme.TEXT_COLOR);
		
		JTextField especialidadeInput = new JTextField();
		especialidadeInput.setPreferredSize(new Dimension(especialidadeInput.getWidth(), 25));
		especialidadeInput.setFont(new Font("Inter", Font.PLAIN, 12));
		especialidadeInput.setColumns(Theme.COLUMNS_QTD);
		
		JLabel crmLabel = new JLabel("CRM:*");
		crmLabel.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		crmLabel.setForeground(Theme.TEXT_COLOR);
		
		JTextField crmInput = new JTextField();
		crmInput.setPreferredSize(new Dimension(especialidadeInput.getWidth(), 25));
		crmInput.setFont(new Font("Inter", Font.PLAIN, 12));
		crmInput.setColumns(Theme.COLUMNS_QTD);
		
		JLabel contatoLabel = new JLabel("Contato:*");
		contatoLabel.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		contatoLabel.setForeground(Theme.TEXT_COLOR);
		
		JTextField contatoInput = new JTextField();
		contatoInput.setPreferredSize(new Dimension(especialidadeInput.getWidth(), 25));
		contatoInput.setFont(new Font("Inter", Font.PLAIN, 12));
		contatoInput.setColumns(Theme.COLUMNS_QTD);
		
		JLabel valorConsultaLabel = new JLabel("Valor da consulta particular:*");
		valorConsultaLabel.setForeground(new Color(19, 30, 78));
		valorConsultaLabel.setFont(new Font("Inter", Font.PLAIN, 16));
		
		JTextField valorConsultaInput = new JTextField();
		valorConsultaInput.setPreferredSize(new Dimension(343, 25));
		valorConsultaInput.setFont(new Font("Inter", Font.PLAIN, 12));
		valorConsultaInput.setColumns(27);
		
		JLabel horarioAtendimentoLabel = new JLabel("Horários de atendimento:*");
		horarioAtendimentoLabel.setForeground(new Color(19, 30, 78));
		horarioAtendimentoLabel.setFont(new Font("Inter", Font.PLAIN, 16));
		
		JTextField horarioAtendimentoInput = new JTextField();
		horarioAtendimentoInput.setPreferredSize(new Dimension(343, 25));
		horarioAtendimentoInput.setFont(new Font("Inter", Font.PLAIN, 12));
		horarioAtendimentoInput.setColumns(27);

		//SUBMIT BUTTON SETTINGS
		
		ActionButton submit = new ActionButton();
		submit.setText("Salvar");
		submit.setSize(200,100);
		submit.setEnabled(false);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		
		//GROUPS
		GroupLayout gl_secondaryPanel = new GroupLayout(secondaryPanel);
		gl_secondaryPanel.setHorizontalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addComponent(nomeLabel)
							.addGap(200)
							.addComponent(especialidadeInput, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addComponent(especialidadeLabel)
							.addGap(140)
							.addComponent(nomeInput, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addComponent(crmLabel)
							.addGap(209)
							.addComponent(crmInput, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addComponent(contatoLabel)
							.addGap(185)
							.addComponent(contatoInput, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addComponent(valorConsultaLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(valorConsultaInput, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addComponent(horarioAtendimentoLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(horarioAtendimentoInput, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
					.addGap(26))
		);
		gl_secondaryPanel.setVerticalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(nomeLabel))
						.addComponent(especialidadeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(especialidadeLabel))
						.addComponent(nomeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(crmLabel))
						.addComponent(crmInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(contatoLabel))
						.addComponent(contatoInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(valorConsultaLabel))
						.addComponent(valorConsultaInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_secondaryPanel.createSequentialGroup()
							.addGap(2)
							.addComponent(horarioAtendimentoLabel))
						.addComponent(horarioAtendimentoInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		secondaryPanel.setLayout(gl_secondaryPanel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(submit, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addComponent(title, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(subtitle)
						.addComponent(secondaryPanel, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
					.addGap(19))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(subtitle)
					.addGap(18)
					.addComponent(secondaryPanel, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		setLayout(groupLayout);
	}
}
