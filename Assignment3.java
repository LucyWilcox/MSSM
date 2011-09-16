import java.io.Console;
import java.util.Scanner;
public class Assignment3
{
public static void main (String args[])
	{
	{Scanner sc= new Scanner (System.console().reader());

	System.out.println("Enter the price:");
	double price=sc.nextDouble();

	System.out.println("Enter the amout payed:");
	double given=sc.nextDouble();

	double totalchange=given-price;

	int twenties= (int)(totalchange/20);
	System.out.println("Twenties:"+twenties);
	double la20= totalchange-twenties*20;

	int tens= (int)(la20/10);
	System.out.println("Tens:"+tens);
	double la10=la20-tens*10;

	int fives=(int)(la10/5);
	System.out.println("Fives:"+fives);
	double la5=la10-fives*5;

	int ones=(int)(la5);
	System.out.println("Ones:"+ones);
	double la1=la5-ones;

	double quarters=(int)(la1*4);
	System.out.println("Quarters:"+quarters);
	double laq=la1-quarters/4;

	double dimes=(int)(laq*10);
	System.out.println("Dimes:"+dimes);
	double lad=laq-dimes/10;

	double nickels=(int)(lad*20);
	System.out.println("Nickels:"+nickels);
	double lan=lad-nickels/20;

	double pennies= (int)(lan*100);
	System.out.println("Pennies:"+pennies);
	}
}

