import java.awt.Color;
import java.awt.Graphics2D;


public class TopChip {
	
	static int backingwidth= 725;
	static int backingheight= 625;
	
	int column;
	
	public void drawTopChip(Graphics2D g, int width, int height, Holding turn){
		int startw= (width/2)-(backingwidth/2);
		int starth= (height/2)-(backingheight/2);
		int startcw= startw+25;
		int startch= starth+25;
		
	
			switch(turn){
				case EMPTY:
					g.setColor(Color.white);
					break;
				case RED:
					g.setColor(Color.red);
					break;
				case BLACK:
					g.setColor(Color.black);
					break;
			}
			
			g.fillOval((startcw+25)+(100*column),(startch-75), 25, 25);
				
		}
	public void moveTopChipRight(){
		if(column<6){
			column++;
		}
	}
	public void moveTopChipLeft(){
		if(column>0){
			column--;
		}
	}
	public void dropChip(Graphics2D g, int width, int height, Holding turn, int row){
			int startw= (width/2)-(backingwidth/2);
			int starth= (height/2)-(backingheight/2);
			int startcw= startw+25;
			int startch= starth+25;
			
			
			
			switch(turn){
			case EMPTY:
				g.setColor(Color.white);
				break;
			case RED:
				g.setColor(Color.red);
				break;
			case BLACK:
				g.setColor(Color.black);
				break;
			}
			
			g.fillOval((startcw+(100*column)),(startch+(100*row)), 75, 75);
			
				
	}
	
	
}
