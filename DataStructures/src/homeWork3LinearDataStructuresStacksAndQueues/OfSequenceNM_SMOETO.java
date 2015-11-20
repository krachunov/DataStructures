/**
 * Problem10
 */
package homeWork3LinearDataStructuresStacksAndQueues;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class OfSequenceNM_SMOETO {
	private int value;
	private OfSequenceNM_SMOETO prevItem;

	public OfSequenceNM_SMOETO(int value, OfSequenceNM_SMOETO preview) {
		setValue(value);
		setPrevItem(preview);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public OfSequenceNM_SMOETO getPrevItem() {
		return prevItem;
	}

	public void setPrevItem(OfSequenceNM_SMOETO prevItem) {
		this.prevItem = prevItem;
	}

	/**
	 * 
	 * @param n
	 * @param m
	 *            The method use the LinkedQueue from homeWork Problem 8
	 */
	public static void Sequence(int n, int m) {
		OfSequenceNM_SMOETO item = new OfSequenceNM_SMOETO(n, null);
		Problem07LinkedQueue<OfSequenceNM_SMOETO> queue = new Problem07LinkedQueue<OfSequenceNM_SMOETO>();
		queue.enqueue(item);
		while (queue.getCount() > 0) {
			OfSequenceNM_SMOETO currentItem = queue.deEnqueue();
			if (currentItem.getValue() < m) {
				queue.enqueue(new OfSequenceNM_SMOETO((currentItem.getValue() + 1),
						currentItem));
				queue.enqueue(new OfSequenceNM_SMOETO((currentItem.getValue() + 2),
						currentItem));
				queue.enqueue(new OfSequenceNM_SMOETO((currentItem.getValue() * 2),
						currentItem));
			}
			if (currentItem.getValue() == m) {
				printSolution(currentItem);
				break;
			}
		}
	}

	public static void printSolution(OfSequenceNM_SMOETO item) {
		Stack<Integer> list = new Stack<Integer>();
		while (item != null) {
			list.push(item.getValue());
			item = item.getPrevItem();
		}
		while (list.size() > 0) {
			System.out.print(list.pop() + " ");
		}
	}
}
