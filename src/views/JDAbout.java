package views;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import constants.*;

/**
 * Dialog for software information
 * @author augusticor
 */
public class JDAbout extends JDialog {

	public JDAbout(JFrame parentComponent) {
		super(parentComponent);
		setModal(true);
		getContentPane().setBackground(Color.WHITE);
		setTitle(ConstantsGUI.INFO_SISTEMAS);
		setIconImage(new ImageIcon(getClass().getResource(ConstantsIMG.ABOUT)).getImage());
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 25));
		setSize(420, 380);
		setLocationRelativeTo(null);
		setResizable(false);
		
		add(new OwnJLabel(ConstantsIMG.INFO_SISTEMAS));
		add(new OwnJLabel(ConstantsGUI.MY_INFO, ConstantsColorsAndFonts.WHITE, 20));
	}
}