import java.awt.Color;
import java.awt.Font;
import java.awt.font.*;
import java.awt.Graphics2D;


public class Chips{

	Holding[][] cells=new Holding[6][7];
	
	
	Holding winner = Holding.EMPTY;
	boolean gameover= false;
			
	public Chips(){
		for(int c=0; c<7; c++){
			for(int r=0;r<6; r++){
				cells[r][c]= Holding.EMPTY;
			}	
		}
		
		//AddChip(4,Holding.BLACK);
		//AddChip(4, Holding.RED);
		//AddChip(3,Holding.BLACK);
	}
	
	public int FindLowest(int column){
		int c=column;
		for(int r=5;r>=0;r--){
			if(cells[r][c]== Holding.EMPTY){
				return r;
			}
		}
		return -1;
	}
	public void AddChip(int column, Holding c){
		int row= FindLowest(column);
		
		cells[row][column]=c;
		
	}
	public Holding getColor(int row, int column){
		Holding color =cells[row][column];
		return color;
	}
	
	public void horizontalwin(){
		for(int r= 0; r<6; r++){
			int red=0;
			int black=0;
		
			for(int c=0; c<7; c++){
				
					if(cells[r][c] ==Holding.RED){
						red++;
						black=0;
					}
					
					if(cells[r][c]==Holding.BLACK){
						black++;
						red=0;
					}
					
					if(cells[r][c]==Holding.EMPTY){
						black=0;
						red=0;
					}
					
					if(black>=4){
						winner=Holding.BLACK;
					
						
					}
					
					if(red>=4){
						winner=Holding.RED;
						
					}
						
			}
			
		}


	}
	
	public void verticalwin(){
		for(int c= 0; c<7; c++){
			int red=0;
			int black=0;
		
			for(int r=0; r<6; r++){
				
					if(cells[r][c] ==Holding.RED){
						red++;
						black=0;
					}
					
					if(cells[r][c]==Holding.BLACK){
						black++;
						red=0;
					}
					
					if(cells[r][c]==Holding.EMPTY){
						black=0;
						red=0;
					}
					
					if(black>=4){
						winner=Holding.BLACK;
						
					}
					
					if(red>=4){
						winner=Holding.RED;
						
					}
						
			}
			
		}
	

	}
	
	public void diagonalDownWin(){
		for(int sc= -2; sc<4; sc++){
			int red=0;
			int black=0;
			int c=sc;
		
			for(int r=0; r<6; r++){
				 
				if(c>=0 && c<=6){
					if(cells[r][c] ==Holding.RED){
						red++;
						black=0;
					}
					
					if(cells[r][c]==Holding.BLACK){
						black++;
						red=0;
					}
					
					if(cells[r][c]==Holding.EMPTY){
						black=0;
						red=0;
					}
					
					if(black>=4){
						winner=Holding.BLACK;
			
					}
					
					if(red>=4){
						winner=Holding.RED;
				
					}
					
					
				}
				c++;	
			}
			
		}
	
			
		
	}
	
	public void diagonalUpWin(){
		for(int sc= 3; sc<9; sc++){
			int red=0;
			int black=0;
			int c=sc;
		
			for(int r=0; r<6; r++){
				 
				if(c>=0 && c<=6){
					if(cells[r][c] ==Holding.RED){
						red++;
						black=0;
					}
					
					if(cells[r][c]==Holding.BLACK){
						black++;
						red=0;
					}
					
					if(cells[r][c]==Holding.EMPTY){
						black=0;
						red=0;
					}
					
					if(black>=4){
						winner=Holding.BLACK;
						
					}
					
					if(red>=4){
						winner=Holding.RED;
						
					}
					
					
				}
				c--;	
			}
			
		}
			
			
		
	}
	public void win(Graphics2D g){
		
		g.setColor(Color.blue);
		
		switch(winner){
			case RED:
				g.drawString("Red Wins! Game Over.", 50, 50);
				gameover=true;
				break;
			case BLACK:
				g.drawString("Black Wins! Game Over", 50, 50);
				gameover=true;
				break;
		}
	}
	
}
