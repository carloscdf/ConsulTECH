package Views;

//Styles
import Styles.Theme;
import Views.CadastroMedico;
import Styles.SideBarButton;
import Styles.Icons;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Insets;
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
		JLabel logo = new JLabel(new ImageIcon(SideBar.class.getResource("/assets/logo.png")));
		JSeparator separator = new JSeparator();
		JLabel mainMenuLabel = new JLabel("MENU PRINCIPAL");
		SideBarButton homeButton = new SideBarButton();
		
		//COMPONENTS SETTINGS
		logo.setBounds(10, 11, 130, 21);
		
		separator.setForeground(Theme.LIGHT_BORDER_COLOR);
		separator.setBounds(0, 48, 150, 2);
		
		mainMenuLabel.setForeground(Theme.LIGHT_TEXT_COLOR);
		mainMenuLabel.setFont(Theme.MAIN_PLAIN_FONT_lowerSize);
		mainMenuLabel.setBounds(10, 64, 130, 14);
		
		//ADDING COMPONENT TO PANEL
		add(logo);
		add(separator);
		add(mainMenuLabel);
		add(homeButton);
		
		SideBarButton btnNewButton = new SideBarButton();
		btnNewButton.setIcon(new ImageIcon(SideBar.class.getResource("/assets/icons/home.png")));
		btnNewButton.setBounds(10, 89, 130, 40);
		add(btnNewButton);
		
		//BEHAVIORS
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
