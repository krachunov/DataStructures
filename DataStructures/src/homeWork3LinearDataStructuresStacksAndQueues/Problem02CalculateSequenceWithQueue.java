package homeWork3LinearDataStructuresStacksAndQueues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Problem02CalculateSequenceWithQueue {
	public static void calculate(int n) {
		int s1 = n;
		Queue<Integer> sequence = new LinkedList<Integer>();
		sequence.add(s1);
		int count = 50;

		while (count > 0) {
		int sNext = sequence.poll();
		System.out.print(sNext+" ");
			sequence.add(sNext+1);
			sequence.add(2*sNext+1);
			sequence.add(sNext+2);
			count--;
		}

	}

	public static void main(String[] args) {
		calculate(2);
		System.out.println();
		calculate(-1);
		System.out.println();
		calculate(1000);
	}

}
