package Views;

import Styles.Theme;
import Views.CadastroMedico;
import Views.HomePageActions;
import Views.SideBar;

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

public class ProgramLayout extends JSplitPane {

    public ProgramLayout() {
        // PAINEL CONFIGURAÇÕES
        setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        setBackground(new Color(0, 0, 0));
        setMinimumSize(new Dimension(600, 400));

        // Declaração dos Componentes
        HomePageActions homeActions = new HomePageActions();
        SideBar sideBar = new SideBar();
        GerenciarConsultaActions gerenciarConsultas = new GerenciarConsultaActions();
        CadastroPaciente cadastroPaciente = new CadastroPaciente();
        CadastroConsulta cadastroConsulta = new CadastroConsulta();
        GerenciarFuncionarioActions gerenciarFuncionarios = new GerenciarFuncionarioActions();
        CadastroMedico cadastroMedico = new CadastroMedico();
        GerenciarExameActions gerenciarExames = new GerenciarExameActions();
        CadastroExame cadastroExame = new CadastroExame();
        GerenciarMaterialActions gerenciarMateriais = new GerenciarMaterialActions();
        CadastroMaterial cadastroMaterial = new CadastroMaterial();
        
        // Configurações dos Componentes da Classe
        setRightComponent(homeActions);
        getRightComponent().setMinimumSize(new Dimension(550, getSize().height));
        getRightComponent().setMaximumSize(new Dimension(850, getSize().height));

        setLeftComponent(sideBar);
        getLeftComponent().setMinimumSize(new Dimension(150, getSize().height));
        getLeftComponent().setMaximumSize(new Dimension(150, getSize().height));

        setEnabled(false);
        setDividerSize(0);

        //SPLIT RIGHT PANE BUTTON BEHAVIORS
        
        //GERENCIAR CONSULTA SCREEN
        Component gerenciarConsultaBtn = homeActions.getGerenciarConsultas();
        gerenciarConsultaBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarConsultas);
                revalidate();
                repaint();
            }
        });
        
        //CADASTRO PACIENTE SCREEN
        Component cadastrarPacienteBtn = gerenciarConsultas.getCadastroPaciente();
        cadastrarPacienteBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(cadastroPaciente);
                revalidate();
                repaint();
            }
        });
        
        Component voltarCadastroPacienteBtn = cadastroPaciente.getGoBackBtn();
        voltarCadastroPacienteBtn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarConsultas);
                revalidate();
                repaint();
        	}
        });
        
      //CADASTRO CONSULTA SCREEN
        Component cadastrarConsultaBtn = gerenciarConsultas.getCadastroConsulta();
        cadastrarConsultaBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(cadastroConsulta);
                revalidate();
                repaint();
            }
        });
        
        Component voltarCadastroConsultaBtn = cadastroConsulta.getGoBackBtn();
        voltarCadastroConsultaBtn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarConsultas);
                revalidate();
                repaint();
        	}
        });
        

        //GERENCIAR FUNCIONARIO SCREEN
        Component gerenciarFuncionarioBtn = homeActions.getGerenciarFuncionarios();
        gerenciarFuncionarioBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarFuncionarios);
                revalidate();
                repaint();
            }
        });

        //CADASTRO MEDICO SCREEN
        Component cadastrarMedicoBtn = gerenciarFuncionarios.getComponent(1);
        cadastrarMedicoBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(cadastroMedico);
                revalidate();
                repaint();
            }
        });
        
        Component voltarCadastroMedicoBtn = cadastroMedico.getGoBackBtn();
        voltarCadastroMedicoBtn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarFuncionarios);
                revalidate();
                repaint();
        	}
        });
        
      //GERENCIAR EXAMES SCREEN
        Component gerenciarExameBtn = homeActions.getGerenciarExames();
        gerenciarExameBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarExames);
                revalidate();
                repaint();
            }
        });
        
      //CADASTRO EXAME SCREEN
        Component cadastrarExameBtn = gerenciarExames.getCadastroExame();
        cadastrarExameBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(cadastroExame);
                revalidate();
                repaint();
            }
        });      
        
        Component voltarCadastroExameBtn = cadastroExame.getGoBackBtn();
        voltarCadastroExameBtn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarExames);
                revalidate();
                repaint();
        	}
        });
        
        //GERENCIAR MATERIAIS SCREEN
        Component gerenciarMateriaisBtn = homeActions.getGerenciarMateriais();
        gerenciarMateriaisBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarMateriais);
                revalidate();
                repaint();
            }
        });
        
      //CADASTRO MATERIAL SCREEN
        Component cadastrarMaterialBtn = gerenciarMateriais.getCadastroMaterial();
        cadastrarMaterialBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(cadastroMaterial);
                revalidate();
                repaint();
            }
        });      
        
        Component voltarCadastroMaterialBtn = cadastroMaterial.getGoBackBtn();
        voltarCadastroMaterialBtn.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
                setRightComponent(gerenciarMateriais);
                revalidate();
                repaint();
        	}
        });
        
        //SPLIT LEFT PANE BUTTON BEHAVIORS
        
        //home button
        Component homeBtn = sideBar.getComponent(4);
        homeBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setRightComponent(homeActions);
                revalidate();
                repaint();
            }
        });
    }
}
