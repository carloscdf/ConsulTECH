package Styles;

import java.awt.Component;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class ActionButton  extends JButton{
	public ActionButton(){
		//Button style
		setAlignmentX(Component.CENTER_ALIGNMENT); //X Alignent
		setBackground(Theme.BACKGROUND_COLOR); //Background color
		setForeground(Theme.TEXT_COLOR); //Text color
		setFont(Theme.MAIN_PLAIN_FONT_mediumSize);//Text and font style
		setBorderPainted(false); //Border style
		setFocusPainted(false); //Focus style
		setOpaque(true); //Opaque

//		//When hover 
//		addMouseListener(new java.awt.event.MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				setBackground(Theme.BACKGROUND_HOVER_COLOR);// Add a new background color
//				setForeground(Theme.TEXT_COLOR_HOVER); // Add a new text color
//			}
	//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				setBackground(Theme.BACKGROUND_COLOR); // Go back to the original color
//				setForeground(Theme.TEXT_COLOR); // Go back to the original color
//			}
//		});
	}

}
