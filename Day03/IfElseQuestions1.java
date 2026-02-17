package Day03;

import java.util.Scanner;

public class IfElseQuestions1 {
    public static void main(String[] args) {
//        1. Write a program to check whether the given number is positive or negative.
//        Input: num = 5;
//        Output: 5 is a positive number.
//        Input:  num = -9;
//        Output: -9 is a negative number.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int num = sc.nextInt();
//
//        if(num >=0){
//            if(num ==0){
//                System.out.println(num + "  number is zero");
//            }else{
//                System.out.println(num + " is a positive number");
//            }
//        }else{
//            System.out.println(num + " is a negative number");
//        }
       //---------------------------------------------------------------------------

//        2. Write a program to check whether the given number is even or odd
//        Input: num =13;
//        Output: 13 is an odd number
//        Input: num =8;
//        Output: 8 is an even number
//
//        Scanner AB = new Scanner(System.in);
//
//        System.out.print("Enter a Number: ");
//        int num1 = sc.nextInt();
//
//        if(num1 %2 ==0){
//            System.out.println(num1 + " number is a even number");
//        }else{
//            System.out.println(num1 + " number is a odd number");
//        }
    //---------------------------------------------------------------------------
//
//         3. Write a program to check whether the given number is less than 10 or greater than 10.
//        Input: num =13;
//        Output: 13 is greater than 10.
//        Input: num =8;
//        Output: 8 is less than 10;
//        Input: num =10;
//        Output: 10 is equal to 10

//        Scanner CD = new Scanner(System.in);
//
//        System.out.print("Enter a Number: ");
//        int number = CD.nextInt();
//
//        if(number >= 10){
//            if(number ==10){
//                System.out.println(number + " is equal to 10");
//            }else{
//                System.out.println(number + " is greater than 10");
//            }
//        }else{
//            System.out.println(number + " is less than 10");
//        }
            //---------------------------------------------------------------------------

//            4. Write a program to check whether the given Character is in UPPERCASE (Capital) or
//            in lowercase. (take hardcoded values)
//            Input: ch = ‘a’;
//            Output: a is a lowercase character
//            Input: ch = ‘A ’;
//            Output: A is an UPPERCASE character

//       Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter char: ");
//        char ch = sc.next().charAt(0);
//
//        if(ch>='a' && ch<='z' ){
//            System.out.println(ch + " is a lower charecter");
//        }else if(ch>='A' && ch<='Z'){
//            System.out.println(ch + " is a Upper charectter");
//        }else{
//            System.out.println(ch + " it is not a charecter");
//        }
        //----------------------------------------------------------------------------------

//        5. Write a program to check whether the given number is divisible by 7 or not.
//        Input : 105
//        Output: Divisible by 7
//        Input: -31
//        Output: Not divisible by 7

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//
//        int num = sc.nextInt();
//
//        if(num % 7 == 0){
//            System.out.println(num + " number is divisible by 7");
//        }else{
//            System.out.println(num + " number is not divisible by 7");
//        }
        //----------------------------------------------------------------------------------
//        6.Write a program to check whether the given number is divisible by 3 or 7.
//        Input: 15
//        Output: 15 is divisible by 3.
//        Input: 28
//        Output: 28 is divisible by 7
//        Input: 20
//        Output: 20 is neither divisible by 3 nor by 7.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//
//        int num = sc.nextInt();
//
//        if(num%3==0){
//            System.out.println(num + " is divisible by 3");
//        }else if(num%7== 0){
//            System.out.println(num + " is divisible by 7");
//        }else{
//            System.out.println(num + " is neither divisible by 3 or 7");
//        }
        //-------------------------------------------------------------------------------------------------------

//        8. Write a program to check if the given number is divisible by 2,5 and 10 or not, if not then
//        print a message “Is Not Divisible By 2,5 and 10”.
//        Input: num = 10
//        Output: 10 is divisible by 2,5 and 10
//        Input: num = 15
//        Output: 15 Is Not Divisible By 2,5 and 10

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//
//        int num = sc.nextInt();
//
//        if(num%2==0 && num%5==0 && num%10==0){
//            System.out.println(num + " is divisible by 2,5 and 10");
//        }else{
//            System.out.println(num + " is Not divisible by 2,5 and 10");
//        }
        //-------------------------------------------------------------------------------

//        9. Write a program to find the maximum between two distinct numbers.
//        Input 1:
//        num1 = 5
//        num2 = 9
//        Output: 9 is maximum between 5,9
//        Input 1:
//        num1 = 1
//        num2 = 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number1: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("Enter number2: ");
//        int num2 = sc.nextInt();
//
//        if(num1 > num2) {
//            System.out.println( num1 + " is maximum between " + num1 + " and " + num2);
//        }else{
//            System.out.println(num2 + " is miximum between " + num1 + " and " + num2);
//        }
        //----------------------------------------------------------------------------------------

//        9. Write a program to check the day number(1-7) and print the corresponding day of week.
//        Input : 1
//        Output: Monday
//        Input : 7
//        Output: Sunday
//        Input : 8
//        Output: day number must be between 1 to 7!!!!

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int day = sc.nextInt();
//
//        if(day ==1){
//            System.out.println("Monday");
//        }else if(day == 2){
//            System.out.println("Tuesday");
//        }else if(day == 3){
//            System.out.println("Wednesday");
//        }else if(day == 4){
//            System.out.println("Thursday");
//        }else if(day ==5){
//            System.out.println("Friday");
//        } else if (day == 6) {
//            System.out.println("Saturday");
//        }else if(day == 7){
//            System.out.println("Sunday");
//        }else{
//            System.out.println(day + " Day number must be in a 1 to 7");
//        }
        //--------------------------------------------------------------------------------------

//        10. Write a program to print the month name according to the month number .
//        Input : 1
//        Output: January
//        Input: 2
//        Output: February
//        Input: 13
//        Output: Invalid input for month

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int month = sc.nextInt();

        if(month ==1){
            System.out.println("January");
        }else if(month == 2){
            System.out.println("February");
        }else if(month == 3){
            System.out.println("March");
        }else if(month == 4){
            System.out.println("April");
        }else if(month ==5){
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        }else if(month == 7){
            System.out.println("July");
        }else if(month == 8){
            System.out.println("August");
        }else if(month == 9){
            System.out.println("september");
        }else if(month == 10){
            System.out.println("october");
        }else if(month == 11){
            System.out.println("November");
        }else if(month == 12){
            System.out.println("December");
        }else{
            System.out.println(month + " Invalid input for month");
        }
    }
}





