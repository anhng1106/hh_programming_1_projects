package Week_5;

public class ObjectsWordPairsProgram {

	public static void main(String[] args) {
		
		WordPair wp1 = new WordPair("school", "koulu");
		WordPair wp2 = new WordPair("student", "opiskelija");
		WordPair wp3 = new WordPair("textbook", "oppikirja");
		
		System.out.println(wp1.getEnglishWord() + " = " + wp1.getFinnishWord());
		System.out.println(wp2.getEnglishWord() + " = " + wp2.getFinnishWord());
		System.out.println(wp3.getEnglishWord() + " = " + wp3.getFinnishWord());

	}

}
