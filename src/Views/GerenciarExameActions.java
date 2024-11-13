package Views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Styles.HomePageActionButton;
import Styles.Icons;
import Styles.Theme;

public class GerenciarExameActions extends JPanel {
	private HomePageActionButton cadastroExame = new HomePageActionButton();
	private HomePageActionButton relatorioExames = new HomePageActionButton();
	
	public GerenciarExameActions() {
		//PANEL SETTINGS
		setSize(830, 600);
		setMinimumSize(new Dimension(400, 400));
		setPreferredSize(new Dimension(588, 400));
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Inter", Font.PLAIN, 12));
		setBackground(Theme.PAGE_BACKGROUND_COLOR);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		//DECLARING COMPONENTS
		JLabel title = new JLabel("Gerenciamento de Exames");

		//COMPONENT SETTINGS
		title.setPreferredSize(new Dimension(3000,50));
		title.setForeground(Theme.TITLE_COLOR);
		title.setFont(Theme.MAIN_BOLD_FONT_higherSize);
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		
		cadastroExame.setPreferredSize(new Dimension(220,170));
		cadastroExame.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.novoExame)));
		
		relatorioExames.setPreferredSize(new Dimension(220,170));
		relatorioExames.setIcon(new ImageIcon(HomePageActions.class.getResource(Icons.relatorioExames)));
		relatorioExames.setEnabled(false);
		
		
		//Adding components to panel
		add(title);
		add(cadastroExame);
		add(relatorioExames);
	}
	
	public HomePageActionButton getCadastroExame() {
		return  cadastroExame;
	}
	
	public HomePageActionButton getRelatorioExames() {
		return relatorioExames;
	}
}
