/*
	An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

	Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods.
*/

interface Shape2D{
	double area();
}

interface Shape3D{
	double volume();
}

class Square implements Shape2D{
	double side;
	Square(double s){
		side = s;
	}
	public double area(){
		return (side * side);
	}
}

class Cube implements Shape2D, Shape3D{
	double side;
	Cube(double s){
		side = s;
	}
	public double area(){
		return (6 * side * side);
	}
	public double volume(){
		return (side * side * side);
	}
}

class Test{
	public static void main(String args[]){
		Square sq = new Square(10);
		Cube cb = new Cube(5);
		
		System.out.println("Area of the Square: " + sq.area());
		System.out.println("Area of the Cube: " + cb.area());
		System.out.println("Volume of the Cube: " + cb.volume());
	}
}