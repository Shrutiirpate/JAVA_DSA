package Day07;
import java.util.Scanner;

import static Day07.TwoPointerArray.ReverseArray;
//we can only this method for square matrix not for non-square

//public class TransposeMatrix {
//    static void PrintMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    //Using another Array
//    static int[][] FindTransposeMatrix(int[][]matrix , int r, int c){
//        int [][] ans = new int[c][r];
//
//        for(int i = 0; i < c; i++){
//            for(int j = 0; j < r; j++){
//                ans[i][j] = matrix[j][i];
//            }
//        }
//        return ans;
//    }
//    public static void main(String[]args){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter rows and col in a matrix:");
//            int r = sc.nextInt();
//            int c = sc.nextInt();
//            int[][] matrix = new int[r][c];
//            int TotalElements = r * c;
//
//            System.out.println("Enter " + TotalElements + " Elements");
//            for (int i = 0; i < r; i++) {
//                for (int j = 0; j < c; j++) {
//                    matrix[i][j] = sc.nextInt();
//                }
//            }
//        System.out.println("Input matrix: ");
//        PrintMatrix(matrix);
//
//        int [][] ans = FindTransposeMatrix(matrix, r ,c);
//        PrintMatrix(ans);
//    }
//}
//---------------------------------------------------------------------------------------------------------------------
//without using another array
//we can only this method for square matrix not for non-square

//public class TransposeMatrix {
//    static void PrintMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    //without using another array
//    static void Transpose(int [][]matrix, int r, int c) {
//        for (int i = 0; i < c; i++) {
//            for (int j = i; j < r; j++) {
//                //swap Array
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//
//            }
//
//        }
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter rows and col in a matrix:");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int[][] matrix = new int[r][c];
//        int TotalElements = r * c;
//
//        System.out.println("Enter " + TotalElements + " Elements");
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Input matrix: ");
//        PrintMatrix(matrix);
//
//        System.out.println("Transpose of Matrix");
//        Transpose(matrix, r, c);
//        PrintMatrix(matrix);
//    }
//}
//------------------------------------------------------------------------------------------------
//given a  square matrix, turn it by 90 degrees in a clockeswise direction without using any extra space
//public class TransposeMatrix {
//    static void PrintMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    //without using another array
//    static void TransposeInplace(int[][] matrix, int r, int c) {
//        for (int i = 0; i < c; i++) {
//            for (int j = i; j < r; j++) {
//                //swap Array
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//    }
//    static void ReverseArray(int[] arr) {
//        int i = 0;
//        int j = arr.length - 1;
//
//        while (i < j) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//    }
//    static void Rotate(int[][] matrix, int n) {
//        //Transpose
//        TransposeInplace(matrix, n, n); // n means r and c.. here because it is a square matrix no. of rows = no. of col r=c=n
//
//        //Reverse each row of transposed matrix
//        for (int i = 0; i < n; i++) {
//            ReverseArray(matrix[i]);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row and col:");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int[][] matrix = new int[r][c];
//        int TotalElements = r * c;
//
//        System.out.println("Enter " + TotalElements + " Elements");
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Input matrix: ");
//        PrintMatrix(matrix);
//
//        Rotate(matrix, r);
//
//        System.out.println("Rotation matrix:");
//        PrintMatrix(matrix);
//    }
//}
//-----------------------------------------------------------------------------------------------------------------------
//given an integer n, return the first n rows of pascal's triangle . in the pascal's triangle, each number is the sum of the two number above

public class TransposeMatrix {
    static void PrintPascal(int [][] pascal){
        for(int i = 0; i< pascal.length;i++){
            for(int j = 0; j < pascal[i].length; j++){
                System.out.print(pascal[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int [][] ans = new int[n][];

        for(int i = 0; i < n; i++){
            //ith row has i+1 columns
            //ans[0] = new int (o + 1) =1
            //ans[1] = new int(1 + 1) =2
            //ans[2] = new int( 2 + 1)=3
            ans[i] = new int[i +1]; // for calculate col

            //1st and last element of every row is 1
            ans[i][0] = ans[i][i]=1; // 1st and last 1

            for(int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i -1][j -1]; // calculate the value in between
            }
        }
            return  ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of n");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        PrintPascal(ans);
    }
}



