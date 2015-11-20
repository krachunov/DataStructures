package classWordTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeClassWork<T> {
	private T value;
	private List<TreeClassWork<T>> children;

	public TreeClassWork(T value, TreeClassWork<T>... childrens) {
		setValue(value);
		setChildren(childrens);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public List<TreeClassWork<T>> getChildren() {
		return children;
	}

	public void setChildren(TreeClassWork<T>[] childrens) {
		children = new ArrayList<TreeClassWork<T>>();
		for (TreeClassWork<T> child : childrens) {
			children.add(child);
		}
	}

	private void printTree(int indent) {
		char[] space = new char[indent];
		Arrays.fill(space, ' ');
		System.out.print(new String(space));
		System.out.println(this.value);
		for (TreeClassWork<T> child : children) {
			child.printTree(indent + 1);
		}
	}

	public void print() {
		printTree(0);
	}

	public void each(Runnable action) {

	}

}
