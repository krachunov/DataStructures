package homeWork2LinearDataStructuresLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem4RemoveOddOccurences {

	public static List<Integer> removeOddOccurences(int... numbers) {
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
		}
		List<Integer> newList = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> numberEntry : numbersOfNumbers
				.entrySet()) {
			if (numberEntry.getValue() == 1) {
				// newList.add(numberEntry.getKey());
			} else if ((numberEntry.getValue() % 2) == 0) {
				for (int i = 0; i < numberEntry.getValue(); i++) {
					newList.add(numberEntry.getKey());
				}
			} else {

			}

		}
		return newList;
	}

	public static void main(String[] args) {

		List<Integer> subList1 = removeOddOccurences(1, 2, 3, 4, 1);
		List<Integer> subList2 = removeOddOccurences(1, 2, 3, 4, 5, 3, 6, 7, 6, 7, 6);
		List<Integer> subList3 = removeOddOccurences(1, 2, 1, 2, 1, 2);
		List<Integer> subList4 = removeOddOccurences(3, 7, 3, 3, 4, 3, 4, 3, 7);
		List<Integer> subList5 = removeOddOccurences(1, 1);
		
		for (Integer integer : subList4) {
			System.out.println(integer);
		}
	}
}
