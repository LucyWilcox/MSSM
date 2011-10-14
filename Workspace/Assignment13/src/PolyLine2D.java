import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;


public class PolyLine2D{
	
	boolean closed= true;
	Vector2D[] points;
	
	double x;
	double y;
	
	
	public PolyLine2D(int n){
		points= new Vector2D[n];
	}
	
	public Vector2D setPoint(int index, double x, double y){
		

		
		points[index]=new Vector2D(x, y);
		points[index].x= x;
		points[index].y= y;
		
		return points[index];
	}
		

	public void draw(Graphics2D graphics, double offsetx, double offsety, double heading){
	
		Vector2D a=new Vector2D(offsetx, offsety);
		
		for(int c= 0; c<points.length; c++){
			
			
			Vector2D v1= new Vector2D(points[c].x, points[c].y);
			Vector2D v2= new Vector2D(points[c+1].x, points[c+1].y);
			
			
			
			Vector2D v1r= v1.rotate(heading);
			Vector2D v2r= v2.rotate(heading);
			
			Vector2D v1f= v1r.add(a);
			Vector2D v2f= v2r.add(a);
			
			graphics.setColor(Color.black);
			graphics.drawLine((int)v1f.x, (int)v1f.y, (int)v2f.x, (int)v2f.y);
			System.out.println(""+v1f.x +v1f.y +v2f.x+ v2f.y);
			
		}
		
		if (closed== true)
		{
			
			Vector2D v1= new Vector2D(points[0].x, points[0].y);
			Vector2D v2= new Vector2D(points[points.length].x, points[points.length].y);
			
			graphics.setColor(Color.red);
			graphics.drawLine((int)v1.x, (int)v1.y, (int)v2.x, (int)v2.y);
			graphics.setColor(Color.black);
		}
		
		/*
		Vector2D v1= new Vector2D(points[1].x, points[1].y);
		Vector2D v2= new Vector2D(points[2].x, points[2].y);
		Vector2D v3= new Vector2D(points[3].x, points[3].y);
		Vector2D v4= new Vector2D(points[4].x, points[4].y);
		
		Vector2D a=new Vector2D(offset, offset);
		
		Vector2D v1wo= v1.add(a);
		Vector2D v2wo= v2.add(a);
		Vector2D v3wo= v3.add(a);
		Vector2D v4wo= v4.add(a);
		
		Vector2D v1f= v1wo.rotate(heading);
		Vector2D v2f= v1wo.rotate(heading);
		Vector2D v3f= v1wo.rotate(heading);
		Vector2D v4f= v1wo.rotate(heading);
		
		
		
		points[1].x, points[1].y, points[2].x, points[2].y, Color.black;
		points[1].x, points[1].y, points[3].x, points[3].y, Color.black;
		points[4].x, points[4].y, points[3].x, points[3].y, Color.black;
		points[4].x, points[4].y, points[3].x, points[3].y, Color.black;
		*/
		
	
		
}
	
}