package Week_6;

import java.util.ArrayList;

public class Crew {
	
	ArrayList<Sailor> sailorList = new ArrayList<Sailor>();
	
	public Crew()
	{
		
	}
	
	public void addCrewMember (Sailor sailor)
	{
		sailorList.add(sailor);
	}
	
	public String toString()
	{
		String output = "";
		
		for (Sailor sailorObject : sailorList)
		{
			output += sailorObject.getName() + " (" + sailorObject.getEmail() + ")\n";
		}
		
		return output;
	}

}
