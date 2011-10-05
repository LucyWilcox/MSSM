import static org.junit.Assert.*;
import org.junit.Test;

public class testAVector {
	
	@Test public void testsum(){
		Vector2D v1= new Vector2D();
		Vector2D v2= new Vector2D();
		
		v1.x=2;
		v1.y=1;
		v2.x=3;
		v2.y=1;
		
		
		Vector2D sum= v1.add(v2);
		
		
		
		assertEquals(sum.x, 5, .0000001);
		assertEquals(sum.y, 2, .0000001);
		
		
	}
	
	@Test public void testdifference(){
		Vector2D v1=new Vector2D();
		Vector2D v2= new Vector2D();
		
		v1.x=2;
		v1.y=1;
		v2.x=3;
		v2.y=1;
		
		
		Vector2D difference=v1.subtract(v2);
		
		assertEquals(difference.x, -1, .000001);
		assertEquals(difference.y, 0, .000001);
		
		
	}
	
	@Test public void testdot(){
		Vector2D v1=new Vector2D();
		Vector2D v2=new Vector2D();
	
		v1.x=2;
		v1.y=1;
		v2.x=3;
		v2.y=1;
	
		
		double dotproduct=v1.dot(v2);
		
		assertEquals(dotproduct, 7, .000001);
	
	}
	
		
		

}
