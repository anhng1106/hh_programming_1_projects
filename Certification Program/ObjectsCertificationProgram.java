package Week_5;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormatSymbols;

public class ObjectsCertificationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Coach[] coachList = new Coach[4];

		String name;
		int score;
		
		for (int i = 0; i < coachList.length; i++)
		{
			System.out.print("Enter coach name: ");
			name = input.nextLine();
			
			System.out.print("Enter " + name + "'s score: ");
			score = Integer.parseInt(input.nextLine());
			
			coachList[i] = new Coach(name, score);
		}
		
		System.out.print("\nEnter the minimun passing score: ");
		int passScore = Integer.parseInt(input.nextLine());
		
		System.out.println("\nPassing scores");
		
		double passingCoach = 0;
		
		for (Coach coachObject : coachList)
		{
			if (coachObject.getScore() >= passScore)
			{
				passingCoach++;
				System.out.println(coachObject.getName() + " (" + coachObject.getScore() + "points)" );
			}
		}
		
		double passingRate = passingCoach / coachList.length * 100;
		
		DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
		decimalFormatSymbols.setDecimalSeparator('.');
		new DecimalFormat("0.0", decimalFormatSymbols).format(passingRate);
		
		System.out.print("\nThe passing rate is " + passingRate + "%");
		
		input.close();
		
	}

}
