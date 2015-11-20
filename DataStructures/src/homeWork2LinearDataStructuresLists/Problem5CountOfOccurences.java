package homeWork2LinearDataStructuresLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem5CountOfOccurences {
	public static List<Integer> countOfOccurences(int... numbers) {
		int count = 0;
		TreeMap<Integer, Integer> numbersOfNumbers = new TreeMap<Integer, Integer>();
		for (int i : numbers) {
			if (numbersOfNumbers.get(i) != null) {
				count = numbersOfNumbers.get(i);
				count++;
				numbersOfNumbers.put(i, count);
			} else {
				numbersOfNumbers.put(i, 1);
			}
		}
		for (Map.Entry<Integer, Integer> numberEntry : numbersOfNumbers
				.entrySet()) {
			System.out.println();
			System.out.printf("The number: %d -> %d times",
					numberEntry.getKey(), numberEntry.getValue());
		}

		return null;
	}

	public static void main(String[] args) {
		countOfOccurences(3, 4, 4, 2, 3, 3, 4, 3, 2);
		System.out.println();
		System.out.println("------------------------");
		countOfOccurences(1000);
		System.out.println();
		System.out.println("------------------------");
		countOfOccurences(0,0,0);
		System.out.println();
		System.out.println("------------------------");
		countOfOccurences(7, 6, 5, 5, 6);
		System.out.println();
		System.out.println("------------------------");
	}
}
