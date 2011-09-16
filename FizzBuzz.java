import java.io.Console;
import java.util.Scanner;
public class FizzBuzz
{
	public static void main (String args[])
	{
		double number=1;
		

		for(number=1; number<=100; number++)
		{
		
				
			if(number%3==0)
			{
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(""+number);
			}
			
		}
	}
}