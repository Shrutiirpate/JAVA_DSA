package Day04;
import java.util.Scanner;

public class SwitchCase {


    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language: ");

        int lang = sc.nextInt();


        switch(lang){
            case 1:
                System.out.println("java course");
                System.out.println("Includes: Java,DSA,OS,OOP");
                break;
            case 2:
                System.out.println("Python course");
                System.out.println("Includes: Pyhton,IOT,Ml,AI");
                break;
            case 3:
                System.out.println("Flutter course");
                System.out.println("Includes: Dart,flutter");
                break;
            default:
                System.out.println("Invalid course");

        }
        //----------------------------------------------------------------

//        int x = 3;
//        switch (x){
//            case 1 :
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//            case 10:
//                System.out.println("Ten");
//                break;
//            default:
//                System.out.println("Invalid number");
//        }
        //-----------------------------------------------------------------
        //QUESTION1:-Simple Calculator: Create a menu-driven program that asks the user to input
        // two numbers and an operator character (+, -, *, /). Use a switch statement to perform the chosen arithmetic
        // operation and display the result.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("First num1: ");
//        int num1 =sc.nextInt();
//
//        System.out.print("Enter num2: ");
//        int num2 = sc.nextInt();
//
//        System.out.print("Enter Operator(+,-,*,/,%): ");
//        char operator = sc.next().charAt(0);
//
//        switch(operator){
//            case '+':
//                System.out.println("Addition: " + (num1 + num2));
//                break;
//            case '-':
//                System.out.println("Subtraction: " + (num1 - num2));
//                break;
//            case '*':
//                System.out.println("Multiplication: " +(num1 * num2));
//                break;
//            case '/':
//                System.out.println("Division: " + (num1 / num2));
//                break;
//            case '%':
//                System.out.println("Modulo: " + (num1 % num2));
//                break;
//            default:
//                System.out.println("Invalid user input");
//        }
        //---------------------------------------------------------
        //QUESTION2:- Grade Evaluator: Input a character representing a grade (A, B, C, D, or F)
        // and use a switch statement to print a corresponding remark (e.g., "Excellent"
        // for A, "Good" for B, "Average" for C, "Poor" for D, "Fail" for F).
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Grade: ");
//
//        char ch = sc.next().charAt(0);
//
//        switch(ch){
//            case 'A':
//                System.out.println("Exellent");
//                break;
//            case 'B':
//                System.out.println("Good");
//                break;
//            case 'C':
//                System.out.println("Average");
//                break;
//            case 'D':
//                System.out.println("Poor");
//                break;
//            case 'F':
//                System.out.println("Fail");
//                break;
//            default:
//                System.out.println("Invalid user input");
//            }
        //-------------------------------------------------------------------
        //Q1. Write a program to print the meaning of a specific color in a traffic light.
        //Input: Red
        //Output: Stop
        //Input: Blue
        //Output: No such color is present in traffic lights.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Colour: ");
//
//        String col = sc.nextLine();
//
//        switch(col){
//            case "Red":
//                System.out.println("Stop");
//                break;
//            case "Yellow":
//                System.out.println("Prepare to stop");
//                break;
//            case "Green":
//                System.out.println("Go");
//                break;
//            default:
//                System.out.println("Invalid user input");
//        }
        //--------------------------------------------------------------------

        //Q6. Write a program that takes a number from 0 to 5 and prints its spelling, if the
        //entered number is greater than 5 print the entered number is greater than 5.
        //Input : 3
        //Output: Three
        //Input: 6
        //Output: 6 is greater than 5.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//
//        int number = sc.nextInt();
//
//        switch(number){
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            default:
//                System.out.println(number +" is greater than 5");
//        }
        //-------------------------------------------------------------------
        //Q7. Write a program for the below example.
        //If you like to watch movies and you are planning to buy a Subscription according to the plan
        //For the Platinum plan, the price is 799
        //For Gold plan, the price is 599
        //For the Silver plan, the price is 399
        //For the Bronze plan, the price is 199
        //For less than 199, the platform is free with limited access
        //Display these plans to the user and ask for their plan
        //1.  Platinum
        //2.  Gold
        //3.  Silver
        //4.  Bronze
        //5.  free
        //Input: Enter your plan: Silver
        //Output :
        //For the Silver plan, the price is ₹399
        //Input: Enter your plan: free
        //Output :
        //For less than ₹199, the platform is free with limited access
        //Input: Enter your plan: no
        //Output :
        //Invalid Input

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter you plan: ");
//
//        String plan = sc.nextLine();
//
//        switch(plan){
//            case "Platinum":
//                System.out.println("For the Platinum plan, the price is 799");
//                break;
//            case "Gold":
//                System.out.println("For Gold plan, the price is 599");
//                break;
//            case "Silver":
//                System.out.println("For the Silver plan, the price is 399");
//                break;
//            case "Bronze":
//                System.out.println("For the Bronze plan, the price is 199");
//                break;
//            case "free":
//                System.out.println("For less than 199, the platform is free with limited access");
//                break;
//            default:
//                System.out.println("Invalid input");
//        }
        //-------------------------------------------------------------------------------
        //Q8. Write a program that takes two numbers from the user. If both the numbers are
        //positive multiply them and provide a switch case to verify whether the calculated
        //number is even or odd, if the user enters any negative number, the program should
        //terminate by saying “Sorry negative numbers are not allowed”.
        //Now you have to use if else and switch both in the same code.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("Enter num2: ");
//        int num2 = sc.nextInt();
//
//        if(num1 > 0 && num2 > 0){
//            System.out.println("Multiplication: " + num1 * num2);
//
//        int ans = num1*num2;
//
//        switch(ans%2){
//            case 0:
//                System.out.println(ans +" is a even number");
//                break;
//            case 1:
//                System.out.println(ans + " is a odd" +
//                        " number");
//                break;
//            default:
//                System.out.println("Answer is not valid");
//
//        }
//        }else{
//            System.out.println("sorry negative numbers are not allowed");
//        }
        //------------------------------------------------------------------
        //Q9. Write a program in which students should enter marks for 5 different subjects.
        //If all subjects have the above passing marks add them and provide a switch case to
        //print grades(first class with distinction, first class, second class), if a student gets a
        //fail in any subject, the program should print “Y ou failed the exam”.
        //Now you have to use if else and switch both in the same code

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter marks sub1: ");
//        int sub1 = sc.nextInt();
//
//        System.out.print("Enter marks sub2: ");
//        int sub2 = sc.nextInt();
//
//        System.out.print("Enter marks: ");
//        int sub3 = sc.nextInt();
//
//        System.out.print("Enter marks: ");
//        int sub4 = sc.nextInt();
//
//        System.out.print("Enter marks: ");
//        int sub5 = sc.nextInt();
//
//        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
//
//        if(sub1<35 || sub2<35 || sub3<35 || sub4<35 || sub5<35) {
//            System.out.println("You failed the exam");
//            return;
//        }
//
//        char Grade = 'f';
//        if(sum >= 450 && sum <= 500){
//            Grade = 'A';
//        }else if(sum >= 350){
//            Grade = 'B';
//        }else if(sum >= 250){
//            Grade = 'C';
//        }else if(sum >= 170){
//            Grade = 'D';
//        }else if(sum >= 0){
//            Grade = 'F';
//        }
//
//        switch(Grade){
//            case 'A':
//                System.out.print("first class with distinction");
//                break;
//            case 'B':
//                System.out.print("first class");
//                break;
//            case 'C':
//                System.out.print("second class");
//                break;
//            case 'D':
//                System.out.println("Third class");
//                break;
//            case 'F':
//                System.out.println("Fail");
//                break;
//            default:
//                System.out.println("Invalid marks");
//        }
//         double X = 25.5;
//         switch(X){
//             case 5.5:
//                 System.out.println("5.5");
//                 break;
//             case 15.5:
//                 System.out.println("15.5");
//                 break;
//             case 25.5:
//                 System.out.println("25.5");
//                 break;
//             case 35.5:
//                 System.out.println("35.5");
//                 break;
//             default:
//                 System.out.println("Invalid input");
//         }
         //we can use swtich using wihtout break in JDK 12.
        sc.close();

        }
    }




