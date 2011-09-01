import java.io.Console;
import java.util.Scanner;
public class multip
{
public static void main (String args[])
	{
	Scanner sc= new Scanner (System.console().reader());
	double d1=sc.nextDouble();
	System.out.println("The value is:"+d1);
	int i1 = sc.nextInt();
	System.out.println("The value is:"+i1);
	double m1= d1*i1;
	System.out.println("The value is:"+m1);
	}
}