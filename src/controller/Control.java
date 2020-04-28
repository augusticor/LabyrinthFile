package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import models.Labyrinth;
import persistence.PlainFileManager;
import utilities.ActionEvents;
import views.LabyrinthMainWindow;

/**
 * Welcome to LabyrinthFile project
 * This project was made when i took the programming 2 class in the university.
 * What´s about:
 * Into the files folder there is a file called "labyrinth1File.txt", this project provides the tools
 * for reading that plain text file and convert into a great labyrinth with it's own interface.
 * Basic persistence application :D 
 * The labyrinth consists of:
 * -> * symbolizes the blocks
 * -> 0 the zero symbolizes the way out of the labyrinth
 * -> ? symbolizes the person into the labyrinth
 * -> + Symbolizes the end of the labyrinth (a heart)
 * @author augusticor
 * @version 1.0
 * @category persistence implementation
 * Architecture: M.V.C.
 * Used I.D.E: Eclipse
 * This class connects the interface and the logic 
 */
public class Control implements ActionListener {

	/**Logic object for calling methods*/
	private Labyrinth labyrinth;
	/**Persistence object for read the file and save it in logic*/
	private PlainFileManager plainFileManager;
	/**Interface object*/
	private LabyrinthMainWindow mainW;
	
	public Control() {
		labyrinth = new Labyrinth();
		plainFileManager = new PlainFileManager();
		mainW = new LabyrinthMainWindow(this);
	}
	
	/**Method for respond to actions*/
	public void actionPerformed(ActionEvent actionE) {
		switch (ActionEvents.valueOf(actionE.getActionCommand())) {
		case READ_LABYRINTH_FILE:
			try {
				readLabyrinthFile();
			} catch (IOException e) {
				mainW.showErrorMessage(e.getMessage());
			}
			break;
		case ABOUT:
			mainW.aboutDialogVisible();
			break;
		case EXIT:
			System.exit(0);
			break;
		}
	}
	
	/**Reads the plain text file and charges the interface to show the result*/
	private void readLabyrinthFile() throws IOException {
		labyrinth.fillLabyrinthMatrix(plainFileManager.readFile());
		mainW.refreshLabyrinthPanel(labyrinth.getLabyrinth());
	}
}