import java.awt.Color;
import java.awt.Graphics2D;


public class TableImage {
	
	
	public TableImage(){
		
	}
	
	
	static int backingwidth= 725;
	static int backingheight= 625;
	
	public static void drawBacking(Graphics2D g, int width, int height){
		int startw= (width/2)-(backingwidth/2);
		int starth= (height/2)-(backingheight/2);
		g.setColor(Color.yellow);
		g.fillRect(startw, starth, backingwidth, backingheight);
        

	}
	
	public static void drawSpaces(Graphics2D g, int width, int height, Chips cells){
		int startw= (width/2)-(backingwidth/2);
		int starth= (height/2)-(backingheight/2);
		int startcw= startw+25;
		int startch= starth+25;
		
		g.setColor(Color.white);
		
		for(int c=0; c<7; c++){
			for(int r=0; r<6; r++){
				Holding color= cells.getColor(r, c);
				switch(color){
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
				
				g.fillOval((startcw+(100*c)),(startch+(100*r)), 75, 75);
				
				
			
			}
		}
	}


}
