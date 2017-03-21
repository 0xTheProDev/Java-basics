class Complex{
	double a, b;
	
	Complex(double x, double y){
		a = x;
		b = y;
	}
	Complex(Complex c){
		a = c.a;
		b = c.b;
	}
	
	Complex add(Complex c){
		Complex c3 = new Complex(a + c.a, b + c.b);
		return c3;
	}
	Complex add(Complex c1, Complex c2){
		Complex c3 = new Complex(c1.a + c2.a, c1.b + c2.b);
		return c3;
	}
	
	void showData(){
		System.out.println(a + " + i" + b);
	}
}

class Test{
	public static void main(String args[]){
		Complex cx1 = new Complex(5, 3);
		Complex cx2 = new Complex(4, 2);
		Complex cx3 = cx1.add(cx1, cx2);
		cx3.showData();
	}
}
