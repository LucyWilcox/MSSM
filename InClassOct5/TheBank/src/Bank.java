import java.util.Scanner;


public class Bank {
	double balance;
	
	public void widthdraw(double awidthdraw){
		balance= balance-awidthdraw;
		
	}
	
	public void  deposit(double adeposit){
		balance= balance+adeposit;
		
			
	}
	
	public void  rob(){
		 balance=0;
	}
	

	
}
