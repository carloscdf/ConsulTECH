package Models;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroMedico extends JPanel{
	
	private JTextField txtDigiteONome;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public CadastroMedico() {
		setLayout(null);
		
		
		//Header page title configuration
		JLabel lblNewLabel = new JLabel("CADASTRO MÉDICO");
		lblNewLabel.setFont(new Font("Inter", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 11, 215, 23);
		add(lblNewLabel);
		
		//Subtitles
		JLabel lblDadosPessoais = new JLabel("Dados pessoais e profissionais");
		lblDadosPessoais.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosPessoais.setFont(new Font("Inter", Font.PLAIN, 14));
		lblDadosPessoais.setBounds(10, 45, 215, 23);
		add(lblDadosPessoais);
		
		JLabel lblDadosComoFuncionrio = new JLabel("Dados como funcionário");
		lblDadosComoFuncionrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblDadosComoFuncionrio.setFont(new Font("Inter", Font.PLAIN, 14));
		lblDadosComoFuncionrio.setBounds(296, 45, 215, 23);
		add(lblDadosComoFuncionrio);
		
		//Name area label and input
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 83, 241, 14);
		add(lblNewLabel_1);
		
		txtDigiteONome = new JTextField();
		txtDigiteONome.setFont(new Font("Inter", Font.PLAIN, 12));
		txtDigiteONome.setBounds(10, 100, 241, 20);
		add(txtDigiteONome);
		txtDigiteONome.setColumns(10);
		
		//DatNascimento area label and input
		
		textField = new JTextField();
		textField.setFont(new Font("Inter", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(10, 148, 241, 20);
		add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data de nascimento");
		lblNewLabel_1_1.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 131, 241, 14);
		add(lblNewLabel_1_1);
		
		//CPF area label and input
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 196, 241, 20);
		add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CPF");
		lblNewLabel_1_1_1.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 179, 241, 14);
		add(lblNewLabel_1_1_1);
		
		//Especialidade area label and input
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 244, 241, 20);
		add(textField_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Especialidade");
		lblNewLabel_1_1_2.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(10, 227, 241, 14);
		add(lblNewLabel_1_1_2);
		
		//Identificador de clínica area label and input
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(296, 100, 241, 20);
		add(textField_3);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Idenificador na clínica");
		lblNewLabel_1_1_3.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(296, 83, 241, 14);
		add(lblNewLabel_1_1_3);
		
		//CRM area label and input
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(10, 292, 241, 20);
		add(textField_4);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("CRM");
		lblNewLabel_1_1_2_1.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(10, 275, 241, 14);
		add(lblNewLabel_1_1_2_1);
		
		//Cargo area label and input
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBounds(296, 148, 241, 20);
		add(textField_5);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Cargo");
		lblNewLabel_1_1_2_2.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1_2_2.setBounds(296, 131, 241, 14);
		add(lblNewLabel_1_1_2_2);
		
		//HorarioAtendimento area label and input
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBounds(296, 196, 241, 20);
		add(textField_6);
		
		JLabel lblNewLabel_1_1_2_3 = new JLabel("Horário de atendimento");
		lblNewLabel_1_1_2_3.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1_2_3.setBounds(296, 179, 241, 14);
		add(lblNewLabel_1_1_2_3);
		
		//Salário area label and input
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Inter", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBounds(296, 244, 241, 20);
		add(textField_7);
		
		JLabel lblNewLabel_1_1_2_4 = new JLabel("Salário");
		lblNewLabel_1_1_2_4.setFont(new Font("Inter", Font.PLAIN, 12));
		lblNewLabel_1_1_2_4.setBounds(296, 227, 241, 14);
		add(lblNewLabel_1_1_2_4);
		
		//Cadastrar infos Button
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Inter", Font.PLAIN, 12));
		btnNewButton.setBounds(197, 332, 141, 30);
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicado");
				
			}
			
		});
		
	}
}
