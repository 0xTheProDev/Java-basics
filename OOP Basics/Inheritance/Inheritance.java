/*
    Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order.

    The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).
*/

class Animal{
    int leg;
    Animal(int l){
        leg = l;
        System.out.println("An animal with "+ leg + " is created!");
    }
}

class Dog extends Animal{
    String breed;
    Dog(){
        super(4);
        System.out.println("A Dog is created!");
    }
    Dog(String b){
        this();
        breed = b;
        System.out.println("The Breed is " + breed +".");
    }
}

class Main{
    public static void main(String args[]){
        Animal dog = new Dog();
        Dog sp = new Dog("Spaniel");
    }
}