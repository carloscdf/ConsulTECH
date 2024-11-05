package Models;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import Models.HomePageActionButtons;
import Styles.Theme;

//FILE THAT CONTAINS ALL BUTTONS AND ACTIONS OF THE MAIN PAGE MAIN AREA

public class HomePageActions extends JPanel {
	public HomePageActions() {
		//PANEL SETTINGS
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Inter", Font.PLAIN, 12));
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setLayout(null);
		
		//DECLARING COMPONENTS
		HomePageActionButtons gerenciarConsultas = new HomePageActionButtons();
		HomePageActionButtons gerenciarFuncionarios = new HomePageActionButtons();
		HomePageActionButtons gerenciarExames = new HomePageActionButtons();
		HomePageActionButtons dadosFinanceiros = new HomePageActionButtons();
		
		//COMPONENT SETTINGS
		gerenciarConsultas.setText("Gerenciar Consultas");
		gerenciarConsultas.setBounds(10, 11, 194, 150); //Position X,Y,WIDTH,HEIGHT
		
		gerenciarFuncionarios.setText("Gerenciar Funcionários");
		gerenciarFuncionarios.setBounds(215, 11, 194, 150); //Position X,Y,WIDTH,HEIGHT 
		
		gerenciarExames.setText("Gerenciar Exames");
		gerenciarExames.setBounds(419, 11, 194, 150);
		
		dadosFinanceiros.setText("Dados Financeiros");
		dadosFinanceiros.setBounds(10, 172, 194, 150);
		
		//Adding components to panel
		add(gerenciarConsultas);
		add(gerenciarFuncionarios);
		add(gerenciarExames);
		add(dadosFinanceiros);
		
	}
	
	//remover depois
	
	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		HomePageActions main = new HomePageActions();
		
		frame1.setSize(400,500);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().add(main);
	}
}
