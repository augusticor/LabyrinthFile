package views;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import constants.ConstantsIMG;

/**
 * The main panel which displays the labyrinth composition
 * @author augusticor
 */
public class LabyrinthPanel extends JPanel {

	public LabyrinthPanel() {
		setBackground(Color.WHITE);
	}

	/**
	 * Draws the respective image of the labyrinth for each character representation as was explained
	 * -> * symbolizes the blocks
	 * -> 0 the zero symbolizes the way out of the labyrinth
	 * -> ? symbolizes the person into the labyrinth
	 * -> + Symbolizes the end of the labyrinth (a heart)
	 * @param labyrinthMatrix
	 */
	public void fillLabyrinthPanel(String[][] labyrinthMatrix) {
		removeAll();
		setLayout(new GridLayout(labyrinthMatrix.length, labyrinthMatrix[0].length));
		for (int i = 0; i < labyrinthMatrix.length; i++) {
			for (int j = 0; j < labyrinthMatrix[0].length; j++) {
				if (labyrinthMatrix[i][j].equalsIgnoreCase("?")) {
					add(new OwnJLabel(ConstantsIMG.WOMAN_ICON));
				}
				else if (labyrinthMatrix[i][j].equalsIgnoreCase("0")) {
					add(new OwnJLabel(ConstantsIMG.WHITE_WAY));
				}
				else if (labyrinthMatrix[i][j].equalsIgnoreCase("+")) {
					add(new OwnJLabel(ConstantsIMG.HEART_ICON));
				}
				else {
					add(new OwnJLabel(ConstantsIMG.BLOCK_ICON));
				}
			}
		}
		revalidate();
	}
}