package Week_7;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class ShoppingCart {

	ArrayList<Item> itemList = new ArrayList<Item>();
	
	public ShoppingCart()
	{
		
	}
	
	public void add(Product product, int quantity)
	{
		itemList.add(new Item(product, quantity));
	}
	
	public void remove(Product product)
	{
		itemList.removeIf(item -> item.getProduct().equals(product));
	}
	
	public double getTotalPrice()
	{
		double total = 0;
		
		for (Item itemObject : itemList)
		{
			total += itemObject.getSubtotal();
		}
		
		return total;
	}
	
	public String toString()
	{
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		
		String output = "";
		
		double totalPrice = getTotalPrice();
		
		if (totalPrice == 0)
		{
			output = "There are no items in the shopping cart\n";
		} else 
		{
			System.out.println("=== Shopping cart ===");
			
			for (Item itemObject : itemList)
			{
				output += itemObject.getProduct().getNumber() + ": " + itemObject.getProduct().getName() + ", quantity: " 
						+ itemObject.getQuantity() + ", unit price: " + twoDecimals.format(itemObject.getProduct().getPrice()) 
						+ ", subtotal: " + twoDecimals.format(itemObject.getSubtotal()) + "\n";
			}
			
			output += "TOTAL PRICE: " + twoDecimals.format(totalPrice) + " euros\n";
		}
		
		return output;
	}
}
