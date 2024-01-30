package geoMetry;

public class Circle extends Shape{
	private double radius;
	
	
	public Circle(double xCords, double yCords, double radius) {
		super(xCords, yCords);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public String toString () {
		return "Circle \n\t" +"radius " + this.radius + 
				"\n\t Positin (mittel Point) = (" + this.getxCords() + "|" + this.getyCords() + ")"; 
	}

	/**
	 * Method Calculates Circumference of the Circle
	 * return u
	 */
	public double CalculateCircumference() {
		double u = (this.radius * 2)*Math.PI;
		return u;
	}

	/**
	 * Method Calculates Area of the Circle
	 * return a
	 */
	public double calculateArea() {
		double a =(this.radius*this.radius)*Math.PI;
		return a;
	}
	

}
