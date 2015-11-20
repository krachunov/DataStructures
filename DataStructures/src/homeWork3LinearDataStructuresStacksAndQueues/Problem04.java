package homeWork3LinearDataStructuresStacksAndQueues;
import homeWork3LinearDataStructuresStacksAndQueues.Problem03ArrayStack;

public class Problem04 {
	public static void main(String[] args) {
		// Push / pop element
		System.out.println("TEST 1 - Push / pop element");
		Problem03ArrayStack<Integer> test = new Problem03ArrayStack<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		System.out.println(test.pop());
		System.out.println(test.pop());
		// Push / pop 1000 elements
		System.out.println("TEST 2 -  Push / pop 1000 elements");
		Problem03ArrayStack<String> test2 = new Problem03ArrayStack<String>();
		System.out.println("Count: " + test2.getCount());
		for (int i = 0; i < 1000; i++) {
			test2.push(String.valueOf(i));
		}
		System.out.println("Count after: " + test2.getCount());
		while (test2.getCount() > 0) {
			System.out.println(test2.pop());
		}
		// Pop from empty stack
		System.out.println("TEST 3 - Pop from empty stack");
		Problem03ArrayStack<String> test3 = new Problem03ArrayStack<String>();
		System.out.println(test3.pop());

		// Push / pop with initial capacity 1
		System.out.println("TEST 4 - Push / pop with initial capacity 1");
		Problem03ArrayStack<Integer> test4 = new Problem03ArrayStack<Integer>();
		System.out.println("Count: " + test4.getCount());
		test4.push(1);
		System.out.println("Count: " + test4.getCount());
		
		//ToArray():
		System.out.println("TEST 5 - ToArray(): ");
		Problem03ArrayStack<Integer> test5 = new Problem03ArrayStack<Integer>();
		test5.push(1);
		test5.push(2);
		test5.push(3);
		Object[] testArr = test5.toArray();
		
		System.out.println("Print Array");
		for (Object object : testArr) {
			System.out.println(object);
		}
		
		//Empty stack ToArray():
		System.out.println("TEST 6 - Empty stack ToArray() ");
		Problem03ArrayStack<Integer> test6 = new Problem03ArrayStack<Integer>();
		test6.toArray();
		
	}
}
