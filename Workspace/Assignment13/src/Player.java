import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Player {

	// position
	double x;
	double y;
		
	// velocity
	double vx;
	double vy;
	
	double heading;
	double scale;
	
	boolean turningLeft = false;
	boolean turningRight = false;
	boolean accelerating = false;
	
	public void PolyLine2D(){
		
	}
	
	
	public Player(double x, double y)
	{
		scale = 2;
		
		this.x = x;
		this.y = y;
	}
	
	/* public void draw(Graphics2D graphics)
	{
		// front
		double sx1 = 15*scale;
		double sy1 = 0;
		
		// left
		double sx2 = -15*scale;
		double sy2 = 10*scale;
		
		// right
		double sx3 = - 15*scale;
		double sy3 = - 10*scale;

		// rear
		double sx4 = - 5*scale;
		double sy4 = 0;

		// flame tip
		double sx5 = - 15*scale;
		double sy5 = 0;
	
		drawLine(graphics, sx1, sy1, sx2, sy2, Color.black);
		drawLine(graphics, sx1, sy1, sx3, sy3, Color.black);
		drawLine(graphics, sx4, sy4, sx2, sy2, Color.black);
		drawLine(graphics, sx4, sy4, sx3, sy3, Color.black);
		
		if (accelerating)
		{
			drawLine(graphics, sx4, sy4, sx5, sy5, Color.red);
		}
	}
	
	
	public void drawLine(Graphics2D graphics, double sx1, double sy1, double sx2, double sy2, Color c)
	{
		double x1 = Math.cos(heading) * sx1 - Math.sin(heading) * sy1;
		double y1 = Math.sin(heading) * sx1 + Math.cos(heading) * sy1;
		double x2 = Math.cos(heading) * sx2 - Math.sin(heading) * sy2;
		double y2 = Math.sin(heading) * sx2 + Math.cos(heading) * sy2;
		
		graphics.setColor(c);
		graphics.drawLine((int)(x + x1), (int)(y + y1), (int)(x + x2), (int)(y + y2));		
		graphics.setColor(Color.black);
	}
	*/
	
	public void drawLine(Graphics2D graphics, double sx1, double sy1, double sx2, double sy2, Color c)
	{
	
	}
	public void move(int width, int height)
	{
		double acceleration = 0.3;
	
		if (turningRight) {
			heading = heading + (Math.PI/60);		
		}
		
		if (turningLeft) {
			heading = heading - (Math.PI/60);
		}
		
		if (accelerating) {
			vx += acceleration * Math.cos(heading);
			vy += acceleration * Math.sin(heading);
		}
		
		x += vx;
		y += vy;
		
		if (x <= 0) {
			x = width + x;
		}
		
		if (y <= 0) {
			y = height + y;
		}
		
		if (x >= width) {
			x = x - width;
		}
		
		if (y >= height) {
			y = y - height;
		}
	}

}