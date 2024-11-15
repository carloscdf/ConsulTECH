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
import Views.ProgramLayout;

import java.awt.Rectangle;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//FILE THAT CONTAINS ALL BUTTONS AND ACTIONS OF THE MAIN PAGE MAIN AREA

public class HomePageActions extends JPanel {
	private HomePageActionButton gerenciarConsultas = new HomePageActionButton();
	private HomePageActionButton gerenciarFuncionarios = new HomePageActionButton();
	private HomePageActionButton relatoriosGerais = new HomePageActionButton();
	private HomePageActionButton gerenciarMateriais = new HomePageActionButton();
	private HomePageActionButton gerenciarExames = new HomePageActionButton();
	
	public HomePageActions() {
		//PANEL SETTINGS
		setSize(830, 600);
		setMinimumSize(new Dimension(400, 400));
		setPreferredSize(new Dimension(588, 400));
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Inter", Font.PLAIN, 12));
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		//DECLARING COMPONENTS
		JLabel title = new JLabel("Página inicial");
		
		//COMPONENT SETTINGS
		title.setPreferredSize(new Dimension(3000,50));
		title.setForeground(Theme.TITLE_COLOR);
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		gerenciarConsultas.setPreferredSize(new Dimension(220,170));
		gerenciarConsultas.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.gerenciarConsultas)));
		
		gerenciarFuncionarios.setPreferredSize(new Dimension(220,170));		gerenciarFuncionarios.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.gerenciarFuncionarios)));
		
		relatoriosGerais.setPreferredSize(new Dimension(220,170));
		relatoriosGerais.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.relatoriosGerais)));
		relatoriosGerais.setEnabled(false);
		
		gerenciarMateriais.setPreferredSize(new Dimension(220,170));
		gerenciarMateriais.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.gerenciarMateriais)));
		
		gerenciarExames.setPreferredSize(new Dimension(220,170));
		gerenciarExames.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.gerenciarExames)));
		
		//Adding components to panel
		add(title);
		add(gerenciarConsultas);
		add(gerenciarExames);
		add(gerenciarFuncionarios);
		add(gerenciarMateriais);
		add(relatoriosGerais);
		
	}
	
	public HomePageActionButton getGerenciarConsultas() {
		return gerenciarConsultas;
	}
	
	public HomePageActionButton getGerenciarFuncionarios() {
		return gerenciarFuncionarios;
	}
	
	public HomePageActionButton getRelatoriosGerais() {
		return relatoriosGerais;
	}
	
	public HomePageActionButton getGerenciarMateriais() {
		return gerenciarMateriais;
	}
	
	public HomePageActionButton getGerenciarExames() {
		return gerenciarExames;
	}
}
