package Day05;

import java.util.Scanner;

public class QuestionsonNested {
    public static void main(String[] args) {
//        //Question 1:- Q1 Write a program to print the following pattern.
//        //Input: Number of rows = 3
//        //$  $  $
//        //$  $  $
//        //$  $  $
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = sc.nextInt();
//
//        System.out.println("Enter col: ");
//        int col = sc.nextInt();
//
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print("1 ");
//            }
//            System.out.println( );
//        }
        //------------------------------------------------------------------------------
//        //Question 2:- Write a program to print the following pattern
//        //Input: Number of rows = 3
//        //1  2  3
//        //4  5  6
//        //7  8  9
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = sc.nextInt();
//
//        System.out.println("Enter col: ");
//        int col = sc.nextInt();
//
//        int num=1;
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print(num + "   ");
//                num++;
//            }
//            System.out.println(  );
//        }
        //--------------------------------------------------------------------------

//        //Question 3:- Write a program to print the following pattern
//        //Input: Number of rows = 3
//        //1  1  1
//        //2  2  2
//        //3  3  3
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = sc.nextInt();
//
//        System.out.println("Enter col: ");
//        int col = sc.nextInt();
//
//        //int num=1;
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print(i+" ");
//                //num++;
//            }
//            System.out.println(  );
//        }
        //-----------------------------------------------------------------------

        //Question 4:- Write a program to print the following pattern
        //Input: Number of rows = 3
        //1  2  3
        //1  2  3
        //1  2  3

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = sc.nextInt();
//
//        System.out.println("Enter col: ");
//        int col = sc.nextInt();
//
//        //int num=0;
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print(j+ " ");
//                //num++;
//            }
//            System.out.println(  );
//        }
        //--------------------------------------------------
        //Question 5:- Write a program to print the following pattern
        //Input: Number of rows = 3
        //3  2  1
        //3  2  1
        //3  2  1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = sc.nextInt();
//
//        System.out.println("Enter col: ");
//        int col = sc.nextInt();
//
//
//        for(int i=1; i<=row; i++){
//            int num = row;
//            for(int j=1; j<=col; j++) {
//                System.out.print(num+ " ");
//                num--;
//
//            }
//            System.out.println(  );
//        }
        //--------------------------------------------------------------------------------------
        //Question 6:- Write a program to print the following pattern
        //Input: Number of rows = 3
        //A  B  C
        //D  E  F
        //G  H  I

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = sc.nextInt();
//
//        System.out.println("Enter col: ");
//        int col = sc.nextInt();
//
//        char ch ='A';
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++) {
//                System.out.print(ch + " ");
//                ch++;
//
//            }
//            System.out.println(  );
//        }
        //-------------------------------------------------------------------
        //Question 7:- Write a program to print the following pattern
        //Input: Number of rows = 4
        //A  B  C  D
        //A  B  C  D
        //A  B  C  D
        //A  B  C  D
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row: ");
//        int row = sc.nextInt();
//
//        System.out.println("Enter col: ");
//        int col = sc.nextInt();
//
//        //char ch ='A';
//        for(int i=1; i<=row; i++){
//            char ch ='A';
//            for(int j=1; j<=col; j++) {
//                System.out.print(ch + " ");
//                ch++;
//            }
//          System.out.println(  );
//        }
        //-----------------------------------------------------------------------------------------
        //Question 8:- Write a program to print the following pattern
        //Input: Number of rows = 3
        //1A  2B  3C
        //1A  2B  3C
        //1A  2B  3C
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();

        System.out.println("Enter col: ");
        int col = sc.nextInt();


        for(int i=1; i<=row; i++){
            char ch ='A';
            int num = 1;

            for(int j=1; j<=col; j++) {
                System.out.print(num +""+ ch + " ");
                num++;
                ch++;



            }
            System.out.println(  );
        }



    }
}
