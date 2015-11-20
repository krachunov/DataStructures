package homeWork3LinearDataStructuresStacksAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Problem03ArrayStack<T> {
	private List<T> element;
	private int count;

	// generics in Java are not applicable to an array
	// private static final int INITIALCAPACITY = 16;

	public List<T> getElement() {
		return element;
	}

	public void setElement(List<T> element) {
		this.element = element;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Problem03ArrayStack() {
		element = new ArrayList<T>();
	}

	public void push(T element) {
		this.element.add(element);
		count++;
	}

	public T pop() {
		try {
			if (this.element.size() > 0) {
				count--;
				return element.get(count);
			}
		} catch (NoSuchElementException e) {
			return null;
		}
		return null;

	}

	public Object[] toArray() {
		if(this.element.size()>0){
			return (T[]) this.element.toArray();
		}
		System.out.println("Stack is empty");
		return null;

		
	}

}
