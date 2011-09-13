import java.io.Console;
import java.util.Scanner;
public class Assignment8
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.console().reader());
		System.out.println("Enter the number of items in cart");
		int number=sc.nextInt();

		int c=number;

		String[] items;
		items= new String[number];

		double[] prices;
		prices=new double[number];
	
		for(c=0;c<number;c++)
		{
			System.out.println("Enter the item name");
			String itemName=sc.nextLine();
			sc.nextLine();
			items[c]=itemName;
	
			
			System.out.println("Enter the item price");
			double price=sc.nextDouble();
			prices[c]=price;
		
		
		}

		
		System.out.println("Item list:");
		for(c=0;c<number;c++)
		{
			System.out.println(""+ items[c]);
		}
		
		double totalPrice=0;
		
		System.out.println("The total price is:");
		for(c=0; c<number;c++)
		{
		double itemPrice=prices[c];
		totalPrice= totalPrice+ itemPrice;
		}
		System.out.println(""+totalPrice);

		double averagePrice=totalPrice/number;
		System.out.println("The average price is:"+averagePrice);

		
	}
}
			
