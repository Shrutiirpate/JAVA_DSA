package Day05;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
//        //Question1:- Write a program to print the first ‘N’ natural numbers. Where N is user given
//        //number.
//        //Input:
//        //N=10
//        //Output: 1, 2, 3,4…10
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//
//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        //-----------------------------------------------------------------------------------------------
        //Question2:- Write a program to print the first ‘N’ whole numbers. Where N is user given
        //number.
        //Input:
        //N=100
        //Output: 0,1,2,34,5…100
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//
//        for(int i = 0; i<=100; i++){
//            System.out.println(i);
//        }
        //--------------------------------------------------------------------------------------

       //4. Write a program to print the even numbers from 1 to N. Where N is user given
        //number.
        //Input:
        //N=100
        //Output: 2,4,6,8,10,...100
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//
//        for(int i =2; i<=num; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }
        //------------------------------------------------------------------------------------

//        //5. Write a program to print the odd numbers from 1 - N. Where N is user given
//        //number
//        //Input:
//        //N=70
//        //Output: 1,3,5,7,...69
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//
//        for(int i =1; i<=num; i++){
//            if(i % 2 != 0){
//                System.out.println(i);
//            }
//        }
        //-----------------------------------------------------------------------------------------
//        //6. Write a program to print the numbers in reverse order from ‘N’- 10.Where N is
//        //user given number.
//        //Input:
//        //N=80
//        //Output: 80,79,78,77,..10
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int N = sc.nextInt();
//        for(int i = N; i>=10; i--){
//                System.out.println(i);
//        }
        //---------------------------------------------------------------------------------------------
        //7. Write a program to print a table of ‘N’. Where N is user given number.
        //Input:
        //N=17
        //Output: 17,34,51,68,...170
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//
//        for(int i =1; i<=10; i++){
//
//                System.out.println(num * i);
//        }
        //----------------------------------------------------------------
        //8. Write a program to print a table of ‘N’ in reverse order. Where N is user given
        //number.
        //Input:
        //N=14
        //Output: 140, 126, 112, ..14
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//
//        for(int i=10; i>=1; i--){
//            System.out.println(num*i);
//        }
        //--------------------------------------------------------------------------
        //9. Write a program to print the sum of the first ‘N’ natural numbers. Where N is user
        //given number.
        //Input:
        //N=10
        //Output:55
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int sum = 0;
//
//        for(int i=1; i<=num; i++){
//            sum += i;//sum = sum + i
//        }
//        System.out.println(sum);

        //---------------------------------------------------------------------------------
        //10. Write a program to print the count of odd numbers between 1 And ‘N’. Where N
        //is user given number.
        //Input:
        //N=10
        //Output:
        //Count of odd numbers:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int num = sc.nextInt();
//        int count = 0;
//
//        for(int i =1; i<=num; i++) {
//            if (i % 2 != 0)
//                count++;
//
//        } System.out.println("Count od odd number: " + count);
        //--------------------------------------------------------------------
        //factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i =1; i<=num; i++) {
            fact = fact * i;
            System.out.println("Factorail of " + i  + " : "+ fact);


        }


    }
}
