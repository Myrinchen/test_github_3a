package geoMetry;

public class Test {

	public static void main(String[] args) {
		
		Group myGroup = new Group();
		
		Rectangle r1 = new Rectangle(3, 4, 3.5, 10);
		Circle c1 = new Circle(7, 7, 5);
		Triangle t1 = new Triangle(4, 5, 7, 5, 5, 3);
		
		myGroup.addShape(r1);
		myGroup.addShape(c1);
		myGroup.addShape(t1);
		
		System.out.println(r1.calculateArea());
		System.out.println(c1.calculateArea());
		System.out.println(t1.calculateArea());
		
		System.out.println(r1.CalculateCircumference());
		System.out.println(c1.CalculateCircumference());
		System.out.println(t1.CalculateCircumference());
		
		System.out.println(myGroup.calculateAllArea());
		System.out.println(myGroup.calculateAllCircumference());
		System.out.println(myGroup.findBiggestForm());
		
		myGroup.printAllForms();
		
		
		
	}
	

}
