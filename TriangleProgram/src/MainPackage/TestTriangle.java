package MainPackage;

public class TestTriangle {
	public static void main(String[] args){
Triangle Triangle = new Triangle(1.0, 1.0, 1.0);
System.out.printf("Triangle Area is %.2f\n", Triangle.getArea());

System.out.println("Triangle Perimeter is " + Triangle.getPerimeter());

System.out.println("Triangle color is " + Triangle.getColor());

System.out.println("Triangle filled is " + Triangle.isFilled());

System.out.println(Triangle.ToString());


	}
}

