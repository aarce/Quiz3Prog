package MainPackage;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double s = (side1 + side2 + side3)/2;

	public Triangle (){
		
	}
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	public double getArea(){
		return Math.sqrt(s * ((s - side1)*(s - side2)*(s - side3)));
	}
	public double getPerimeter(){
		return s * 2;
	}
	public String ToString(){
		return "The length of side 1 is "
	+ side1 + "\nthe length of side 2 is " + side2
	+ "\nthe length of side 3 is " + side3;
	}
}
