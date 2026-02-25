package Day05;

import java.util.Scanner;

public class Nestedloop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter row: ");
//        int row = sc.nextInt();
//        System.out.print("Enter col: ");
//        int col = sc.nextInt();
//
//        for(int i =1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print(" * ");
//            }
//            System.out.println( );
//        }
        //------------------------------------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter row: ");
//        int row = sc.nextInt();
//        System.out.print("Enter col: ");
//        int col = sc.nextInt();
//
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                if(i==1 || i==row || j==1 || j==col){
//                    System.out.print("* ");
//                }else
//                    System.out.print("  ");
//            }
//            System.out.println( );
//        }
        //-------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter row: ");
//        int row = sc.nextInt();
//
//        for(int i=1; i<=row; i++){
//            for(int j=1; j<=i; j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//
//    }}
        //--------------------------------------------------------------------
        //(Shruti type)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter row: ");
//        int row = sc.nextInt();
//
//        for(int i=row; i>=1; i--){
//            for(int j=i; j>=1; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }}
    //------------------------------------------------------------------
        //(CW type)
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter row: ");
//    int row = sc.nextInt();
//
//        for(int i=1; i<=row; i++){
//        for(int j=1; j<=(row +1 - i); j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//
//    }//------------------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){ //for blank spaces
                System.out.print(" ");
            }for(int k=1; k<=2*i-1; k++){ //2*i-1 it print *
                System.out.print("*");
            }
            System.out.println();
        }
  }
}

