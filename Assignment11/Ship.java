import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ship {

	// position
	int x;
	int y;
	
	// velocity
	int vx;
	int vy;

	public Ship(int x, int y, int vx, int vy)
	{
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public void drawShip(Graphics2D graphics)
	{
		
		Random rnd= new Random();
		

		
		if(rnd.nextInt(2) == 0)
		{
			Random color= new Random();
			
			int c= color.nextInt(3);

			if(c == 1)
			{
				graphics.setColor(Color.orange);
				
				graphics.drawLine(x+20, y, x+30, y);
				graphics.drawLine(x+10, y+10, x+20, y);
				graphics.drawLine(x+30, y, x+40, y+10);
				graphics.drawLine(x, y+10, x+50, y+10);
				graphics.drawLine(x, y+10, x+10, y+20);
				graphics.drawLine(x+10, y+20, x+40, y+20);
				graphics.drawLine(x+40, y+20, x+50, y+10);
			}
			else if(c == 0)
			{
				graphics.setColor(Color.green);
				
				graphics.drawLine(x+20, y, x+30, y);
				graphics.drawLine(x+10, y+10, x+20, y);
				graphics.drawLine(x+30, y, x+40, y+10);
				graphics.drawLine(x, y+10, x+50, y+10);
				graphics.drawLine(x, y+10, x+10, y+20);
				graphics.drawLine(x+10, y+20, x+40, y+20);
				graphics.drawLine(x+40, y+20, x+50, y+10);
			}
			else
			{
				graphics.setColor(Color.blue);
				
				graphics.drawLine(x+20, y, x+30, y);
				graphics.drawLine(x+10, y+10, x+20, y);
				graphics.drawLine(x+30, y, x+40, y+10);
				graphics.drawLine(x, y+10, x+50, y+10);
				graphics.drawLine(x, y+10, x+10, y+20);
				graphics.drawLine(x+10, y+20, x+40, y+20);
				graphics.drawLine(x+40, y+20, x+50, y+10);
				
			}

		}

		else
		{
			graphics.drawOval(0,0,1,1);
		}
	}
	
	public void moveShip(int width, int height)
	{
		Random rnd = new Random();
		
	
		if (rnd.nextInt(30) == 0) {
			// change velocity
			
			vx = rnd.nextInt(5)-2;
			vy = rnd.nextInt(5)-2;
		}
		
		x += vx;
		y += vy;
		
		if (x <= 0) {
			vx = -vx;
			x = 0;	
		}
		
		if (y <= 0) { 
			vy = -vy;
			y = 0;
		}
		
		if ((x + 50) >= width) {
			vx = -vx;
			x = width-50;
		}
		
		if ((y + 20) >= height) {
			vy = -vy;
			y = height-20;
		}
	}
}