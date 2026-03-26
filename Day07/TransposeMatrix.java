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
public class TransposeMatrix {
    static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //without using another array
    static void TransposeInplace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                //swap Array
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    static void ReverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void Rotate(int[][] matrix, int n) {
        //Transpose
        TransposeInplace(matrix, n, n); // n means r and c.. here we call transpose method

        //Reverse each row of transposed matrix
        for (int i = 0; i < n; i++) {
            ReverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int TotalElements = r * c;

        System.out.println("Enter " + TotalElements + " Elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix: ");
        PrintMatrix(matrix);

        Rotate(matrix, r);

        System.out.println("Rotation matrix:");
        PrintMatrix(matrix);
    }
}




