package Day05;

import java.util.Scanner;

public class Questionsonloop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        int numofdigit =0;
//        int orignal_n = n;
//
//        while(n > 0){
//            n = n / 10;
//            numofdigit++; // numofdigit = numofdigit + 1
//        }
//        System.out.println("numofdigit "+ orignal_n + " =" + numofdigit);
        //---------------------------------------------------------------------
        //sum of digits new by CW
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//
//        int sumOfDigits = 0;
//        int orignal_num = num;
//
//        while(num > 0){
//            sumOfDigits = sumOfDigits + num % 10;
//            num = num/10;
//        }
//        System.out.println("sum of digits " + orignal_num + " = " + sumOfDigits);
        //-----------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
         int reverse = 0;
         int orignal_num = num;
         int digit = 0;

         while(num > 0){
              digit = num % 10;
             reverse = reverse * 10 + digit; // reverse = reverse * 10 + num % 10;
             num = num /10;

         }
        System.out.println("reverse of " +orignal_num + " = " + reverse);


    }
}
