package Day05;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//
//        int num = 1;
//
//        while (num <= n){
//            System.out.println(num);
//            num++; //we can also write num = num +1
//        }
        //---------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//        int num = 1;
//
//        while(num <= n){
//            sum = sum + num;
//            num++;
//        }
//        System.out.println(sum);
        //--------------------------------------------------------

        //Sum of Digits: Create a program that calculates the sum of the digits
        // in a given integer (e.g., for the number 123, the sum would be 6).
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number one: "); //
//        int num = sc.nextInt();
//        int sum = 0;
//
//        while(num > 0){
//            int digit = num % 10; //it remove last digit. if we take num = 123 (12) digit will be 3....12 get last digit 2...1
//            sum = sum + digit;    //  0 = 0 + 3 = 3 .......3 = 3 + 2 = 5.......5=5+1=6
//            num = num / 10;        // 123 = 123 / 10 (it remove last digit) 12 (3 remove).........12 remove last reamins 1 ....0
//        }
//        System.out.println("sum of digits = " + sum);

        //-------------------------------------------------------------------------------------------------------------------------
        //Reverse a Number: Write a program to reverse a given number using a while loop (e.g., 123 becomes 321).
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = sc.nextInt();
//        int reverse = 0;
//
//        while(number > 0){
//            int digit = number % 10;
//            reverse = reverse * 10 + digit;
//            number = number / 10;
//        }
//        System.out.println("Reverse number is: " + reverse);
        //-------------------------------------------------------------------------------------------------------------------------

        //Multiplication Table: Generate and print the multiplication table of a number entered by the user.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//        int i = 1;
//
//        while(i <= 10){
//           int result = num * i;
//            System.out.println(num + " x " + i + " = " + result);
//            i++;
//        }
        //==-------------------------------------------------------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("i = " + i);
//            i++;
//        }
        //=-------------------------------------------------------------------------------------------------
        //Print only numbers from 20 to 1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        int num = 20;
//
//        while (num >= 1 ) {
//            System.out.println(num);
//            num--;
//        }
        //------------------------------------------------------------------
        //Print only even numbers from 1 to 50.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        int num = 1;
//
//        while(num <= 50){
//              if(num % 2 == 0)
//                  System.out.println(num);
//                  num++;
//        }
        //Print only odd numbers from 1 to 50.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int num = 1;

        while(num <= 50){
              if(num % 2 !=0)
                  System.out.println(num);
              num++;
        }



    }
}
