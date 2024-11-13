package Views;

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

public class GerenciarConsultaActions extends JPanel {
	private HomePageActionButton cadastroPaciente = new HomePageActionButton();
	private HomePageActionButton cadastroConsulta = new HomePageActionButton();
	public GerenciarConsultaActions() {
		//PANEL SETTINGS
		setSize(830, 600);
		setMinimumSize(new Dimension(400, 400));
		setPreferredSize(new Dimension(588, 400));
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Inter", Font.PLAIN, 12));
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		//DECLARING COMPONENTS
		JLabel title = new JLabel("Gerenciamento de Consultas");

		//COMPONENT SETTINGS
		title.setPreferredSize(new Dimension(1000,50));
		title.setForeground(Theme.TITLE_COLOR);
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		cadastroPaciente.setPreferredSize(new Dimension(220,170));
		cadastroPaciente.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.cadastroPaciente)));
		
		cadastroConsulta.setPreferredSize(new Dimension(220,170));
		cadastroConsulta.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.cadastroConsulta)));
		
		
		//Adding components to panel
		add(title);
		add(cadastroPaciente);
		add(cadastroConsulta);

	}
	
	public HomePageActionButton getCadastroPaciente() {
		return cadastroPaciente;
	}
	
	public HomePageActionButton getCadastroConsulta() {
		return cadastroConsulta;
	}
	
}
