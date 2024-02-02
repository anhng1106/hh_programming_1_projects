package Week_6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ObjectsCityNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> cityList = new ArrayList<String>();
		
		System.out.print("Enter city name: ");
		String cityName = input.nextLine();
		
		while (!cityName.equalsIgnoreCase("quit"))
		{
			cityList.add(cityName);
			
			System.out.print("Enter city name: ");
			cityName = input.nextLine();
		}
		
		System.out.println();
		
		Collections.sort(cityList);
		
		for (String cityObject : cityList)
		{
			System.out.println(cityObject.toUpperCase());
		}

		input.close();
	}

}
