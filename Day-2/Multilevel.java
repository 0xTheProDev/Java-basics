class Parent {
	int ParentValue;
	Parent(int arg){
		ParentValue = arg;
	}
}

class Child extends Parent {
	int ChildValue;
	Child(int arg1, int arg2){
		super(arg1);
		ChildValue = arg2;
	}
}

class GrandChild extends Child {
	int FinalValue;
	GrandChild(int arg1, int arg2){
		super(arg1, arg2);
	}	
	GrandChild(int arg1, int arg2, int arg3){
		this(arg1, arg2);
		FinalValue = arg3;
	}
	void display(){
		System.out.println("ParentValue: " + ParentValue + " ChildValue: " + ChildValue + " FinalValue: " + FinalValue);
	}
}

class Test {
	public static void main(String args[]){
		GrandChild gc = new GrandChild(5, 3, 9);
		gc.display();
	}
}