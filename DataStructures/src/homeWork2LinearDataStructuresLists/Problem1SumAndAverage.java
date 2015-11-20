package homeWork2LinearDataStructuresLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1SumAndAverage {
	public static List<Integer> addAndSaveNumberToList() {
		Scanner scan = new Scanner(System.in);
		List<Integer> listOfNumber = new ArrayList<Integer>();
		System.out.println("Enter the number separated by a space");
		String inputNumber = scan.nextLine();

		for (String field : inputNumber.split(" +")) {
			listOfNumber.add(Integer.parseInt(field));
		}
		return listOfNumber;
	}

	public static int sumOfElement(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

	public static double averageNumberOfTheList(List<Integer> list) {
		Integer tempSum = sumOfElement(list);
		double average = tempSum.doubleValue() / list.size();
		return average;

	}

	public static void main(String[] args) {

		List tempListNumber = addAndSaveNumberToList();
		int sumOfElements = sumOfElement(tempListNumber);
		System.out.println("Sum=" + sumOfElements);

		double averageNumber = averageNumberOfTheList(tempListNumber);
		System.out.println("Average=" + averageNumber);
	}
}
