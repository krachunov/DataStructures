package homeWork3LinearDataStructuresStacksAndQueues;

public class Problem03Demo {
	public static void main(String[] args) {

		Problem03ArrayStack<Integer> test = new Problem03ArrayStack<Integer>();

		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		
		
		Object[] toArr = test.toArray();
		System.out.println("Print arr");
		for (Object integer : toArr) {
			System.out.println(integer);
		}
		System.out.println("Size: " + test.getCount());

		System.out.println("Print Stack");
		int countLoop = test.getCount();
		for (int i = 0; i < countLoop; i++) {
			System.out.println(test.pop());
		}
		System.out.println("Size: " + test.getCount());
	}
}
