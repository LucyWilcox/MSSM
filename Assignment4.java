import java.io.Console;
import java.util.Scanner;
public class Assignment4
{
	public static void main (String args[])
		{
		Scanner sc= new Scanner (System.console().reader());
		System.out.println("Enter the radius:");
		double radius=sc.nextDouble();

		System.out.println("Enter the base of  the triangle:");
		double base=sc.nextDouble();

		System.out.println("Enter the height of the triangle:");
		double height=sc.nextDouble();

		System.out.println("Enter the length of the rectangle:");
		double length=sc.nextDouble();

		System.out.println("Enter the width of the rectangle");
		double width=sc.nextDouble();

		printCircle(radius);
		printTriangle(base, height);
		printRectangle(length, width);
		
		printCircle(width);
		printTriangle(height, height);
		printRectangle(length, radius);

		printCircle(base);
		printTriangle(base, radius);
		printRectangle(base, width);
		
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
		System.out.println("Area of the circle:"+areacircle +"when its radius is:" +radius);
		}
	
	public static void printTriangle (double base, double height)
		{
		double areatriangle=areaTriangle (base, height);
		System.out.println("Area of the triangle:"+areatriangle +"when its base is:" +base +" and its height is:" +height);
		}

	public static void printRectangle (double length, double width)
		{
		double arearectangle=areaRectangle (length, width);
		System.out.println("Area of the rectangle:"+arearectangle +"when its lenght is:" +length +" and when its width is:" +width);
		}

}
		


