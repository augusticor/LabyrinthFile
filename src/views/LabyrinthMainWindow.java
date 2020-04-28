package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import constants.*;
import controller.Control;

/**
 * Principal Window interface for the application
 * @author augusticor
 */
public class LabyrinthMainWindow extends JFrame {

	private static final int MINIMUM_WIDTH = 600;
	private static final int MINIMUM_HEIGHT = 550;
	private JDAbout aboutDialog;
	private LabyrinthPanel labyrinthPanel;

	public LabyrinthMainWindow(Control controller) {
		setTitle(ConstantsGUI.MAIN_TITLE);
		setSize(MINIMUM_WIDTH, MINIMUM_HEIGHT);
		setMinimumSize(new Dimension(MINIMUM_WIDTH, MINIMUM_HEIGHT));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setIconImage(new ImageIcon(getClass().getResource(ConstantsIMG.MAIN_ICON)).getImage()); 
		setLocationRelativeTo(null);
		setResizable(false);
		
		setJMenuBar(new OwnJMenuBar(controller));
		aboutDialog = new JDAbout(this);
		labyrinthPanel = new LabyrinthPanel();
		add(labyrinthPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public void aboutDialogVisible() {
		aboutDialog.setVisible(true);
	}
	
	public void refreshLabyrinthPanel(String[][] labyrinthMatrix) {
		labyrinthPanel.fillLabyrinthPanel(labyrinthMatrix);
	}
	
	public void showErrorMessage(String message) {
		JOptionPane.showMessageDialog(this, message, ConstantsGUI.ERROR, JOptionPane.ERROR_MESSAGE);
	}
}