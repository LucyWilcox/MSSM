import java.io.Console;
import java.util.Scanner;
public class Assignment5
{
	public static void main (String args[])
		{
		Scanner sc= new Scanner (System.console().reader());

		System.out.println("1 for circle, 2 for triangle, 3 for rectangle");

		int choice=sc.nextInt();

		if (choice == 1)
		{
			System.out.println("To  press any number but 6 to continue to exit enter end for the radius");  //I know this is not a vaild way to acctually exit because it just errors out but I can't figure out how to get it to exit, I will come in Tuesday
			int exit=sc.nextInt();
			
			while(exit != 6)
			{
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();

			printCircle(radius);

			}
				
			
		}
		else if (choice == 2)  //I'm going to hold off on finishing the triangle and rectange parts until I get the circle one down
		{
			System.out.println("Enter the base of  the triangle:");
			double base=sc.nextDouble();

			System.out.println("Enter the height of the triangle:");
			double height=sc.nextDouble();

			printTriangle(base, height);
		}
		else
		{
			System.out.println("Enter the length of the rectangle:");
			double length=sc.nextDouble();

			System.out.println("Enter the width of the rectangle");
			double width=sc.nextDouble();

			printRectangle(length, width);
		}
		
	
		}

	public static double areaCircle (double radius)
		{
		double areacircle= 3.14159*radius*radius;
		return areacircle;
		}

	public static double areaTriangle (double base, double height)
		{
		double areatriangle=.5*base*height;
		return areatriangle;
		}

	public static double areaRectangle (double length, double width)
		{
		double arearectangle=length*width;
		return arearectangle;
		}
	
	public static void printCircle (double radius)
		{
		double areacircle=areaCircle(radius);
		System.out.println("Area of the circle:"+areacircle +" when its radius is:" +radius);
		}
	
	public static void printTriangle (double base, double height)
		{
		double areatriangle=areaTriangle (base, height);
		System.out.println("Area of the triangle:"+areatriangle +" when its base is:" +base +" and its height is:" +height);
		}

	public static void printRectangle (double length, double width)
		{
		double arearectangle=areaRectangle (length, width);
		System.out.println("Area of the rectangle:"+arearectangle +" when its lenght is:" +length +" and when its width is:" +width);
		}

}
		


