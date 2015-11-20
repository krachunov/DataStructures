/**
 * Problem6
 */
package homeWork2LinearDataStructuresLists;

import java.util.ArrayList;
import java.util.List;

public class Problem6ReversedList<T> {
	private List<T> newList;
	private static int count = 0;

	public Problem6ReversedList() {
		newList = new ArrayList<T>();
	}

	public List<T> getNewList() {
		return newList;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Problem6ReversedList.count += count;
	}

	public void add(T item) {
		this.newList.add(0, item);
		setCount(1);
	}

	public int capacity() {
		return this.getCount();
	}

	public Integer getIndex(int index) {
		return (Integer) this.newList.get(index);
	}

	public void removeByIndex(int index) {
		this.getNewList().remove(index);
		setCount(-1);
	}

	public void printReversedList() {
		List<T> tempList = this.getNewList();
		for (T element : tempList) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Problem6ReversedList<Integer> reversedList = new Problem6ReversedList<Integer>();
		reversedList.add(1);
		reversedList.add(2);
		reversedList.add(3);
		reversedList.add(4);
		reversedList.add(5);
		reversedList.printReversedList();
		System.out.println("Capacity befoere remove: "
				+ reversedList.capacity());
		System.out.println("Index 2 before remove: " + reversedList.getIndex(2));
		reversedList.removeByIndex(2);
		System.out.println("Capacity after remove: " + reversedList.capacity());
		System.out.println("Index 2 after remove: " + reversedList.getIndex(2));

	}

}
