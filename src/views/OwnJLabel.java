package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import constants.ConstantsColorsAndFonts;

/**
 * This is a class to reuse and not have to create the same label with the same characteristics
 * @author augusticor
 */
public class OwnJLabel extends JLabel {

	public OwnJLabel(String text, String backGround, int foreSize) {
		setText(text);
		setBackground(Color.decode(backGround));
		setForeground(Color.BLACK);
		setFont(new Font(ConstantsColorsAndFonts.HIGH_TOWER, 0, foreSize));
		setOpaque(false);
		setHorizontalAlignment(JLabel.CENTER);
	}
	
	//Jlabel Img
	public OwnJLabel(String imgUrl) {
		setIcon(new ImageIcon(getClass().getResource(imgUrl)));
		setHorizontalAlignment(JLabel.CENTER);
	}
}