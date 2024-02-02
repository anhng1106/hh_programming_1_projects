package Week_6;

import java.util.Scanner;
import java.util.ArrayList;

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<WordPair> wordList = new ArrayList<WordPair>();
		
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		
		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();
		
		String finnishWord;
		
		while (!englishWord.equalsIgnoreCase("ok"))
		{
			
			System.out.print("Enter a Finnish word: ");
			finnishWord = input.nextLine();
			
			wordList.add(new WordPair(englishWord, finnishWord));
			
			System.out.print("\nEnter an English word: ");
			englishWord = input.nextLine();
			
		}
		
		System.out.println("\n=== English-Finnish translation service (quit ends) ===");
		
		System.out.print("Enter an English word: ");
		String inputEnglishWord = input.nextLine();
		
		String output = "";
		
		boolean wordFound = false;
		
		while (!inputEnglishWord.equalsIgnoreCase("quit"))
		{
			for (WordPair wordObject : wordList)
			{
				if (inputEnglishWord.equalsIgnoreCase(wordObject.getEnglishWord()))
				{
					output = wordObject.getFinnishWord();
					wordFound = true;		
					break;
				}
			}
			
			if (wordFound == true)
			{
				System.out.println(output);
			} else 
			{
				System.out.println("Unknown word");
			}
			
			wordFound = false;
			output = "";
			
			System.out.print("\nEnter an English word: ");
			inputEnglishWord = input.nextLine();
		}
		
		input.close();

	}

}
