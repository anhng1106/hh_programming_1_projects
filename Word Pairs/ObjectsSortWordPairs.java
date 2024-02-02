package Week_7;

import java.util.Scanner;
import java.util.ArrayList;

public class ObjectsSortWordPairs {

	public static void main(String[] args) {
		ArrayList<WordPair> wordList = new ArrayList<WordPair>();
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an English word (quit ends): ");
		String inputEnglishWord = input.nextLine();
		
		String inputFinnishWord;
		
		while (!inputEnglishWord.equalsIgnoreCase("quit"))
		{
			System.out.print("Enter a Finnish word: ");
			inputFinnishWord = input.nextLine();
			
			wordList.add(new WordPair(inputEnglishWord, inputFinnishWord));
			
			System.out.println();
			
			System.out.print("Enter an English word (quit ends): ");
			inputEnglishWord = input.nextLine();
		}
		
		input.close();

	}

}
