  import java.io.Console;
import java.util.Scanner;
public class Assignment10
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.console().reader());
		System.out.println("Enter the number of items in cart");
		int number=sc.nextInt();
		sc.nextLine();

		int c=number;

		Item[] items;
		items= new Item[number];

		
		
		for(c=0;c<number;c++)
		{
			Item info;
			info=new Item();

			System.out.println("Enter the item name");
			String itemName=sc.nextLine();
			info.setName(itemName);
	
			
			System.out.println("Enter the item price");
			double itemPrice=sc.nextDouble();
			sc.nextLine();
			info.setPrice(itemPrice);
			
			items[c]=info;
			
		}

			

		System.out.println("Item names and prices:");
		for(c=0;c<number;c++)
		{
			System.out.println("name="+ items[c].name +" price=" +items[c].price);
	
		}
		
		double totalPrice=0;
		
		System.out.println("The total price is:");
		for(c=0; c<number;c++)
		{
			
			double itemPrice=items[c].price;
			totalPrice= totalPrice+ itemPrice;
		}

		System.out.println(""+totalPrice);

		double averagePrice=totalPrice/number;
		System.out.println("The average price is:"+averagePrice);
		

		
	}
}
			
