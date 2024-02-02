package Week_7;

public class Product {
	
	private int number;
	private String name;
	private double price;
	
	public Product (int number, String name, double price)
	{
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
}
