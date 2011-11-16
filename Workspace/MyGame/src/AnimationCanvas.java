import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationCanvas extends JPanel implements MouseListener, MouseMotionListener, KeyListener {
	
	private static int TIMER_DELAY = 20;
	Chips c=new Chips();
	TopChip topchip=new TopChip();
	
	
	
	
	int turn=0;
	
	public AnimationCanvas() {
		
	}	
	
	
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;	
		g2d.clearRect(getX(),getY(), getWidth(), getHeight());
		redraw(g2d);
    }
	
	public void redraw(Graphics2D graphics)
	{
		
	
		TableImage.drawBacking(graphics, getWidth(), getHeight());
		TableImage.drawSpaces(graphics, getWidth(), getHeight(), c);
		topchip.drawTopChip(graphics, getWidth(), getHeight(), Imput.WhichTurn(turn));
		if(c.gameover!=true){
			c.diagonalDownWin();
			c.diagonalDownWin();
			c.verticalwin();
			c.horizontalwin();
		}
			c.win(graphics);
	}	

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
	
		switch (e.getKeyCode())
		{
			case KeyEvent.VK_LEFT:
				topchip.moveTopChipLeft();
				break;
			case KeyEvent.VK_RIGHT:
				topchip.moveTopChipRight();
				break;
			case KeyEvent.VK_DOWN:
				c.AddChip(topchip.column, Imput.WhichTurn(turn));
				turn++;
				break;
			case KeyEvent.VK_SPACE:
				break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode())
		{
			case KeyEvent.VK_LEFT:
				break;
			case KeyEvent.VK_RIGHT:
				break;
			case KeyEvent.VK_DOWN:
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
		new javax.swing.Timer(TIMER_DELAY, new TimerListener()).start();
		
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


