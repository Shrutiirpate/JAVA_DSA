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
//Question 5: Constructor Inheritance
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
    //class child extends parent {
    //    child() {
    //        super();  // call Parent constructor
    //        System.out.println("Child Constructor");

    public static void main(String[] args) {
        child c = new child();

    }

}
