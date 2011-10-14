
public class Vector2D {

	/**
	 * @param args
	 */
	

	double x;
	double y;

	
	public Vector2D(double x2, double y2) {
		// TODO Auto-generated constructor stub
	}

	public Vector2D add(Vector2D other) {
		
		double w = this.x+other.x;
		double z =this.y+other.y;
		
		Vector2D sum= new Vector2D(x,y);
		sum.x=w;
		sum.y=z;
		
		return sum;
	

	}
	
	public Vector2D subtract(Vector2D other) {
		double w= this.x-other.x;
		double z=this.y-other.y;
		
		Vector2D difference= new Vector2D(x,y);
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
	
	public Vector2D rotate(double heading){
		
		double x1 = Math.cos(heading) * x - Math.sin(heading) * y;
		double y1 = Math.sin(heading) * x + Math.cos(heading) * y;
		
		Vector2D rotated= new Vector2D(x1, y1);
		
		return rotated;
	
	}
	

}
