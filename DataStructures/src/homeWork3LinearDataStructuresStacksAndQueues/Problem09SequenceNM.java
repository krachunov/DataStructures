/**
 * Problem10
 */
package homeWork3LinearDataStructuresStacksAndQueues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem09SequenceNM {
	private int value;
	private Problem09SequenceNM prevItem;

	public Problem09SequenceNM(int value, Problem09SequenceNM preview) {
		setValue(value);
		setPrevItem(preview);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Problem09SequenceNM getPrevItem() {
		return prevItem;
	}

	public void setPrevItem(Problem09SequenceNM prevItem) {
		this.prevItem = prevItem;
	}

	public static void Sequence(int n, int m) {
		Problem09SequenceNM item = new Problem09SequenceNM(n, null);
		Queue<Problem09SequenceNM> queue = new LinkedList<Problem09SequenceNM>();
		queue.offer(item);
		while (queue.size() > 0) {
			Problem09SequenceNM currentItem = queue.poll();
			if (currentItem.getValue() < m) {
				queue.offer(new Problem09SequenceNM((currentItem.getValue() + 1),
						currentItem));
				queue.offer(new Problem09SequenceNM((currentItem.getValue() + 2),
						currentItem));
				queue.offer(new Problem09SequenceNM((currentItem.getValue() * 2),
						currentItem));
			}
			if (currentItem.getValue() == m) {
				printSolution(currentItem);
				break;
			}
		}
	}

	public static void printSolution(Problem09SequenceNM item) {
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
