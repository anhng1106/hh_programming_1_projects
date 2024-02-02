package Review;

public class Timer {
	
	private int minutes;
	private int seconds;
	private int totalSeconds;
	
	public Timer()
	{
		minutes = 0;
		seconds = 0;
		totalSeconds = 0;
	}
	
	public void addSeconds(int seconds)
	{
		if (0 <= seconds && seconds <= 59)
		{
			this.totalSeconds = totalSeconds + seconds;
		}
		
		if (totalSeconds <= 59)
		{
			minutes = 0;
			this.seconds = this.totalSeconds;
		} else
		{
			minutes = this.totalSeconds / 60;
			this.seconds = this.totalSeconds % 60;
		}
	}
	
	public void reset()
	{
		minutes = 0;
		seconds = 0;
		totalSeconds = 0;
	}
	
	public String toString()
	{
		return ("0" + minutes + ":" + seconds);
	}

}
