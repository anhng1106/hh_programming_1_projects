package Week_5;

import java.util.Scanner;

public class ObjectsTranslatorArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		WordPair[] wordList = {
				new WordPair("bird", "lintu"),
				new WordPair("bar", "baari"), 
				new WordPair("bus", "bussi"), 
				new WordPair("car", "auto"), 
				new WordPair("cat", "kissa"),
				new WordPair("dog", "koira")
		};
		
		String output = "Unknown word";
		
		System.out.print("Enter an English word: ");
		String inputWord = input.nextLine();
		
		for (WordPair wordObject : wordList)
		{
			if (inputWord.equalsIgnoreCase(wordObject.getEnglishWord()))
			{
				output = wordObject.getFinnishWord();
			}
		}
		
		System.out.print(output);
		
		input.close();
	}

}
