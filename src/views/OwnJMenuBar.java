package views;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import constants.*;
import controller.Control;
import utilities.ActionEvents;

/**
 * This is a class to reuse and not have to create the same MENUBAR with the similar characteristics
 * @author augusticor
 */
public class OwnJMenuBar extends JMenuBar {

	public OwnJMenuBar(Control controller) {
		setBackground(Color.WHITE);
		
		JMenu jMenuFile = new OwnJMenu(ConstantsGUI.FILE, new OwnJMenuItem(ConstantsGUI.READ_FILE, ConstantsIMG.READ_FILE_ICON, KeyEvent.VK_R, ActionEvents.READ_LABYRINTH_FILE.toString(), controller));
		jMenuFile.add(new OwnJMenuItem(ConstantsGUI.EXIT, ConstantsIMG.EXIT_ICON, KeyEvent.VK_X, ActionEvents.EXIT.toString(), controller));
		add(jMenuFile);
		
		JMenu jMenuAbout = new OwnJMenu(ConstantsGUI.INFO_SISTEMAS, new OwnJMenuItem(ConstantsGUI.INFO_SISTEMAS, ConstantsIMG.ABOUT, KeyEvent.VK_I, ActionEvents.ABOUT.toString(), controller));
		add(jMenuAbout);
	}
}