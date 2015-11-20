/**
 * Problem 7
 */
package homeWork2LinearDataStructuresLists;

public class Problem7LinkedList<T> {

	private Problem7ListNode<T> first = null;
	private Problem7ListNode<T> last = null;
	private static int count = 0;

	public Problem7LinkedList() {

	}

	public Problem7ListNode<T> getFirst() {
		return first;
	}

	public void setFirst(Problem7ListNode<T> first) {
		this.first = first;
	}

	public Problem7ListNode<T> getCurrent() {
		return last;
	}

	public void setCurrent(Problem7ListNode<T> current) {
		this.last = current;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Problem7LinkedList.count = count;
	}

	public void add(T element) {
		if (this.first == null) {
			// create first element
			first = new Problem7ListNode<T>(element);
			last = first;
			count++;
			// create second element
		} else if (this.last == null) {
			last = new Problem7ListNode<T>(element);
			this.first.setNextElement(last);
			count++;
			// creation of each subsequent
		} else {
			Problem7ListNode<T> lastElement = new Problem7ListNode<T>(element);
			last.setNextElement(lastElement);
			last = lastElement;
			count++;
		}
	}

	/**
	 * 
	 * @param index
	 *            - index which seek
	 * @return -search index
	 */
	public Problem7ListNode<T> findElementByIndex(int index) {
		Problem7ListNode<T> currentElement = this.first;
		for (int i = 0; i < index; i++) {
			Problem7ListNode<T> nextElement = currentElement.getNextElement();
			currentElement = nextElement;
		}
		return currentElement;
	}

	public void remove(int index) {
		if (index < 0 || index >= count) {
			throw new ArrayIndexOutOfBoundsException();
			// do this if element who want to remove is first
		} else if (index == 0) {
			Problem7ListNode<T> nextElement = first.getNextElement();
			first = nextElement;
			// do this if element who want to remove is last
		} else if (index == count - 1) {
			Problem7ListNode<T> previousElement = findElementByIndex(index - 1);
			last = previousElement;
			last.setNextElement(null);
			// do this if the item you want to remove in the middle
		} else {
			Problem7ListNode<T> previousElement = findElementByIndex(index - 1);
			Problem7ListNode<T> nextElement = findElementByIndex(index + 1);
			previousElement.setNextElement(nextElement);
		}
	}

	/**
	 * 
	 * @param item
	 *            - search element
	 * @return - returns the first index which is found or -1 if the element is
	 *         not found
	 */
	public int firstIndexOf(T item) {
		Problem7ListNode<T> currentElement = this.first;
		int tempCount = 0;
		for (int i = 0; i < count; i++) {
			if ((currentElement.getValue()) == item) {
				return tempCount;
			}
			currentElement = currentElement.getNextElement();
			tempCount++;
		}
		return -1;
	}

	/**
	 * 
	 * @param item
	 *            - search element
	 * @return - returns the last index which is found or -1 if the element is
	 *         not found
	 */
	public int lastIndexOf(T item) {
		Problem7ListNode<T> currentElement = this.last;
		int tempCount = count - 1;
		for (int i = (count - 1); i >= 0; i--) {
			if ((currentElement.getValue()) == item) {
				return tempCount;
			} else {
				int previousIndex = tempCount - 1;
				currentElement = findElementByIndex(previousIndex);
				tempCount--;
			}
		}
		return -1;
	}
}
