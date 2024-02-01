package Week_8;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;


public class BankProgram {

	private static Scanner input = new Scanner(System.in);
	private static ArrayList<Account> accountList = new ArrayList<Account>();
	
		// *** DO NOT change anything in the main method ***
	public static void main(String[] args) 
	{
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
		
			case 1:
				listAccounts();
				break;
		
			case 2:
				addAccount();
				break;
				
			case 3:
				depositMoney();
				break;
				
			case 4:
				withdrawMoney();
				break;
				
			case 5:
				deleteAccount();
				break;
			}

		displayMenu();
		
		choice = Integer.parseInt(input.nextLine());
		}

		System.out.println("\nThe program ends now. Bye!");
		
		input.close();
	}

		private static void displayMenu() {
			String line = "-----------------------------------------------------"
					+ "---------------------------------------------------------------";
			System.out.println(line);
			System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | " +
							 "3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
			System.out.println(line);
			System.out.print("Enter your choice: ");
		}

		// *** NB! Edit only the methods below. DO NOT add any other methods! ***

		private static void listAccounts() {
			System.out.print("\n*** Account list ***\n");
			
			DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
			
			for (Account accountListObject : accountList)
			{
				System.out.println("Number: " + accountListObject.getAccountNumber()
								+ "| Balance: " + twoDecimals.format(accountListObject.getBalance()) + " euros");
			}

		}

		private static void addAccount() {
			System.out.print("\n*** Add an account ***\n");
			
			System.out.print("Enter account number: ");
			String accountNumber = input.nextLine();
			
			if (accountList.size() == 0)
			{
				accountList.add(new Account(accountNumber));
				
				System.out.println("\nAccount created successfully!\n");
			} else 
			{
				if (findAccount(accountNumber) == null)
				{
					accountList.add(new Account(accountNumber));
					
					System.out.println("\nAccount created successfully!\n");
				} else
					{
						System.out.println("\nAccount not created. Account " + accountNumber + " exists already!");
					}
				}
		}


		// Finds an account in accountList by given account number.
		// Returns either a reference to the account object
		// OR null if the account is not found in accountList.
		private static Account findAccount(String accountNumber) {
			Account myAccount = null;
			
			for (int i = 0; i < accountList.size(); i++)
			{
				if (accountNumber.equalsIgnoreCase(accountList.get(i).getAccountNumber()))
				{
					myAccount = accountList.get(i);
				}
			}

			return myAccount;
		}

		private static void depositMoney() {
			System.out.print("\n*** Deposit money to an account ***\n");
			
			System.out.print("Enter account number: ");
			String inputAccountNumber = input.nextLine();
			
			Account currentAccount = findAccount(inputAccountNumber);
			
			if (currentAccount == null)
			{
				System.out.println("\nAccount " + inputAccountNumber + " does not exist!");
			} else
			{
				System.out.print("Enter the amount to be deposited: ");
				double amount = Double.parseDouble(input.nextLine());
				
				if (amount < 0)
				{
					System.out.println("\nCannot deposit a negative amount!");	
				} else if (amount >= 0)
				{

					currentAccount.deposit(amount);
					
					System.out.println("\nDeposit completed successfully!");	
				}	
			}
			
		}

		private static void withdrawMoney() {
			System.out.print("\n*** Withdraw money from an account ***\n");
			
			System.out.print("Enter account number: ");
			String inputAccountNumber = input.nextLine();
			
			Account currentAccount = findAccount(inputAccountNumber);
			
			if (currentAccount == null)
			{
				System.out.println("\nAccount " + inputAccountNumber + " does not exist!");
			} else 
			{
				System.out.print("Enter the amount to be withdrawn: ");
				double amount = Double.parseDouble(input.nextLine());
				
				if (amount < 0)
				{
					System.out.println("\nCannot withdraw a negative amount!");	
				} else if (amount >= 0)
				{
					if (currentAccount.withdraw(amount))
					{
						System.out.println("\nWithdrawal completed successfully!");	
					} else
					{
						System.out.println("\nWithdrawal not completed. Available balance is too low.");
					}
				}
			}

		}

		private static void deleteAccount() {
			System.out.print("\n*** Delete an account ***\n");
			
			System.out.print("Enter account number: ");
			String inputAccountNumber = input.nextLine();
			
			Account currentAccount = findAccount(inputAccountNumber);
			
			if (currentAccount != null)
			{
				accountList.remove(currentAccount);
					
				System.out.println("\nAccount deleted successfully!");	
			} else
			{
				System.out.println("\nNothing deleted. Account " + inputAccountNumber + " does not exist!");	
			}

		}
}
	// End

