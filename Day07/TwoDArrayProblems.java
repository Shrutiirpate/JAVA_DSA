package Day07;

import java.util.Scanner;

//public class TwoDArrayProblems {
//    static void PrintArray(int[][]arr){
//        for(int i = 0; i < arr.length; i++){ //row outside array
//            for(int j =0; j < arr[i].length; j++){ //col inner array
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of row: ");
//        int r = sc.nextInt();
//        System.out.println("Enter number of col: ");
//        int c = sc.nextInt();
//        int[][] arr = new int[r][c];
//
//        System.out.println("Enter " + r*c + " Elements");
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
////        int [][] arr = {{1, 3, 2},
////                        {4, 4, 6},
////                         {7, 8, 9} };
//        System.out.println(" Output: ");
//            PrintArray(arr);
//
//    }
//}
//---------------------------------------------------------------------------------------------------------------
//Addition of Matrix
//public class TwoDArrayProblems {
//    static void PrintMatrix(int[][]matrix){
//        for(int i = 0; i < matrix.length; i++){ //row outside array
//            for(int j =0; j < matrix[i].length; j++){ //col inner array
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//    }
//    static void add(int[][]a, int r1, int c1, int[][]b, int r2, int c2){
//        if(r1 != r2 || c1 != c2){
//            System.out.println("Wrong Input- Addition not possible");
//            return;
//        }
//        int [][] sum = new int[r1][c1];
//        for(int i = 0; i < r1; i++){
//            for(int j = 0; j < c1; j++){
//                sum[i][j] =a[i][j] + b[i][j];
//            }
//        }
//        PrintMatrix(sum);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of row and col for matrix 1: ");
//        int r1 = sc.nextInt();
//        int c1 = sc.nextInt();
//        int[][] a = new int[r1][c1];
//
//        System.out.println("Enter " + r1*c1 + " Elements");
//        for(int i = 0; i < r1; i++){
//            for(int j = 0; j < c1; j++){
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter number of row and col for matrix 2: ");
//        int r2 = sc.nextInt();
//        int c2 = sc.nextInt();
//        int[][] b = new int[r1][c1];
//
//        System.out.println("Enter " + r2*c2 + " Elements");
//        for(int i = 0; i < r2; i++){
//            for(int j = 0; j < c2; j++){
//                b[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Matrix 1");
//        PrintMatrix(a);
//
//        System.out.println("Matrix 2");
//        PrintMatrix(b);
//
//        System.out.println("Addition of 2 matrix is: ");
//        add(a ,r1 ,c1, b, r2, c2);
//    }
//}
//-------------------------------------------------------------------------------------------------------------------------------------------------
//write a program display multiplication of two matrices entered by the users
public class TwoDArrayProblems {
    static void PrintMatrix(int[][]matrix){
        for(int i = 0; i < matrix.length; i++){ //row outside array
            for(int j =0; j < matrix[i].length; j++){ //col inner array
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static void multiply(int[][]a, int r1, int c1, int[][]b, int r2, int c2){
//        if(r1 != r2 || c1 != c2){
//            System.out.println("Wrong Input- Addition not possible");
//            return;
//        }
        int [][] Multiplication = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                Multiplication[i][j] =a[i][j] * b[i][j];
            }
        }
        PrintMatrix(Multiplication);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row and col for matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("Enter Elements");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of row and col for matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r1][c1];

        System.out.println("Enter Elements");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        PrintMatrix(a);

        System.out.println("Matrix 2");
        PrintMatrix(b);

        System.out.println("Multiplication of 2 matrix is: ");
        multiply(a ,r1 ,c1, b, r2, c2);
    }
}
