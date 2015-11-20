/**
 * Problem8
 */
package homeWork3LinearDataStructuresStacksAndQueues;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Problem07LinkedQueue<T> {
	private QueueNode<T> head;
	private QueueNode<T> tail;
	public int count;

	public int getCount() {
		return count;
	}

	@SuppressWarnings("hiding")
	private class QueueNode<T> {
		private T value;
		private QueueNode<T> nextNode;
		private QueueNode<T> prevNode;

		public QueueNode(T element, QueueNode<T> preview) {
			setValue(element);
			setPrevNode(preview);
			setNextNode(null);
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public QueueNode<T> getNextNode() {
			return nextNode;
		}

		public void setNextNode(QueueNode<T> nextNode) {
			this.nextNode = nextNode;
		}

		@SuppressWarnings("unused")
		public QueueNode<T> getPrevNode() {
			return prevNode;
		}

		public void setPrevNode(QueueNode<T> prevNode) {
			this.prevNode = prevNode;
		}

	}

	public void enqueue(T element) {
		if (count == 0) {
			QueueNode<T> node = new QueueNode<T>(element, null);
			head = node;
			tail = node;
			count++;
		} else {
			QueueNode<T> node = new QueueNode<T>(element, tail);
			tail.setNextNode(node);
			tail = node;
			count++;
		}
	}

	public T deEnqueue() {
		QueueNode<T> tempNode = head;
		if (tempNode.nextNode != null) {
			head = tempNode.nextNode;
			count--;
			return tempNode.getValue();
		}
		if (getCount() < 1) {
			head = null;
			return null;
		}
		count--;
		return tempNode.getValue();

	}

	@SuppressWarnings("unchecked")
	public T[] toArray() {

		ArrayList<T> toArray = new ArrayList<T>();
		int arrLength = this.getCount();

		QueueNode<T> tempCurrentNode = head;
		QueueNode<T> tempNextNode = tempCurrentNode.getNextNode();
		for (int i = 0; i < arrLength; i++) {
			toArray.add(tempCurrentNode.getValue());
			tempCurrentNode = tempNextNode;
			if (tempCurrentNode.getNextNode() != null) {
				tempNextNode = tempCurrentNode.getNextNode();
			}
		}
		return (T[]) toArray.toArray();
	}
}
