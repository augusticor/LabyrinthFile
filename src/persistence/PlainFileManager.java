package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import utilities.Utilities;

/**
 * This is the persistence class, reads the file and sends the information to logic (Labyrinth.java)
 * @author augusticor
 */
public class PlainFileManager {

	/**The path of the file*/
	private static final File LABYRINTH_PATH_FILE = new File("files/labyrinth1File.txt");

	/**
	 * Reads the file and generates and ArrayList with the data for sending to logic
	 * @return the data list for logic
	 * @throws IOException if can't read the file
	 */
	public ArrayList<String> readFile() throws IOException {
		ArrayList<String> data = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(LABYRINTH_PATH_FILE));
		String labyrinthData = "";
		while ((labyrinthData = bufferedReader.readLine()) != null) {
			String rowArray[] = labyrinthData.split(Utilities.splitLabyrinthFileInfo());
			if (rowArray.length == 16) {
				rowArray = labyrinthData.split(Utilities.splitLabyrinthFileInfo());
				for (int i = 0; i < rowArray.length; i++) {
					data.add(rowArray[i]);
				}
			}
		}
		bufferedReader.close();
		return data;
	}
}