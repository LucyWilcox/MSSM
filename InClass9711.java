import java.io.Console;
import java.util.Scanner;
public class InClass9711
{
	public static void main (String args[])
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner (System.console().reader());
		String test=sc.nextLine();
		int  lengthof= test.length();
		System.out.println("Lenght of string: "+lengthof);
		System.out.println("The string is: "+test);
		
		
		int place=0;
		
		for(place=0; place< lengthof; place++)
		{
			char placechar=test.charAt(place);
			System.out.println(""+placechar);
		}

		System.out.println("");		

		for(place=lengthof-1; place>=0; place--)
		{
			char placechar=test.charAt(place);
			System.out.println(""+placechar);
		}

	
		String reversed=reverseString(test);
		System.out.println(reversed);
		
	}
	public static String reverseString (String entered)
	{
		
		int lengthof=entered.length();

		int back=0;
		String result="";
		
		for(back=lengthof-1; back>=0; back--)
		{
			char placechar=entered.charAt(back);	
			result=result+placechar;
		} 
		return result;	

	}


}
