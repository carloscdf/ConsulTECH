package Program;

import java.awt.Dimension;

import javax.swing.JFrame;

import Models.ProgramLayout;

public class Program extends JFrame {

	public static void main(String[] args) {
		String title = "ConsulTECH - Sistema de Gerenciamento Clínico";
	
		JFrame mainFrame = new JFrame(); //the main frame
		ProgramLayout mainPage = new ProgramLayout(); //the main page
		
		mainFrame.getContentPane().add(mainPage); //setting the main page on the main frame
		mainFrame.setVisible(true); //setting them visible
		
		//MAIN FRAME STYLES
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainFrame.setSize(800, 600);
		mainFrame.setMinimumSize(new Dimension(800, 500));
		mainFrame.setTitle(title);
		
	}
}