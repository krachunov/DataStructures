package homeWork2LinearDataStructuresLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3LongestSubsequence {

	public static List<Integer> returnLongestSubsequence(List<Integer> list) {
		int startIndex = -1;
		int bestLong = 1;
		int tempElement = 0;

		int i = 0;
		int countLong = 1;
		int start = Integer.MAX_VALUE;
		int end = -1;

		while (i < list.size() - 1) {
			int StartElement = list.get(i);
			int nextIndex = i;
			nextIndex++;
			int NextElement = list.get(nextIndex);
			int tempStart = -1;
			int tempEnd = -1;

			while (StartElement == NextElement) {
				countLong++;
				nextIndex++;
				if (nextIndex == list.size()) {
					tempStart = i;
					tempEnd = nextIndex - 1;
					i = nextIndex;
					/*
					 * If several sequences has the same longest length, return
					 * the leftmost of them
					 */
					if (tempStart < start) {
						start = tempStart;
						end = tempEnd;
						System.out.println("start: " + start);
						System.out.println("end: " + end);
						break;
					}
				}
				NextElement = list.get(nextIndex);
				if (StartElement != NextElement) {
					tempStart = i;

					tempEnd = nextIndex;
					i = nextIndex;
					/*
					 * If several sequences has the same longest length, return
					 * the leftmost of them
					 */
					if (tempStart < start) {
						start = tempStart;
						end = tempEnd;
						break;
					}
				}
			}
			i++;
			if (i == list.size()) {
				break;
			}
		}
		if (start > list.size()) {
			throw new NullPointerException("No series of identical numbers");

		} else {
			
			List<Integer> subList = new ArrayList<Integer>();
			if ((end + 1) == list.size()) {
				subList = list.subList(start, end + 1);
			} else {
				subList = list.subList(start, end);
			}
			return subList;
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(112);
		list.add(11);
		list.add(3);
		list.add(1);
		list.add(1);
		list.add(5);

		List<Integer> subList = returnLongestSubsequence(list);

		for (Integer i : subList) {
			System.out.println(i);
		}

	}
}
