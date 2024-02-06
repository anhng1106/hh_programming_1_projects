package Week_5;

public class ClockTime {
	
	private int hours;
	private int minutes;
	
	public ClockTime ()
	{
		hours = 0;
		minutes = 0;
	}
	
	public void add(int newHours, int newMinutes)
	{
		if (newHours >=0 && newMinutes >=0)
		{
			hours = hours + newHours;
			minutes = minutes + newMinutes;
		}
		
		if (minutes >= 60)
		{
			hours = minutes / 60 + hours;
			minutes = minutes % 60;
		}
		
		if (hours >= 24)
		{
			hours = hours % 24;
		}
	}
	
	public String toString()
	{
		String output = null;
		
		if (hours < 10 && minutes < 10)
		{
			output = "0" + hours + ":" + "0" + minutes;
		} else if (hours < 10)
		{
			output = "0" + hours + ":" + minutes;
		} else if (minutes < 10)
		{
			output = hours + ":0" + minutes;
		} else
		{
			output = hours + ":" + minutes;
		}
		
		return output;
	}

}
