package Week_5;

public class ObjectsSongArray {

	public static void main(String[] args) {
		Song[] songList = 
			{
				new Song("Easy on me", "Adele", 2021),
				new Song("Shivers", "Ed Sheeran", 2021),
				new Song("Holy Ghost Fire", "Larkin Poe", 2020)
			};
		
		System.out.print("=== List of songs ===");
		
		for (Song songObject : songList)
		{
			System.out.print("\n" + songObject.getArtist() + ": " + songObject.getName() + " (" + 
							songObject.getYear() + ")");
		}
		
	}

}
