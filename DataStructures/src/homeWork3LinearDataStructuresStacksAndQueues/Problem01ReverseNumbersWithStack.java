package homeWork3LinearDataStructuresStacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

import javax.sound.sampled.ReverbType;

public class Problem01ReverseNumbersWithStack {

	public static void reversePrint(String number) {

		String[] numsArrays = number.split(" ");
		int[] singleDigit = new int[numsArrays.length];

		for (int i = 0; i < numsArrays.length; i++) {
			singleDigit[i] = Integer.parseInt(numsArrays[i]);
		}
		// add element in to stack
		Stack<Integer> reverseNumber = new Stack<Integer>();
		for (int i : singleDigit) {
			reverseNumber.push(i);
		}
		// print the element from stack
		while (reverseNumber.size() > 0) {
			System.out.print(reverseNumber.pop() + " ");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the number separated with space");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();

		reversePrint(num);

	}

}
