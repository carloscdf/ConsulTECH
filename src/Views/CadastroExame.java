package Views;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;

import Styles.ClearButton;
import Styles.GoBackButton;
import Styles.Input;
import Styles.InputLabel;
import Styles.SubmitButton;
import Styles.Theme;

public class CadastroExame extends JPanel {
	private GoBackButton goBackBtn = new GoBackButton();

	public CadastroExame() {

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
		JLabel title = new JLabel("Cadastro Exame");
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setForeground(Theme.TITLE_COLOR);

		JLabel subtitle = new JLabel("Dados do exame");
		subtitle.setHorizontalAlignment(SwingConstants.LEFT);
		subtitle.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		subtitle.setForeground(Theme.TITLE_COLOR);

		// LABELS AND INPUTS SETTINGS
		InputLabel nomeLabel = new InputLabel("Nome:*");

		InputLabel descricaoLabel = new InputLabel("CRM:*");
		descricaoLabel.setText("Descrição:*");
		Input descricaoInput = new Input();

		InputLabel tipoLabel = new InputLabel("Especialidade:*");
		tipoLabel.setText("Tipo de exame:*");
		Input tipoInput = new Input();

		InputLabel valorConsultaLabel = new InputLabel("Valor da consulta particular:*");
		Input valorConsultaInput = new Input();

		InputLabel materiaisLabel = new InputLabel("Contato:*");
		materiaisLabel.setText("Materiais utilizados:*");
		Input materiaisInput = new Input();

		InputLabel médicoInput = new InputLabel("Horários de atendimento:*");
		médicoInput.setText("Médico:*");
		Input horarioAtendimentoInput = new Input();

		// SUBMIT BUTTON SETTINGS

		SubmitButton submitBtn = new SubmitButton();

		ClearButton clearBtn = new ClearButton();
		
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
								.addComponent(materiaisLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(médicoInput, GroupLayout.PREFERRED_SIZE, 248,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.TRAILING, gl_formPanelRight.createSequentialGroup()
										.addGroup(gl_formPanelRight.createParallelGroup(Alignment.TRAILING)
												.addComponent(materiaisInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
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
						.addComponent(materiaisLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(materiaisInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(médicoInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(horarioAtendimentoInput, GroupLayout.PREFERRED_SIZE, 25,
								GroupLayout.PREFERRED_SIZE)
						.addGap(17)));
		formPanelRight.setLayout(gl_formPanelRight);
		GroupLayout gl_formPanelLeft = new GroupLayout(formPanelLeft);
		gl_formPanelLeft.setHorizontalGroup(gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelLeft.createSequentialGroup().addGap(10).addGroup(gl_formPanelLeft
						.createParallelGroup(Alignment.LEADING)
						.addComponent(tipoLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
						.addComponent(descricaoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(nomeLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)))
				.addGroup(Alignment.TRAILING,
						gl_formPanelLeft.createSequentialGroup().addContainerGap()
								.addComponent(tipoInput, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
								.addContainerGap())
				.addGroup(gl_formPanelLeft.createSequentialGroup().addGap(10)
						.addGroup(gl_formPanelLeft.createParallelGroup(Alignment.TRAILING)
								.addComponent(descricaoInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 242,
										Short.MAX_VALUE)
								.addComponent(nomeInput, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
						.addContainerGap()));
		gl_formPanelLeft.setVerticalGroup(gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelLeft.createSequentialGroup().addGap(11)
						.addComponent(nomeLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(nomeInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(descricaoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10).addComponent(descricaoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(tipoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(tipoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
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
