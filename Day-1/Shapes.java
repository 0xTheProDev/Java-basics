import java.math.*;

abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	double radius;
	
	Circle(double r){
		radius = r;
	}
	
	double area(){
		double A = Math.PI * radius * radius;
		System.out.println("Area of Circle is: " + A);
		return A;
	}
}

class Square extends Shape{
	double side;
	
	Square(double s){
		side = s;
	}
	
	double area(){
		double A = side * side;
		System.out.println("Area of Square is: " + A);
		return A;
	}
}

class Rectangle extends Shape{
	double length, width;
	
	Rectangle(double l, double w){
		length = l;
		width = w;
	}
	
	double area(){
		double A = length * width;
		System.out.println("Area of Rectangle is: " + A);
		return A;
	}
}

class Test{
	public static void main(String args[]){
		Shape d;
		d = new Square(5.0);
		d.area();
		d = new Rectangle(10.0, 20.0);
		d.area();
		d = new Circle(4.0);
		d.area();
	}
}
