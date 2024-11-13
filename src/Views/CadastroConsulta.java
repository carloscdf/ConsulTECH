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
import javax.swing.SwingConstants;
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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class CadastroConsulta extends JPanel {
	private GoBackButton goBackBtn = new GoBackButton();

	public CadastroConsulta() {

		// PANEL SETTINGS
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setSize(750, 600);
		setMinimumSize(new Dimension(400, 400));

		// DECLARING VIEWS
		GerenciarFuncionarioActions gerenciarFuncionarios = new GerenciarFuncionarioActions();
		
		// SECONDARY PANEL SETTINGS
		JPanel secondaryPanel =  new JPanel();
		secondaryPanel.setBackground(Theme.BACKGROUND_COLOR);
		secondaryPanel.setBorder(BorderFactory.createLineBorder(Theme.LIGHT_BORDER_COLOR));

		
		//LEFT AND RIGHT INPUT PANELS SETTINGS
		JPanel formPanelLeft = new JPanel();
		formPanelLeft.setBackground(Theme.BACKGROUND_COLOR);
		formPanelLeft.setPreferredSize(new Dimension(269, 213));
		Input dataInput = new Input();
		
		JPanel formPanelRight = new JPanel();
		formPanelRight.setBackground(Theme.BACKGROUND_COLOR);
		formPanelRight.setPreferredSize(new Dimension(269, 213));
		
		// TITLE & SUBTITLE SETTINGS
		JLabel title = new JLabel("Cadastro Consulta");
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setForeground(Theme.TITLE_COLOR);

		JLabel subtitle = new JLabel("Dados da consulta");
		subtitle.setHorizontalAlignment(SwingConstants.LEFT);
		subtitle.setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		subtitle.setForeground(Theme.TITLE_COLOR);

		// LABELS AND INPUTS SETTINGS
		InputLabel dataLabel = new InputLabel("Nome:*");
		dataLabel.setText("Data:*");

		InputLabel horaLabel = new InputLabel("CRM:*");
		horaLabel.setText("Hora:*");
		Input horaInput = new Input();

		InputLabel medicoLabel = new InputLabel("Especialidade:*");
		medicoLabel.setText("Médico:*");
		Input medicoInput = new Input();

		InputLabel tipoLabel = new InputLabel("Valor da consulta particular:*");
		tipoLabel.setText("Tipo de consulta:*");
		Input tipoInput = new Input();

		InputLabel convenioLabel = new InputLabel("Contato:*");
		convenioLabel.setText("Convênio:*");
		Input convenioInput = new Input();

		InputLabel observacoesLabel = new InputLabel("Horários de atendimento:*");
		observacoesLabel.setText("Observações:");

		// SUBMIT BUTTON SETTINGS

		SubmitButton submitBtn = new SubmitButton();

		ClearButton clearBtn = new ClearButton();
		
		InputLabel materialUtilizadoLabel = new InputLabel("Horários de atendimento:*");
		materialUtilizadoLabel.setText("Material utilizado:");
		
		Input materialUtilizadoInput = new Input();
		
		ClearButton materialUtilizadoSubmit = new ClearButton();
		materialUtilizadoSubmit.setText("Salvar");
		
		Input observacoesInput = new Input();
		GroupLayout gl_formPanelRight = new GroupLayout(formPanelRight);
		gl_formPanelRight.setHorizontalGroup(
			gl_formPanelRight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight.createSequentialGroup()
					.addGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_formPanelRight.createParallelGroup(Alignment.LEADING)
								.addComponent(convenioLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(observacoesLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
								.addComponent(tipoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addContainerGap()
							.addComponent(materialUtilizadoLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addContainerGap()
							.addComponent(materialUtilizadoInput, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(materialUtilizadoSubmit, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_formPanelRight.createParallelGroup(Alignment.TRAILING)
								.addComponent(convenioInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
								.addComponent(tipoInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
							.addGap(17))
						.addGroup(gl_formPanelRight.createSequentialGroup()
							.addContainerGap()
							.addComponent(observacoesInput, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
							.addGap(17)))
					.addGap(0))
		);
		gl_formPanelRight.setVerticalGroup(
			gl_formPanelRight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelRight.createSequentialGroup()
					.addGap(11)
					.addComponent(tipoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tipoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(convenioLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(convenioInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(observacoesLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(observacoesInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(materialUtilizadoLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_formPanelRight.createParallelGroup(Alignment.BASELINE)
						.addComponent(materialUtilizadoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(materialUtilizadoSubmit, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(23))
		);
		formPanelRight.setLayout(gl_formPanelRight);
		
		InputLabel pacienteLabel = new InputLabel("Especialidade:*");
		pacienteLabel.setText("Paciente:*");
		
		Input pacienteInput = new Input();
		
		InputLabel queixaLabel = new InputLabel("Especialidade:*");
		queixaLabel.setText("Queixa do paciente:*");
		
		Input queixaInput = new Input();
		GroupLayout gl_formPanelLeft = new GroupLayout(formPanelLeft);
		gl_formPanelLeft.setHorizontalGroup(
			gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelLeft.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_formPanelLeft.createSequentialGroup()
							.addComponent(dataInput, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(horaInput, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_formPanelLeft.createSequentialGroup()
							.addComponent(dataLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(122)
							.addComponent(horaLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(108))
						.addGroup(gl_formPanelLeft.createSequentialGroup()
							.addGroup(gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
								.addComponent(medicoLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_formPanelLeft.createSequentialGroup()
									.addComponent(pacienteInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
									.addGap(10))
								.addGroup(gl_formPanelLeft.createSequentialGroup()
									.addComponent(pacienteLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 80, GroupLayout.PREFERRED_SIZE))
								.addComponent(medicoInput, GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
							.addGap(0))
						.addGroup(gl_formPanelLeft.createSequentialGroup()
							.addComponent(queixaLabel, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(80, Short.MAX_VALUE))
						.addGroup(gl_formPanelLeft.createSequentialGroup()
							.addComponent(queixaInput, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_formPanelLeft.setVerticalGroup(
			gl_formPanelLeft.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formPanelLeft.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_formPanelLeft.createParallelGroup(Alignment.BASELINE)
						.addComponent(dataLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(horaLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_formPanelLeft.createParallelGroup(Alignment.BASELINE)
						.addComponent(dataInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(horaInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(medicoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(medicoInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pacienteLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pacienteInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(queixaLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(queixaInput, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(15))
		);
		formPanelLeft.setLayout(gl_formPanelLeft);
		GroupLayout gl_secondaryPanel = new GroupLayout(secondaryPanel);
		gl_secondaryPanel.setHorizontalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(formPanelLeft, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addGap(15)
					.addComponent(formPanelRight, GroupLayout.PREFERRED_SIZE, 330, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_secondaryPanel.setVerticalGroup(
			gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_secondaryPanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_secondaryPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(formPanelRight, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)
						.addComponent(formPanelLeft, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		secondaryPanel.setLayout(gl_secondaryPanel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(title, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(subtitle)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(submitBtn, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
						.addComponent(secondaryPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(23))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(9)
					.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(subtitle)
					.addGap(18)
					.addComponent(secondaryPanel, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(submitBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))
		);
		setLayout(groupLayout);
	}

	public GoBackButton getGoBackBtn() {
		return this.goBackBtn;
		// goBackBtn behavior is located at ProgramLayout.java
	}
}
