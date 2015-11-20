package homeWork2LinearDataStructuresLists;

public class Problem7LinkedListDemo {
	public static void main(String[] args) {
		Problem7LinkedList<Integer> myLinkedList = new Problem7LinkedList<Integer>();
		myLinkedList.add(1);
		myLinkedList.add(2);
		myLinkedList.add(3);
		myLinkedList.add(4);
		myLinkedList.add(5);
		myLinkedList.add(1);
		myLinkedList.add(7);
		
	
		myLinkedList.remove(3);
		myLinkedList.remove(6);
		
		System.out.println(myLinkedList.firstIndexOf(1));
		System.out.println(myLinkedList.lastIndexOf(1));
		
		
		
	}
}
