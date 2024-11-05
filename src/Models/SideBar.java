package Models;

import Models.CadastroMedico;
import Styles.Theme;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class SideBar extends JPanel {
	public SideBar() {
		setBackground(Theme.BACKGROUND_COLOR);
		setLayout(null);
		
		//DECLARING COMPONENTS
		JLabel logo = new JLabel("Logo");
		JSeparator separator = new JSeparator();
		JLabel mainMenuLabel = new JLabel("MENU PRINCIPAL");
		HomePageActionButtons homeButton = new HomePageActionButtons();
		
		//COMPONENTS SETTINGS
		logo.setIcon(new ImageIcon("..\\assets\\logo\\logo.png"));
		logo.setBounds(10, 11, 130, 21);
		
		separator.setForeground(Theme.LIGHT_BORDER_COLOR);
		separator.setBounds(0, 48, 150, 2);
		
		mainMenuLabel.setForeground(Theme.LIGHT_TEXT_COLOR);
		mainMenuLabel.setFont(Theme.MAIN_PLAIN_FONT_lowerSize);
		mainMenuLabel.setBounds(10, 64, 130, 14);
		
		homeButton.setText("Início");
		homeButton.setBounds(10, 89, 130, 35);
		
		//ADDING COMPONENT TO PANEL
		add(logo);
		add(separator);
		add(mainMenuLabel);
		add(homeButton);
	
	}
}
