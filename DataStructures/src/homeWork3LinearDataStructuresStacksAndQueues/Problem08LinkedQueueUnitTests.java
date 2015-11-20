package homeWork3LinearDataStructuresStacksAndQueues;
import homeWork3LinearDataStructuresStacksAndQueues.Problem07LinkedQueue;

public class Problem08LinkedQueueUnitTests {

	public static void main(String[] args) {
		Problem07LinkedQueue<Integer> linkedQueue = new Problem07LinkedQueue<Integer>();

		System.out.println("Stack size " + linkedQueue.getCount());
		linkedQueue.enqueue(1);
		System.out.println("Stack size " + linkedQueue.getCount());
		linkedQueue.enqueue(2);
		linkedQueue.enqueue(3);
		linkedQueue.enqueue(4);
		System.out.println("Stack size " + linkedQueue.getCount());
		System.out.println();
		Object[] testArray = linkedQueue.toArray();

		System.out.println("Array:");
		for (Object object : testArray) {
			System.out.print(object + " ");
		}
		System.out.println();
		System.out.println("Print head " + linkedQueue.deEnqueue());
		System.out.println("Print head " + linkedQueue.deEnqueue());
		System.out.println("Stack size " + linkedQueue.getCount());

		System.out.println("Print head " + linkedQueue.deEnqueue());
		System.out.println("Print head " + linkedQueue.deEnqueue());
		System.out.println("Print head " + linkedQueue.deEnqueue());
		System.out.println("Print head " + linkedQueue.deEnqueue());
//		System.out.println("Stack size " + linkedQueue.getCount());
	}

}
