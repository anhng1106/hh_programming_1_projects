package Week_5;

public class ObjectsWordPairsArray {

	public static void main(String[] args) {
		WordPair[] wordList = {
				new WordPair ("school", "koulu"),
				new WordPair ("student", "opiskelija"),
				new WordPair ("textbook", "oppikirja")
		};
		
		for (WordPair wordObject : wordList)
		{
			System.out.print(wordObject.getEnglishWord() + " = " + wordObject.getFinnishWord() + "\n");
		}

	}

}
