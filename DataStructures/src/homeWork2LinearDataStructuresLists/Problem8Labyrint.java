/**
 * Problem 8
 */
package homeWork2LinearDataStructuresLists;

public class Problem8Labyrint {

	private int xIndex = 0;
	private int yIndex = 0;
	private int count = 0;
	private String value = null;

	// Labyrint[][] labirint;

	public Problem8Labyrint(int x, int y, String value) {
		setX(x);
		setY(y);
		setValue(value);
	}

	public int getX() {
		return xIndex;
	}

	public void setX(int x) {
		this.xIndex = x;
	}

	public int getY() {
		return yIndex;
	}

	public void setY(int y) {
		this.yIndex = y;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
