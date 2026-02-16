package Day03;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseQuestions {
    public static void main(String[] args) {
        //1. Write a program to check whether the given number is positive or negative.
        //Input: num = 5;
        //Output: 5 is a positive number.
        //Input:  num = -9;
        //Output: -9 is a negative number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num >=0){
            if(num ==0){
                System.out.println(num + "  number is zero");
            }else{
                System.out.println(num + " is a positive number");
            }
        }else{
            System.out.println(num + " is a negative number");
        }
        //---------------------------------------------------------------------------

        //2. Write a program to check whether the given number is even or odd
        //Input: num =13;
        //Output: 13 is an odd number
        //Input: num =8;
        //Output: 8 is an even number

        Scanner AB = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num1 = sc.nextInt();

        if(num1 %2 ==0){
            System.out.println(num1 + " number is a even number");
        }else{
            System.out.println(num1 + " number is a odd number");
        }
        //---------------------------------------------------------------------------

//         3. Write a program to check whether the given number is less than 10 or greater than 10.
//        Input: num =13;
//        Output: 13 is greater than 10.
//        Input: num =8;
//        Output: 8 is less than 10;
//        Input: num =10;
//        Output: 10 is equal to 10

        Scanner CD = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = CD.nextInt();

        if(number >= 10){
            if(number ==10){
                System.out.println(number + " is equal to 10");
            }else{
                System.out.println(number + " is greater than 10");
            }
        }else{
            System.out.println(number + " is less than 10");
        }
            //---------------------------------------------------------------------------

    //        4. Write a program to check whether the given Character is in UPPERCASE (Capital) or
    //        in lowercase. (take hardcoded values)
    //        Input: ch = ‘a’;
    //        Output: a is a lowercase character
    //        Input: ch = ‘A ’;
    //        Output: A is an UPPERCASE character



    }
}





