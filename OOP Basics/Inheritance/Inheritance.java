/*
    Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order.

    The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).
*/

class Animal{
    int leg;
    Animal(int l){
        leg = l;
    }
    void printStatus(){
        System.out.println("This is an animal");
    }
}

class Dog extends Animal{
    Dog(){
        super(4);
    }
    void printStatus(){
        System.out.println("This is a Dog!");
    }
}

class Spaniel extends Dog{
    void printStatus(){
        super.printStatus();
        System.out.println("The breed is: Spaniel");
    }
}

class Main{
    public static void main(String args[]){
        Animal dog = new Dog();
        dog.printStatus();
        Dog sp = new Spaniel();
        sp.printStatus();
    }
}