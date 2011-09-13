import java.io.Console;
import java.util.Scanner;
public class InClass912
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.console().reader());
		System.out.println("Enter number of strings");
		int number=sc.nextInt();
		int c=number;

		String[] words;
		words= new String[number];
	
		for(c=0;c<number;c++)
		{
			System.out.println("Enter string");
			String term=sc.nextLine();
			sc.nextLine();
			words[c]=term;
		}
		
		for(c=0;c<=number; c++)
		{
			System.out.println(""+words[c]);
		}
	}
}