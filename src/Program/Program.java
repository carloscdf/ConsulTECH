package Program;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

import Models.Consulta;
import Models.Medico;
import Models.Paciente;
import Views.ProgramLayout;

public class Program extends JFrame {
    public Program() {
    }

    public static void main(String[] args) {
        String title = "ConsulTECH - Sistema de Gerenciamento Clínico";

        JFrame mainFrame = new JFrame(); // the main frame
        ProgramLayout mainPage = new ProgramLayout(); // the main page

        // MAIN FRAME STYLES
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setSize(990, 750);
        mainFrame.setMinimumSize(new Dimension(950, 750));
        mainFrame.setTitle(title);

        mainFrame.getContentPane().add(mainPage); // setting the main page on the main frame

        // CENTERING WINDOW
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int windowWidth = mainFrame.getWidth();
        int windowHeight = mainFrame.getHeight();
        
        int x = (screenWidth - windowWidth) / 2;
        int y = (screenHeight - windowHeight) / 2;
        mainFrame.setLocation(x, y);

        // Set the frame visible after location is set
        mainFrame.setVisible(true);
    }
}
