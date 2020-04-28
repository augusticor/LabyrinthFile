package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import constants.ConstantsColorsAndFonts;

/**
 * This is a class to reuse and not have to create the same MENU with the same characteristics
 * @author augusticor
 */
public class OwnJMenu extends JMenu {

	public OwnJMenu(String text) {
		setText(text);
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		setFont(new Font(ConstantsColorsAndFonts.GADUGI, 0, 12));
	}
	
	public OwnJMenu(String text, JMenuItem jMenuItem) {
		setText(text);
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		setFont(new Font(ConstantsColorsAndFonts.GADUGI, 0, 16));
		add(jMenuItem);
	}
}