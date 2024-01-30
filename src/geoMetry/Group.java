package geoMetry;

import java.util.ArrayList;

public class Group {
	
	private ArrayList<Shape> shapes;
	
	public Group() {
		this.shapes = new ArrayList<Shape>();
	}
	
	/**
	 * Method adds Shapes to the Group
	 * @param shapes
	 */
	public void addShape(Shape shapes) {
		this.shapes.add(shapes);
	}
	/**
	 * Method removes Shapes from the Group
	 * @param shapes
	 */
	public void removeShape(Shape shapes) {
		this.shapes.remove(shapes);
	}
	
	/**
	 * Method calculates the sum of the Area of all Shapes
	 * @return Area
	 */
	public double calculateAllArea() {
		double a = 0;
		for(Shape s : this.shapes) {
			a = a+s.calculateArea();
		}
		return a;
	}
	
	/**
	 * Method calculates the sum of all Circumferences
	 * @return sum
	 */
	public double calculateAllCircumference() {
		double u = 0;
		for(Shape s : this.shapes) {
			u = u+s.CalculateCircumference();
		}
		return u;
	}

	/**
	 * Method prints All Shapes
	 */
	public void printAllForms() {
		for(Shape s : this.shapes) {
			System.out.println(s);
		}
	}
	
	/**
	 * Method searches for the biggest shape based on the Area
	 * @return Biggest Shape
	 */
	public Shape findBiggestForm() {
		Shape max = null;
		double lastArea = 0;
		for(Shape s : this.shapes) {
			if(s.calculateArea()>lastArea) {
				max = s;
			}
			lastArea = s.calculateArea();
		}
		return max;
	}
}
