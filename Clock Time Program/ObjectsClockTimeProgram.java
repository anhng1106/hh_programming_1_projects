package Week_5;

import java.util.Scanner;

public class ObjectsClockTimeProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ClockTime clockTime = new ClockTime();
		
		System.out.print("Enter hours to add: ");
		int hours = Integer.parseInt(input.nextLine());
		
		while (hours >= 0) {
			System.out.print("Enter minutes to add: ");
			int minutes = Integer.parseInt(input.nextLine());
		 
			clockTime.add(hours, minutes);
			System.out.println(clockTime + "\n");
		 
			System.out.print("Enter hours to add: ");
			hours = Integer.parseInt(input.nextLine());
		 }
		 
		input.close();

	}

}
