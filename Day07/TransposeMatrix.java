package Day07;

import java.util.Scanner;

public class TransposeMatrix {
    static void PrintMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
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
    static void Transpose(int [][]matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }
    }
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rows and col in a matrix:");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            int TotalElements = r * c;

            System.out.println("Enter " + TotalElements + "Elements");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }


        System.out.println("Input matrix: ");
        PrintMatrix(matrix);

        System.out.println("Transpose of Matrix");
        Transpose(matrix, r, c);
        PrintMatrix(matrix);

//        int [][] ans = FindTransposeMatrix(matrix, r ,c);
//        PrintMatrix(ans);

    }
}