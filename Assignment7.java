import java.io.Console;
import java.util.Scanner;
public class Assignment7
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.console().reader());
		System.out.println("Enter an integer");
		int number=sc.nextInt();
		
		

		while(number>0)
		{
			int digit=number%10;
			number=(number-digit)/10;
		
			print(digit);
		}
		
		
	}
	public static void print (int digit)
	{	
		switch (digit)
		{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
		}
	}	
		
}