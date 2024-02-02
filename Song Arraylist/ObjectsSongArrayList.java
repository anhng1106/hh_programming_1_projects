package Week_6;

import java.util.ArrayList;

import Week_5.Song;

public class ObjectsSongArrayList {

	public static void main(String[] args) {
		ArrayList<Song> songList = new ArrayList<Song>();
		
		Song song1 = new Song("Easy on me", "Adele", 2021);
		Song song2 = new Song("Shivers", "Ed Sheeran", 2021);
		Song song3 = new Song("Holy Ghost Fire", "Larkin Poe", 2020);
		
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		
		System.out.println("=== List of songs ===");
		
		for (Song songObject : songList)
		{
			System.out.println(songObject.getArtist() + ": " + 
							songObject.getName() + " (" + songObject.getYear() + ")");
		}
		

	}

}
