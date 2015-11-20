package homeWork3LinearDataStructuresStacksAndQueues;

import java.util.ArrayList;

public class Problem05LinkedStack<T> {
	private Node<T> firstNode;
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void push(T element) {
		if (firstNode == null) {
			firstNode = new Node<T>(element, null);
			count++;
		} else {
			Node<T> temElement = new Node<T>(element, firstNode);
			firstNode = temElement;
			count++;
		}

	}

	public T pop() {
		Node<T> tempNode = this.firstNode;
		firstNode = tempNode.nexNode;
		count--;
		return tempNode.getValue();
	}

	@SuppressWarnings("unchecked")
	public T[] toArray() {

		ArrayList<T> toArray = new ArrayList<T>();
		int arrLength = this.getCount();

		Node<T> tempCurrentNode = firstNode;
		Node<T> tempNextNode = tempCurrentNode.nexNode;
		for (int i = 0; i < arrLength; i++) {
			toArray.add(tempCurrentNode.getValue());
			tempCurrentNode = tempNextNode;
			if (tempCurrentNode.nexNode != null) {
				tempNextNode = tempCurrentNode.nexNode;
			}
		}
		return (T[]) toArray.toArray();
	}

	private class Node<T> {
		private T value;
		private Node<T> nexNode;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node<T> getNexNode() {
			return nexNode;
		}

		public void setNexNode(Node<T> nexNode) {
			this.nexNode = nexNode;
		}

		public Node(T value, Node<T> nextNode) {
			setValue(value);
			setNexNode(nextNode);
		}
	}

}
