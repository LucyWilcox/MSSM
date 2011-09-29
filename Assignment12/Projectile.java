import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Graphics;

// AKA Lazor
public class Projectile{
	
	// position
	double x;
	double y;
		
	// velocity
	double vx;
	double vy;
		
	

	public Projectile(double shipx, double shipy, double shipvx, double shipvy, double shipheading, double force)
	{
		this.x = shipx;
		this.y = shipy;

		vx = shipvx + force*Math.cos(shipheading);
		vy = shipvy + force*Math.sin(shipheading);
		

		
	}

	public void moveProjectile(int width, int height)
	{
		
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

	public void drawProjectile(Graphics2D graphics)
	{
		int u = (int)x;
		int w = (int)y;	


		graphics.drawOval(u, w, 10, 10);
	}

	

}