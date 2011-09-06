import java.io.Console;
import java.util.Scanner;
public class Assignment6
{
	public static void main (String args[])
		{
			
			Scanner sc=new Scanner (System.console().reader());
			System.out.println("Enter desired range of multipication table");
			int last=sc.nextInt();

			for(int first=1; first==last; first++)
			{
			
				System.out.printf("%4d", first);
				
		
			}
		}
}

