import java.awt.Color;
import java.awt.Graphics2D;


public class TableImage {
	
	
	public TableImage(){
		
	}
	
	
	static int backingwidth= 750;
	static int backingheight= 650;
	
	public static void drawBacking(Graphics2D g, int width, int height){
		int startw= (width/2)-(backingwidth/2);
		int starth= (height/2)-(backingheight/2);
		g.setColor(Color.yellow);
		g.fillRect(startw, starth, backingwidth, backingheight);
        

	}
	
	public static void drawSpaces(Graphics2D g, int width, int height){
		int startw= (width/2)-(backingwidth/2);
		int starth= (height/2)-(backingheight/2);
		int startcw= startw+25;
		int startch= starth+25;
		
		g.setColor(Color.white);
		
		for(int c=0; c<7; c++){
			for(int k=0; k<6; k++){
				g.fillOval((startcw+(100*c)),(startch+(100*k)), 75, 75);
			
			}
		}
	}

}
