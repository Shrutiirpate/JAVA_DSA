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
//-----------------------------------------------------------------------------------------------------------------------
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
