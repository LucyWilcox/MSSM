import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class AnimationCanvas extends JPanel implements MouseListener, MouseMotionListener, KeyListener {
	
	int numShips = 1;
	Ship[] ships = new Ship[numShips];
	Player player = new Player(150,150);
	Projectile projectile;	

	public AnimationCanvas() {
	
	
		for (int counter = 0; counter < numShips; counter++) {
			ships[counter] = new Ship(200, 200, 2, 2);
		}
		
	}	
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;	
		g2d.clearRect(getX(),getY(), getWidth(), getHeight());
		redraw(g2d);
    }
	
	public void redraw(Graphics2D graphics)
	{
		int width = getWidth();
		int height = getHeight();
	
		for (int counter = 0; counter < numShips; counter++) {
			ships[counter].drawShip(graphics);
			ships[counter].moveShip(width, height);	
		}			
					
		//player.draw(graphics);
		player.move(width, height);
	
		if (projectile != null)
		{
			projectile.drawProjectile(graphics);
			projectile.moveProjectile(width, height);
		}

		
		// drawLine(x1, y1, x2, y2)
		//graphics.drawLine(0,0,100,100);
		
		// setColor(color) where color = Color.blue, Color.red, Color.pink, Color.black, etc
		//graphics.setColor(Color.red);

		// drawOval(x1, y1, width, height)
		//graphics.drawOval(100,100,20,20);
		
		// drawString(string, x, y) 
		//graphics.drawString("Foo", width-50, height-50);
		
		// x^2+2x+10
		
		// x range  -10 to 10  
		// y range  -20 to 20

    	}
    	
   	
		public void keyTyped(KeyEvent e) {
		}

		public void keyPressed(KeyEvent e) {
		
			switch (e.getKeyCode())
			{
				case KeyEvent.VK_LEFT:
					player.turningLeft = true;
					break;
				case KeyEvent.VK_RIGHT:
					player.turningRight = true;
					break;
				case KeyEvent.VK_UP:
					player.accelerating = true;
					break;
				case KeyEvent.VK_SPACE:
					projectile= new Projectile(player.x, player.y, player.vx, player.vy, player.heading, 10);
					
					break;
			}
		}

		public void keyReleased(KeyEvent e) {
			switch (e.getKeyCode())
			{
				case KeyEvent.VK_LEFT:
					player.turningLeft = false;
					break;
				case KeyEvent.VK_RIGHT:
					player.turningRight = false;
					break;
				case KeyEvent.VK_UP:
					player.accelerating = false;
					break;
				case KeyEvent.VK_SPACE:
					
					break;
			}
		}
	
    	public void mouseClicked(MouseEvent e) 
    	{
    	}
    	
    	public void mouseEntered(MouseEvent e)
    	{
    	}
    	
    	public void mouseExited(MouseEvent e)
    	{
    	}
    	
    	public void mousePressed(MouseEvent e)
    	{
    	}
    	
    	public void mouseReleased(MouseEvent e)
    	{
    	}
    	
    	public void mouseDragged(MouseEvent e)
    	{
    	}
    	
    	public void mouseMoved(MouseEvent e)
    	{
    	}
 
	public void showCanvas() {
		//Create and set up the window.
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(this, BorderLayout.CENTER);
	
		//Display the window.
		frame.pack();
		frame.setSize(1000,600);
		frame.setVisible(true);
   
		// create and start the Swing Timer
		new javax.swing.Timer(20, new TimerListener()).start();
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		
		requestFocusInWindow(); 
	}
  
	private class TimerListener implements ActionListener {
	 
	    // is called every TIMER_DELAY ms
	    public void actionPerformed(ActionEvent e) {
	    	    AnimationCanvas.this.repaint();
	    }
	}
 

  // call Swing code in a thread-safe manner
	public void run() {
	    java.awt.EventQueue.invokeLater(new Runnable() {
	      public void run() {
			showCanvas();
	      }
	    });
	}
 
}


