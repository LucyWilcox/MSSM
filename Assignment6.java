import java.io.Console;
import java.util.Scanner;
public class Assignment6
{
	public static void main (String args[])
		{
			
			Scanner sc=new Scanner (System.console().reader());
			System.out.println("Enter desired range of multiplication table");
			int last=sc.nextInt();
			
			int column=1;

			int row =1;
			

			for(row=1; row <= last; row++)
			{
				System.out.printf("%4d", row);

				for(column=1;column<=last;column++)
				{
					System.out.printf("%4d",column*row);			
				}
			
				System.out.println("");
			}
			
			
		}
}

