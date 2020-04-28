package run;

import controller.Control;

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
 * This class runs the project 
 */
public class Runner {

	public static void main(String[] args) {
		new Control();
	}
}