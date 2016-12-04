/*
 * Made by Cecile Gontier
 * date : 4th December
 * version 1
 */

package position;



public class Position {
	
	private double x;
	private double y;
	
	public Position(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(Position p){
		double aux_x = Math.pow(this.getX() - p.getX(),2);
		double aux_y = Math.pow(this.getY() - p.getY(),2);
		return Math.sqrt(aux_x + aux_y);
	}

}
