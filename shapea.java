abstract class Shape{
	abstract void area();
}
class Rectangle extends Shape{
	double height, width;
	Rectangle(double arg1, double arg2){
		height = arg1;
		width = arg2;
	}

	void area(){
		System.out.println("Area: " + height * width);
	}
}
class Square extends Shape{
	double side;
	Square(double arg1){
		side = arg1;
	}

	void area(){
		System.out.println("Area: " + side * side);
	}
}
class Circle extends Shape{
	double radius;
	Circle(double arg1){
		radius = arg1;
	}

	void area(){
		System.out.println("Area: " + Math.PI * radius * radius);
	}
}
class Triangle extends Shape{
	double base, side1, side2;
	Triangle(double arg1, double arg2, double arg3){
		base = arg1;
		side1 = arg2;
		side2 = arg3;
	}

	void area(){
		double semi = (base + side1 + side2) / 2;
		System.out.println("Area: " + Math.sqrt(semi * (semi - base) * (semi - side1) * (semi - side2)));
	}
}

class Test{
	public static void main(String args[]){
		Shape s = new Rectangle(5.0, 3.0);
		s.area();
		s = new Square(6.0);
		s.area();
		s = new Circle(5.0);
		s.area();
		s = new Triangle(3.0, 4.0, 6.0);
		s.area();
	}
}
