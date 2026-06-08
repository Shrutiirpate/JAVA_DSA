package Day10;
//Question 1- Question 1: Basic Inheritance
//Create a class Animal with a method eat().
//Create another class Dog that extends Animal and has a method bark().
//In the main() method:
//Create an object of Dog.
//Call both eat() and bark() methods.

//class Animal {
//    void eat(){
//        System.out.println("Animal is eating");
//    }
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Dog is barking");
//    }
//}
//class test{
//public static void main(String[] args) {
//    Dog D = new Dog();
//    D.eat();
//    D.bark();
//
//}}
//----------------------------------------------------------------------------------------------------------------------------------------------------------
//Question 2 -Question 2: Student and Person
//Create a class Person with:
//String variable name
//Method displayName()
//Create a class Student that extends Person with:
//Method study()
//In main():
//Assign a name to the student.
//Display the name.
//Call the study method.

class person{
    String name; //(******)
    void displayName(){
        System.out.println("Name: " + name);
        //System.out.println("Shruti");
    }
}
class student extends person{
    void study(){
        System.out.println("Student is sudyingt");
    }
}
class test{
    public static void main(String[] args) {
        student s = new student();

        s.name = "Shruti";
        s.displayName();
        s.study();

        //my logic
        String name = "Shruti"; //You created a name variable inside person, but you never used it (It's like buying a bicycle and then walking instead of riding it. The bicycle exists, but you're not using it.)
        System.out.println("Name: " + name);
        s.study();

    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------
//Question 3-Question 3: Vehicle and Car
//Create a class Vehicle with:
//Method start()
//Create a class Car that extends Vehicle with:
//Method drive()
//Create a Car object and call both methods.
//Expected Output:
//Vehicle started
//Car is driving

class Vehicle{
    void start(){
        System.out.println("Vehicle started");

    }
}
class car extends Vehicle{
    void drive(){
        System.out.println("Car is driving");
    }

    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.drive();
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------
//Question 4: Single Inheritance with Variables
//Create a class Employee with:
//int empId = 101
//Create a class Manager that extends Employee.
//In main():
//Create a Manager object.
//Print the employee ID.
//Expected Output:
//Employee ID: 101
class Employee{
    int empID = 101;
}
class Manager extends Employee{
    public static void main(String[] args) {
    Manager M = new Manager();
        System.out.println("Employee ID: " + M.empID); // when we accessing variable we don't use () parentheses
    }
}
//--------------------------------------------------------------------------------------------------------------------------------------------------------
//{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{SUPER KEYWORD}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}4

// Question 5: Constructor Inheritance
//Create a class Parent with a constructor that prints:
//Parent Constructor
//Create a class Child that extends Parent and has its own constructor printing:
//Child Constructor
//Create a Child object.
//Expected Output:
//Parent Constructor
//Child Constructor
class parent{
    parent(){
        System.out.println("Parent Construsctor");
    }
}
class child extends  parent{
    child(){
        System.out.println("Child constryctor");
    }
    //Java secretly inserts:

    //1. Call the Parent Constructor
    //class child extends parent {
    //    child() {
    //        super();  // call Parent constructor. if we don't write this super() java automatically inserts super
    //        System.out.println("Child Constructor");

    public static void main(String[] args) {
        child c = new child();

    }

}
//2)
//2. Access Parent Class Variables
class parent1{
    int x = 20;

//    void run(){
//        System.out.println(super.x); //The error is because super can only be used inside a child class to refer to its parent.
//        System.out.println(x);
//    }
}
class child1 extends parent1{
    int x = 40;

    void run(){
        System.out.println(super.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        child1 c = new child1();
        c.run(); //20 40


    }
}
//3
//3. Access Parent Class Methods
class shruti{
    void show(){
        System.out.println("Shruti Method");
    }
}
class sanu extends shruti{
    void show() {
        System.out.println("Sanu method");
    }
    void display(){
    super.show();
    show();
    }

    public static void main(String[] args) {
        sanu sh = new sanu();
        sh.display(); //shruti method // sanu method
    }
}
//This Keyword - This keyword is the reference variable that refers to the current object
class test1{
    int i;
    

}
//---------------------------------------------------------------------------------------------------------------------
class exampl{

}

//This keyword examples