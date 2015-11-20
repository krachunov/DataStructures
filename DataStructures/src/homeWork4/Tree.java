package homeWork4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

public class Tree<T> {
	private T value;
	private Tree<T> parent;
	private List<Tree<T>> children;
	public static TreeMap<Object, Tree<Object>> nodeByValue = new TreeMap<Object, Tree<Object>>();

	public Tree() {
		nodeByValue = new TreeMap<Object, Tree<Object>>();
	}

	public Tree(T value) {
		setValue(value);

		nodeByValue.put((Object) value, (Tree<Object>) this);
	}

	@SuppressWarnings("unchecked")
	public Tree(T value, Tree<T>... children) {
		setValue(value);
		if (children != null) {
			this.children = new ArrayList<Tree<T>>();

			for (Tree<T> child : children) {
				child.setParent(this);
				this.children.add(child);
			}
		}
		nodeByValue.put((Object) value, (Tree<Object>) this);
	}

	public Tree(Tree<Object> child) {
	}

	public TreeMap<Object, Tree<Object>> getNodeByValue() {
		return nodeByValue;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Tree<T> getParent() {
		return parent;
	}

	public void setParent(Tree<T> parent) {
		this.parent = parent;
	}

	public List<Tree<T>> getChildren() {
		return children;
	}

	public void setChildren(Tree<T> childrens) {
		children = new ArrayList<Tree<T>>();
		this.children.add(childrens);
	}

	/**
	 * recursive method
	 * 
	 * @param indent
	 */
	private void printTree(int indent) {
		char[] space = new char[indent];
		Arrays.fill(space, ' ');
		System.out.print(new String(space));
		System.out.println(this.value);
		if (children != null) {
			for (Tree<T> child : this.children) {
				child.printTree(indent + 1);
			}
		}
	}

	public void print() {
		printTree(0);
	}

	public static Tree<Object> getTreeNodeByValue(Object key) {
		if (!nodeByValue.containsKey(key)) {
			Tree<Object> newNode = (Tree<Object>) new Tree<Object>(key);
			nodeByValue.put(key, newNode);
		}
		return (Tree<Object>) nodeByValue.get((Object) key);
	}

	public void printMap() {
		TreeMap<Object, Tree<Object>> mapToPrint = getNodeByValue();
		for (Entry<Object, Tree<Object>> entry : mapToPrint.entrySet()) {
			System.out.println("Key: " + entry.getKey()
					+ ". number of children: "
					+ (entry.getValue().getChildren() != null) != null ? entry
					.getValue().getChildren().size() : 0);
		}
	}

	/**
	 * 
	 * @return first node without parent
	 */
	public static Tree<Object> findeRootNode() {
		for (Entry<Object, Tree<Object>> entry : nodeByValue.entrySet()) {
			if (entry.getValue().getParent() == null) {
				return entry.getValue();
			}
		}
		return null;
	}

	public static List<Tree<Object>> findMiddleNodes() {
		List<Tree<Object>> listMiddleNode = new ArrayList<Tree<Object>>();

		for (Entry<Object, Tree<Object>> entry : nodeByValue.entrySet()) {
			Tree<Object> currentTree = entry.getValue();
			if (currentTree.getParent() != null && currentTree.children != null) {
				listMiddleNode.add(entry.getValue());
			}
		}
		return listMiddleNode;
	}

	public static List<Tree<Object>> allLeafNodes() {
		List<Tree<Object>> allLeafNodes = new ArrayList<Tree<Object>>();
		for (Entry<Object, Tree<Object>> entry : nodeByValue.entrySet()) {
			if (entry.getValue().getParent() != null
					&& entry.getValue().getChildren() == null) {
				allLeafNodes.add(entry.getValue());
			}
		}
		return allLeafNodes;
	}

	@SuppressWarnings("unchecked")
	/**
	 * DFS - linearly
	 */
	public void longestPath() {
		Tree<Object> startNode = findeRootNode();
		Stack<Object> stack = new Stack<Object>();
		stack.add((T) startNode);
		do {
			startNode = (Tree<Object>) stack.pop();
			System.out.println(startNode.getValue());
			if (startNode.getChildren() != null) {
				for (Tree<Object> child : startNode.getChildren()) {
					stack.add((Object) child);
				}
			}
		} while (stack.size() != 0);
	}

	@SuppressWarnings("unchecked")
	/**
	 * Recursive method - DFS
	 * @param start - Node to start
	 * @param i - level of depth
	 */
	public void longestPath(Tree start, int i) {
		System.out.println("Deep: " + i);
		Tree<T> startNode = start;
		Stack<T> stack = new Stack<T>();
		stack.add((T) startNode);

		System.out.println(startNode.getValue());
		if (startNode.getChildren() != null) {
			for (Tree child : startNode.getChildren()) {
				stack.add((T) child);
				longestPath(child, i + 1);
			}
		} else {
			startNode = (Tree<T>) stack.pop();

		}
	}

	/**
	 * prints level of depth
	 * 
	 * @param start
	 *            -Node to start
	 */
	public void longestPath(Tree start) {
		longestPath(start, 1);
	}

}
