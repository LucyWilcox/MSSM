import java.io.Console;
import java.util.Scanner;
public class Assignment9
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.console().reader());

		System.out.println("Enter the wall length in feet");
		double length=sc.nextDouble();

		System.out.println("Enter the stud spacing");
		double spacing=sc.nextDouble();
		
		System.out.println("Enter the stud thickness");
		double thickness=sc.nextDouble();

		int number=(int)(length/spacing)+1;
		
		
		double[] array;
		array=new double[number];

		for(int c=0; c<number; c++)
		{
			if(c==0)
			{
				double placement=0;
				array[c]=placement;
			}
			
			else if(c==(number-1))
			{
				double placement=length-thickness;
				array[c]=placement;
			}

			else
			{
				double placement=(c*spacing)-(thickness/2);
				array[c]=placement;
			}

		}
			
		
		double last=array[number-1];
		double last2=array[number-2];
		double distance=last-last2;


		if(distance>thickness)
		{
			System.out.println("The number of studs needed is:" + number);

			System.out.println("Stud placement:");
	
			for(int c=0; c<number; c++)
			{
				System.out.println(""+array[c]);
		
			}
		}

		else
		{
			System.out.println("The number of studs needed is:" + (number-1));
		
			System.out.println("Stud placement:");

			for(int c=0; c<(number-2);c++)
			{
				System.out.println(""+array[c]);
			}
			
			for(int c=0; c==number-1;c++)
			{
				System.out.println(""+array[c]);
			}
		}
	}		
}
		