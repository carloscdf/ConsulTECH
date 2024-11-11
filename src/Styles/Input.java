package Styles;

import java.awt.Dimension;
import java.awt.Font;
import Styles.Theme;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class Input extends JTextField {
	public Input() {
		setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
		setColumns(27);
		setBorder(BorderFactory.createLineBorder(Theme.TEXT_COLOR, 2));
	}
}
