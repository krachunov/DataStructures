package homeWork1;

import java.io.IOException;

public class StupidListDemo {

	public static void main(String[] args) throws IOException {
		StupidList<Integer> stupidList = new StupidList<Integer>();

		System.out.println("Problem 1.	Add(T) Complexity");
		stupidList.Add(1);
		stupidList.Add(2);
		stupidList.Add(3);
		stupidList.Add(4);
		stupidList.Add(5);
		stupidList.Add(6);
		stupidList.Add(7);
		stupidList.Add(8);
		stupidList.Add(9);

		System.out.println("Problem 2.Remove(index) Complexity – Worst Case");
		stupidList.RemoveLast();
		System.out.println("Problem 3.Remove(index) Complexity – Best Case");
		stupidList.RemoveFirst();
		System.out.println("Problem 4.Remove(index) Complexity – Average Case");
		stupidList.Remove((stupidList.getLength() - 1) / 2);
		System.out.println("Problem 5.	RemoveFirst(T) Complexity");
		stupidList.RemoveFirst();
		System.out.println("Problem 6.	RemoveLast(T) Complexity");
		stupidList.RemoveLast();

		System.out.println("Problem 7. Length Complexity");
		stupidList.getLength();

		System.out.println("Problem 8.	This[index] Complexity");
		stupidList.getIndex(3);
		System.out.println("Problem 9.	First Complexity");
		stupidList.getIndex(0);
		System.out.println("Problem 10.	Last Complexity");
		stupidList.getIndex(stupidList.getLength2()-1);

	}

}
