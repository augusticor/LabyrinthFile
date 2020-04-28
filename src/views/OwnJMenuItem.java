package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import constants.ConstantsColorsAndFonts;
import controller.Control;

/**
 * This is a class to reuse and not have to create the same JMenuItem with the same characteristics
 * @author augusticor
 */
public class OwnJMenuItem extends JMenuItem {

	public OwnJMenuItem(String text, String imgUrl, int keyCode, String actionCommand, Control controller) {
		setText(text);
		setIcon(new ImageIcon(getClass().getResource(imgUrl)));
		setAccelerator(KeyStroke.getKeyStroke(keyCode, ActionEvent.CTRL_MASK));
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		setFont(new Font(ConstantsColorsAndFonts.VERDANA, 0, 14));
		setActionCommand(actionCommand);
		addActionListener(controller);
	}
}