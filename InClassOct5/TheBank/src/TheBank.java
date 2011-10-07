import java.io.Console;
import java.util.Scanner;

public class TheBank {
	public static void main(String[] args) {
		Bank a=new Bank();
		
		Scanner sc= new Scanner (System.console().reader());

		int transaction=1;
		
		while(transaction==1){
			
	
		System.out.println("Press: 1 to widthdraw or 2 to deposit");

		int choice=sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Enter amount to widthdraw");
				double awidthdraw=sc.nextDouble();
				a.widthdraw(awidthdraw);
				break;
			
			case 2:
				System.out.println("Enter amount to deposit");
				double adeposit=sc.nextDouble();
				a.deposit(adeposit);
				break;
			
			case 3:
				a.rob();
				System.out.println("You robbed the bank");
				break;
		}
		

		System.out.println("Your balance is:"+a.balance);
		
		System.out.println("If you would like to complete another transaction press 1 if not press 2");
		
		transaction=sc.nextInt();

		}
		
	}
}
