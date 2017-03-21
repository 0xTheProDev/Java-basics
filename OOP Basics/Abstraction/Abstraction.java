/*
    As per dictionary, abstraction is the quality of dealing with ideas rather than events.
    In Object-oriented programming, abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. In other words, the user will have the information on what the object does instead of how it does it.
*/

abstract class Person{
    String name;
    int birth_year;
    abstract void printData();
    final int age(){
        return (2017 - birth_year);
    }
}

class Student extends Person{
    int roll;
    Student(String n, int r, int yb){
        name = n;
        roll = r;
        birth_year = yb;
    }
    void printData(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Age: " + age());
    }
}

class Main{
    public static void main(String args[]){
        Student stud = new Student("Progyan", 14, 1997);
        stud.printData();
    }
}