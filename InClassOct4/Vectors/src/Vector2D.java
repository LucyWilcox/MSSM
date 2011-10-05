
public class Vector2D {

	/**
	 * @param args
	 */
	

	double x;
	double y;

	
	public Vector2D add(Vector2D other) {
		
		double w = this.x+other.x;
		double z =this.y+other.y;
		
		Vector2D sum= new Vector2D();
		sum.x=w;
		sum.y=z;
		
		return sum;
	

	}
	
	public Vector2D subtract(Vector2D other) {
		double w= this.x-other.x;
		double z=this.y-other.y;
		
		Vector2D difference= new Vector2D();
		difference.x=w;
		difference.y=z;
		
		return difference;
	}
	
	public double dot(Vector2D other){
		double u=this.x*other.x;
		double w=this.y*other.y;
		
		
		double dotproduct= u+w;
		
		return dotproduct;
	}
	
	

}
