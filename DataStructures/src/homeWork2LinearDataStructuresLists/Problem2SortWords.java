package homeWork2LinearDataStructuresLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem2SortWords {
	public static List<String> addLineTolist() {
		Scanner scan = new Scanner(System.in);
		List<String> listOfWord = new ArrayList<String>();
		System.out.println("Enter the text");
		String inputTetx = scan.nextLine();

		for (String field : inputTetx.split(" +")) {
			listOfWord.add(field);
		}
		return listOfWord;
	}

	public static void sortList(List<String> list) {
		Collections.sort(list);

	}

	public static void main(String[] args) {
		List<String> wordList = addLineTolist();
		for(String s:wordList){
			System.out.print(s+" ");
		}
		sortList(wordList);
		System.out.println();
		for(String s:wordList){
			System.out.print(s+" ");
		}

	}
}
