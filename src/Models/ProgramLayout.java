package Models;

import Models.HomePageActions;
import Models.CadastroMedico;
import Models.SideBar;
import Styles.Theme;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProgramLayout extends JPanel {
	public ProgramLayout() {
		//PANEL SETTINGS
		setBackground(new Color(0, 0, 0));
		setMinimumSize(new Dimension(600, 400));
		
		//DECLARATIONS
		//Components
		JSplitPane splitPane = new JSplitPane();
		HomePageActions homeActions = new HomePageActions();
		SideBar sideBar = new SideBar();
		//Screens
		GerenciarConsultaActions gerenciarConsulta = new GerenciarConsultaActions();
		GerenciarFuncionarioActions gerenciarFuncionario = new GerenciarFuncionarioActions();
		CadastroMedico cadastroMedico = new CadastroMedico();
		
		
		
		//TOOLBAR AND SPLIT PANE GROUP CONFIGS
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
		
		
		//SETTING SPLIT PANE RIGHT COMPONENT CONFIGS
		splitPane.setRightComponent(homeActions);
		splitPane.getLeftComponent().setMinimumSize(new Dimension(550, splitPane.getSize().height));
		splitPane.getLeftComponent().setMaximumSize(new Dimension(850, splitPane.getSize().height));
		
		//SPLIT PANE LEFT COMPONENT CONFIGS
		splitPane.setLeftComponent(sideBar);
		splitPane.getLeftComponent().setMinimumSize(new Dimension(150, splitPane.getSize().height));
		splitPane.getLeftComponent().setMaximumSize(new Dimension(150, splitPane.getSize().height));
		
		//SPLIT PANEL DIVISOR CONFIGS
		splitPane.setEnabled(false);
		splitPane.setDividerSize(0);;
		
		//BUTTONS BEHAVIOR
		//Gerenciar Consultas Click
		Component gerenciarConsultas = homeActions.getComponent(1);
		gerenciarConsultas.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	splitPane.setRightComponent(gerenciarConsulta);
		        splitPane.revalidate(); 
		        splitPane.repaint();
		    }
		});
		
		//Gerenciar Funcionarios Click
		Component gerenciarFuncionarios = homeActions.getComponent(3);
		gerenciarFuncionarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		    	splitPane.setRightComponent(gerenciarFuncionario);
		        splitPane.revalidate(); 
		        splitPane.repaint();
			}
		});
		
		//CADASTRAR MEDICO CLICK
		Component cadastrarMedico = gerenciarFuncionario.getComponent(1);
		cadastrarMedico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				splitPane.setRightComponent(cadastroMedico);
		        splitPane.revalidate(); 
		        splitPane.repaint();
			}
		});
		
		//Home Left Pane Click
		Component homeButton = sideBar.getComponent(4);
		homeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				splitPane.setRightComponent(homeActions);
				splitPane.revalidate();
				splitPane.repaint();
			}
		});
		
		
	}
}
