package Day04;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

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

        int x = 3;
        switch (x){
            case 1 :
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Invalid number");
        }
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
        }


    }



