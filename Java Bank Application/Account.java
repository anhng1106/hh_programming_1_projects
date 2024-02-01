package Week_8;

public class Account {
	// Fields

	private String accountNumber;
	private double balance;
	
	// Constructor
	
	public Account (String accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	// Methods
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean withdraw (double amount)
	{
		if (amount <= balance)
		{
			balance = balance - amount;
			
			return true;
		}
		return false;
	}

}
