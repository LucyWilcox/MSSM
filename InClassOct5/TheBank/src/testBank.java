import static org.junit.Assert.*;

import org.junit.Test;


public class testBank {

	@Test public void testwidthdraw(){
		double aw;
		aw=30;
		
		Bank b= new Bank();

		
		b.widthdraw(aw);
		
		assertEquals(b.balance,-30,.000001);
		
		
	
	}
	
	@Test public void testdeposit(){
		double ad;
		ad=49;
		
		Bank b= new Bank();
		
		b.deposit(ad);
		
		assertEquals(b.balance,49, .000001);
	}
	
	@Test public void testrob(){

		
		Bank b=new Bank();
		
		b.rob();
		
		assertEquals(b.balance, 0, .000001);
		
	}
	
}