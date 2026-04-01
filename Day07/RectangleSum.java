package Day07;

import java.util.Scanner;
//First Approach

//public class RectangleSum {
//    static int findSum(int[][]matrix, int l1, int l2, int r1, int r2){
//        int sum = 0;
//
//        for(int i = l1; i <= l2; i++){
//            for(int j = r1; j <=r2; j++){
//                sum = sum + matrix[i][j];
//            }
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter values");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int [][] matrix = new int[r][c];
//
//        int total = r*c;
//
//        System.out.println("Enter " + total + " Elements");
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c;j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter Reactangle boundries l1, l2 ,r1 ,r2 ");
//        int l1 = sc.nextInt();
//        int l2 = sc.nextInt();
//        int r1 = sc.nextInt();
//        int r2 = sc.nextInt();
//
//        System.out.println("Reatangle sum: " + findSum(matrix, l1, l2,r1,r2));
//    }
//}
//-------------------------------------------------------------------------------------------------------------------------------------------
//Second approch
public class RectangleSum {
    //First Approch
    static int findSum(int[][]matrix, int r1, int r2, int c1, int c2){
        int sum = 0;

        for(int i = r1; i <= r2; i++){
            for(int j = c1; j <= c2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    static void findPrefixSumofMatrix(int[][] matrix){
      int r = matrix.length;
      int c = matrix[0].length;

      //traverse horizontal to calculate row-wise prefix sum
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c ; j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }
    static int findSum2(int[][]matrix, int r1, int r2, int c1, int c2){
        int sum = 0;
        findPrefixSumofMatrix(matrix);

        for(int i = r1; i <= r2; i++ ){
            //r1 to r2 sum for row i
            if(c1 >= 1)
                sum += matrix[i][c2] - matrix[i][c1 - 1];
            else
                sum += matrix[i][c2];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];

        int total = r*c;

        System.out.println("Enter " + total + " Elements");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Reactangle boundries r1, r2 ,c1 ,c2 ");
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("Reatangle sum: " + findSum(matrix, r1, r2,c1,c2));
        System.out.println("Reatangle sum: " + findSum2(matrix,r1, r2,c1,c2));
    }
}
