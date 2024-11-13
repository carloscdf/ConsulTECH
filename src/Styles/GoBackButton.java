package Styles;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import Views.CadastroMedico;
import Styles.Theme;
import Styles.Icons;

public class GoBackButton extends ActionButton{
	public GoBackButton() {
		setHorizontalAlignment(SwingConstants.LEFT);
		setIconTextGap(10);
		setIcon(new ImageIcon(CadastroMedico.class.getResource(Icons.leftArrow)));
		setText("Voltar");
	}
}
