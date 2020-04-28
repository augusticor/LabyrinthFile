package models;

import java.util.ArrayList;

/**
 * Principal class, the logic of the project, saves the read labyrinth in logic
 * @author augusticor
 */
public class Labyrinth {

	/**The labyrinth is saved in a matrix object*/
	private String[][] labyrinth;

	public Labyrinth() {
		labyrinth = new String[10][16];
	}

	/**
	 * Fills the matrix object with the read data in the plain text file
	 * @param data received from PlainFileManager class
	 * * symbolizes the blocks
	 * 0 the zero symbolizes the way out of the labyrinth
	 * ? symbolizes the person into the labyrinth
	 * + Symbolizes the end of the labyrinth (a heart)
	 */
	public void fillLabyrinthMatrix(ArrayList<String> data) {
		for (int j = 0; j < labyrinth.length; j++) {
			for (int k = 0; k < labyrinth[0].length; k++) {
				labyrinth[j][k] = data.get(j * labyrinth[0].length + k);
			}
		}
	}

	public String[][] getLabyrinth() {
		return labyrinth;
	}
}