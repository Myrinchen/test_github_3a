package geoMetry;

public class Triangle extends Shape{
	private double hight;
	private double lengthOfSeiteUnten;
	private double lengthOfSeiteRechts;
	private double lengthOfSeiteLinks;
	private String lengthOfSeitUnten;
	private String lengthOfSeitRechts;
	private String lengthOfSeitLinks;
	
	

	public Triangle(double xCords, double yCords, double hight, double lengthOfSeiteUnten, double lengthOfSeiteRechts, double lengthOfSeiteLinks) {
		super(xCords, yCords);
		this.hight = hight;
		this.lengthOfSeiteUnten = lengthOfSeiteUnten;
		this.lengthOfSeiteRechts = lengthOfSeiteRechts;
		this.lengthOfSeiteLinks = lengthOfSeiteLinks;
	}
	
	
	
	public double getLengthOfSeiteUnten() {
		return lengthOfSeiteUnten;
	}
	public void setLengthOfSeiteUnten(double lengthOfSeiteUnten) {
		this.lengthOfSeiteUnten = lengthOfSeiteUnten;
	}
	public double getLengthOfSeiteRechts() {
		return lengthOfSeiteRechts;
	}
	public void setLengthOfSeiteRechts(double lengthOfSeiteRechts) {
		this.lengthOfSeiteRechts = lengthOfSeiteRechts;
	}
	public double getLengthOfSeiteLinks() {
		return lengthOfSeiteLinks;
	}
	public void setLengthOfSeiteLinks(double lengthOfSeiteLinks) {
		this.lengthOfSeiteLinks = lengthOfSeiteLinks;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	
	
	public String toString () {
		return "Triangle\n\t" + "hight = " + this.hight + "\n\t lengthOfSeiteUnten = " + this.lengthOfSeitUnten +
				"\n\t lengthOfSeiteRechts = " + this.lengthOfSeitRechts +
				"\n\t lengthOfSeiteLinks = " + this.lengthOfSeitLinks +
				"\n\t Positin (Lower left Corner) = (" + this.getxCords() + "|" + this.getyCords() + ")"; 
	}

	
	/**
	 * Method Calculates Circumference of the Triangle
	 * return u
	 */
	public double CalculateCircumference() {
		double u = this.lengthOfSeiteLinks + this.lengthOfSeiteRechts + this.lengthOfSeiteUnten;
		return u;
	}
	
	/**
	 * Method Calculates Area of the Triangle
	 * return a
	 */
	public double calculateArea() {
		double a = (this.lengthOfSeiteUnten*this.hight)/2;
		return a;
	}

}
