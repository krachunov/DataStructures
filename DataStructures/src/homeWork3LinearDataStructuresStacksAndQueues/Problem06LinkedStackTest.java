package homeWork3LinearDataStructuresStacksAndQueues;


import homeWork3LinearDataStructuresStacksAndQueues.Problem05LinkedStack;

public class Problem06LinkedStackTest {
	public static void main(String[] args) {
		Problem05LinkedStack<Integer> a = new Problem05LinkedStack<Integer>();

		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		System.out.println("Size " + a.getCount());
		Object[] arr = a.toArray();

		System.out.println("Print array");
		for (Object object : arr) {
			System.out.print(object + " ");
		}

		System.out.println();
		System.out.println("Print Stack");
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println("Size " + a.getCount());
	}

}
