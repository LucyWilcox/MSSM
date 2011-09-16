import java.io.Console;
import java.util.Scanner;
public class Assignment4edit
{
	public static void main (String args[])
		{
		Scanner sc= new Scanner (System.console().reader());

		System.out.println("1 for circle, 2 for triangle, 3 for rectangle");

		int choice=sc.nextInt();

		if (choice == 1)
		{
			System.out.println("Enter the radius:");
			double radius=sc.nextDouble();

			printCircle(radius);
		}
		else if (choice == 2)
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
		


