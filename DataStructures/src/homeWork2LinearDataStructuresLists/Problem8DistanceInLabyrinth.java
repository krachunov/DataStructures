/**
 * Problem8
 */
package homeWork2LinearDataStructuresLists;

import java.util.LinkedList;
import java.util.Queue;

public class Problem8DistanceInLabyrinth {
	// create matrix form object
	public static Problem8Labyrint[][] createLabyrint(String[][] matrix) {

		Problem8Labyrint[][] labyrint = new Problem8Labyrint[matrix.length][matrix[0].length];

		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {

				Problem8Labyrint object = new Problem8Labyrint(x, y,
						matrix[x][y]);
				labyrint[x][y] = object;
			}
		}
		return labyrint;
	}

	public static Problem8Labyrint[][] labyrintDistance(
			String[][] startingLabirint) {

		Problem8Labyrint[][] labirint = createLabyrint(startingLabirint);
		Queue<Problem8Labyrint> queue = new LinkedList<Problem8Labyrint>();
		int x = 0;
		int y = 0;

		// finding starting position
		for (int i = 0; i < labirint.length; i++) {
			for (int j = 0; j < labirint[i].length; j++) {
				if (labirint[i][j].getValue().equals("*")) {
					x = i;
					y = j;
					break;
				}
			}
		}

		do {
			if (queue.size() > 0) {
				Problem8Labyrint currecntElement = queue.poll();
				x = currecntElement.getX();
				y = currecntElement.getY();
			}
			// Check whether they go beyond the matrix
			if ((x + 1) >= 0 && (x + 1) < labirint.length) {
				// Check whether an index is not empty
				if ((labirint[x + 1][y]) != null) {
					// if not empty check if is passable - labeled 0
					if ((labirint[x + 1][y].getValue().equals("0"))) {
						// if practicable, ask his X and Y, and the counter
						// value
						(labirint[x + 1][y]).setX(x + 1);
						(labirint[x + 1][y]).setY(y);
						(labirint[x + 1][y]).setCount((labirint[x][y]
								.getCount()) + 1);
						(labirint[x + 1][y]).setValue(Integer
								.toString(labirint[x + 1][y].getCount()));
						queue.add((labirint[x + 1][y]));
					}
				}
			}
			// Check whether they go beyond the matrix
			if ((x - 1) >= 0 && (x - 1) < labirint.length) {
				// Check whether an index is not empty
				if ((labirint[x - 1][y]) != null) {
					// if not empty check if is passable - labeled 0
					if ((labirint[x - 1][y]).getValue().equals("0")) {
						// if practicable, ask his X and Y, and the counter
						// value
						(labirint[x - 1][y]).setX(x - 1);
						(labirint[x - 1][y]).setY(y);
						(labirint[x - 1][y]).setCount((labirint[x][y]
								.getCount()) + 1);
						(labirint[x - 1][y]).setValue(Integer
								.toString(labirint[x - 1][y].getCount()));
						queue.add((labirint[x - 1][y]));
					}
				}
			}
			// Check whether they go beyond the matrix
			if ((y - 1) >= 0 && (y - 1) < labirint.length) {
				// Check whether an index is not empty
				if ((labirint[x][y - 1]) != null) {
					// if not empty check if is passable - labeled 0
					if ((labirint[x][y - 1]).getValue().equals("0")) {
						// if practicable, ask his X and Y, and the counter
						// value
						(labirint[x][y - 1]).setX(x);
						(labirint[x][y - 1]).setY(y - 1);
						(labirint[x][y - 1]).setCount((labirint[x][y]
								.getCount()) + 1);
						(labirint[x][y - 1]).setValue(Integer
								.toString(labirint[x][y - 1].getCount()));
						queue.add((labirint[x][y - 1]));
					}
				}
			}
			// Check whether they go beyond the matrix
			if ((y + 1) >= 0 && (y + 1) < labirint[x].length) {
				// Check whether an index is not empty
				if ((labirint[x][y + 1]) != null) {
					// if not empty check if is passable - labeled 0
					if ((labirint[x][y + 1]).getValue().equals("0")) {
						// if practicable, ask his X and Y, and the counter
						// value
						(labirint[x][y + 1]).setX(x);
						(labirint[x][y + 1]).setY(y + 1);
						(labirint[x][y + 1]).setCount((labirint[x][y]
								.getCount()) + 1);
						(labirint[x][y + 1]).setValue(Integer
								.toString(labirint[x][y + 1].getCount()));
						queue.add((labirint[x][y + 1]));
					}
				}
			}
			// loop is executed while the queue is empty
		} while (queue.size() > 0);

		return labirint;
	}

	public static void main(String[] args) {
		Problem8Labyrint[][] lab = labyrintDistance(Problem8Matrix.labyrint);

		for (int j = 0; j < lab.length; j++) {
			System.out.println();
			for (int j2 = 0; j2 < lab[j].length; j2++) {
				System.out.print(lab[j][j2].getValue() + " ");
			}
		}

	}
}