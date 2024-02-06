package Week_5;

public class Song {
	
	private String name;
	private String artist;
	private int year;
	
	public Song(String name, String artist, int year)
	{
		this.name = name;
		this.artist = artist;
		this.year = year;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getArtist()
	{
		return artist;
	}

	public int getYear()
	{
		return year;
	}

	public String toString()
	{
		return name + " (" + artist + ", " + year + ")\n";
	}
}
