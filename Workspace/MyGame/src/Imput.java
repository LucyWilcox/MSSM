import java.awt.Graphics2D;


public class Imput {
	public static Holding WhichTurn(int turns){
		
		if(turns%2==0){
			return Holding.RED;
		}
		return Holding.BLACK;
	}
	
	
}
