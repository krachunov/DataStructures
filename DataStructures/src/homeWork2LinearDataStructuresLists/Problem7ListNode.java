/**
 * Problem7
 */
package homeWork2LinearDataStructuresLists;

public class Problem7ListNode<T> {
	private T value;
	private Problem7ListNode<T> nextElement;

	/**
	 * 
	 * @param element
	 *            - create first element
	 */
	public Problem7ListNode(T element) {
		setValue(element);
		setNextElement(null);
	}

	/**
	 * 
	 * @param element
	 *            - create any follow
	 * @param nexElement
	 */
	public Problem7ListNode(T element, Problem7ListNode<T> nexElement) {
		setValue(element);
		setNextElement(nexElement);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Problem7ListNode<T> getNextElement() {
		return nextElement;
	}

	public void setNextElement(Problem7ListNode<T> nexElement) {
		this.nextElement = nexElement;
	}
}
