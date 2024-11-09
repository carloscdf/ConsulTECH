package Models;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Insets;

import Styles.HomePageActionButton;
import Styles.Icons;
import Styles.Theme;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

//FILE THAT CONTAINS ALL BUTTONS AND ACTIONS OF THE MAIN PAGE MAIN AREA

public class GerenciarFuncionarioActions extends JPanel {
	public GerenciarFuncionarioActions() {
		//PANEL SETTINGS
		setSize(830, 600);
		setMinimumSize(new Dimension(400, 400));
		setPreferredSize(new Dimension(588, 400));
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Inter", Font.PLAIN, 12));
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		//DECLARING COMPONENTS
		JLabel title = new JLabel("Gerenciamento de Funcionários");
		HomePageActionButton cadastroMedico = new HomePageActionButton();
		HomePageActionButton cadastroEnfermeiro = new HomePageActionButton();
		HomePageActionButton cadastroOutrosFuncionarios = new HomePageActionButton();
		HomePageActionButton funcionariosCadastrados = new HomePageActionButton();

		//COMPONENT SETTINGS
		title.setPreferredSize(new Dimension(1000,50));
		title.setForeground(Theme.TITLE_COLOR);
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		cadastroMedico.setPreferredSize(new Dimension(220,170));
		cadastroMedico.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.cadastroMedico)));
		
		cadastroEnfermeiro.setPreferredSize(new Dimension(220,170));
		cadastroEnfermeiro.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.cadastroEnfermeiro)));
		cadastroEnfermeiro.setEnabled(false);
		
		cadastroOutrosFuncionarios.setPreferredSize(new Dimension(220,170));
		cadastroOutrosFuncionarios.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.cadastroOutrosFuncionarios)));
		cadastroOutrosFuncionarios.setEnabled(false);
		
		funcionariosCadastrados.setPreferredSize(new Dimension(220,170));
		funcionariosCadastrados.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.funcionariosCadastrados)));
		funcionariosCadastrados.setEnabled(false);
		
		//Adding components to panel
		add(title);
		add(cadastroMedico);
		add(cadastroEnfermeiro);
		add(cadastroOutrosFuncionarios);
		add(funcionariosCadastrados);

		
	}
}
