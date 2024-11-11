package Styles;

import java.awt.Color;
import java.awt.Font;
import Styles.Theme;

import javax.swing.JLabel;

public class InputLabel extends JLabel{
	public InputLabel(String text) {
		setText(text);
		setForeground(Theme.TEXT_COLOR);
		setFont(Theme.MAIN_PLAIN_FONT_mediumSize);
	}
}
