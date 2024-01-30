package geoMetry;

public class Rectangle extends Shape{
	
	double width;
	double length;
	
	
	public Rectangle(double xCords, double yCords, double width, double length) {
		super(xCords, yCords);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public String toString () {
		return "Rectangle\n\t" + "length = " + this.length + "\n\t width = " + this.width +
				"\n\t Positin (uperLeftCorner) = (" + this.getxCords() + "|" + this.getyCords() + ")"; 
	}
	
	/**
	 * Method Calculates Circumference of the Rectangle
	 * return u
	 */
	public double CalculateCircumference() {
		double u = (this.length * 2)+(this.width * 2);
		return u;
	}
	
	/**
	 * Method Calculates Area of the Rectangle
	 * return a
	 */
	public double calculateArea() {
		double a = this.length*this.width;
		return a;
	}
	
	

}
