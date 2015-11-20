package classWordTree;

import java.util.Arrays;

public class BinaryTree<T> {
	private T value;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;

	/**
	 * 
	 * @param value
	 * @param child
	 *            - the first param is Left child the second is right
	 */
	public BinaryTree(T value, BinaryTree<T> leftChild, BinaryTree<T> rightChild) {
		setValue(value);
		setLeftChild(leftChild);
		setRightChild(rightChild);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public BinaryTree<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTree<T> rightChild) {
		this.rightChild = rightChild;
	}

	private void PrintIndentedPreOrder(int indent) {
		char[] space = new char[indent];
		Arrays.fill(space, ' ');
		System.out.print(new String(space));
		System.out.println(this.value);
		if (leftChild != null) {
			this.leftChild.PrintIndentedPreOrder(indent + 1);
		}
		if (rightChild != null) {
			this.rightChild.PrintIndentedPreOrder(indent + 1);
		}
	}

	public void PrintIndentedPreOrder() {
		PrintIndentedPreOrder(0);
	}

}
