import java.io.Console;
import java.util.Scanner;
public class InClass913
{
	public static void main (String args[])
	{
	double[] arrayOne= readArray();
	printArray(arrayOne);
		
	}

	public static double[] readArray()
	{
		Scanner sc=new Scanner (System.console().reader());
		System.out.println("Enter the number of values in the array");
		int numberOf=sc.nextInt();

		double[] theArray;
		theArray=new double[numberOf];
		
		for(int c=0;c<numberOf; c++)
		{
			System.out.println("Enter the value");
			double value=sc.nextDouble();
			theArray[c]=value;
		}
		
		return theArray;
	}

	public static void printArray(double[] array)
	{
		
		int arrayLength= array.length;
		
		for(int c=0;c<arrayLength;c++)
		{
			System.out.println(""+array[c]);
		}
	}



	/*
	public static void sum()
	{
		double[] array=readArray();
		int arrayLength=array.length;
	
		for(int c=0; c<arrayLength;c++)
		{
			double total
			
	*/
}
		
		