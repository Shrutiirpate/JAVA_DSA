package Day07;
//given a nxm matrix 'a' return all elements of the matrix in spiral order
import java.util.Scanner;
//
//public class PrintSpiral {
//    static void Print(int[][] matrix ){
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[i].length; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//        }
//        System.out.println(" ");
//    }
//    static void PrintSpiralMatrix(int [][]matrix, int r, int c){
//        int topRow = 0, bottomRow = r -1, leftCol = 0, rightCol = c - 1;
//        int TotalElements = 0;
//
//        while(TotalElements < r * c){
//            //topRow -> leftCol to rightCol
//            for(int j = leftCol; j <= rightCol && TotalElements < r*c; j++){
//                System.out.print(matrix[topRow][j]+ " ");
//                TotalElements++;
//            }
//            topRow++;
//
//            //rightCol -> topRow to bottomRow
//            for(int i = topRow; i <= bottomRow && TotalElements < r*c; i++){
//                System.out.print(matrix[i][rightCol]+ " ");
//                TotalElements++;
//            }
//            rightCol--;
//
//            //bottomRow -> rightCol to leftCol
//            for(int j = rightCol; j >= leftCol && TotalElements < r*c; j--){
//                System.out.print(matrix[bottomRow][j] +" ");
//                TotalElements++;
//            }
//            bottomRow--;
//
//            // leftCol -> bottomRow to topRow
//            for(int i = bottomRow; i >= topRow && TotalElements < r*c; i--){
//                System.out.print(matrix[i][leftCol] +" ");
//                TotalElements++;
//            }
//            leftCol++;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter values");
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        int[][] matrix = new int[r][c];
//        int total = r * c;
//
//
//        System.out.println("Enter " + total + " Elements");
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("Input");
//        Print(matrix);
//
//        System.out.println("Spiral Matrix");
//        PrintSpiralMatrix(matrix, r, c);
//    }
//}
//------------------------------------------------------------------------------------------------------------------------------------------------------
//given a postive integer

//public class PrintSpiral {
//    static void Print(int[][] matrix ){
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[i].length; j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//
//    }
//    static int[][] GenerateSpiralMatrix(int n) {
//        int[][] matrix = new int[n][n];
//        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
//        int Curr = 1;
//
//        while (Curr <= n * n) {
//            //topRow -> leftCol to rightCol
//            for (int j = leftCol; j <= rightCol && Curr <= n * n; j++) {
//                matrix[topRow][j] = Curr; // Cur++ POST increment
//                Curr++;
//            }
//            topRow++;
//
//            //rightCol -> topRow to bottomRow
//            for (int i = topRow; i <= bottomRow && Curr <= n * n; i++) {
//                matrix[i][rightCol] = Curr;
//                Curr++;
//            }
//            rightCol--;
//
//            //bottomRow -> rightCol to leftCol
//            for (int j = rightCol; j >= leftCol && Curr <= n * n; j--) {
//                matrix[bottomRow][j] = Curr;
//                Curr++;
//            }
//            bottomRow--;
//
//            // leftCol -> bottomRow to topRow
//            for (int i = bottomRow; i >= topRow && Curr <= n * n; i--) {
//                matrix[i][leftCol] = Curr;
//                Curr++;
//            }
//            leftCol++;
//        }
//        return matrix;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter values");
//        int n = sc.nextInt();
//
//        int [][] matrix = GenerateSpiralMatrix(n);
//        Print(matrix);
//    }
//}
//--------------------------------------------------------------------------------------------------------------------
//assignment(incomplete)
public class PrintSpiral {
    static void Print(int[][] matrix ){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
    static int[][] GenerateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = n-1, bottomRow = n, leftCol = n-1, rightCol = n;
        int Curr =  1;

        while (Curr <= n * n) {
            //topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && Curr <= n * n; j++) {
                matrix[topRow][j] = Curr; // Cur++ POST increment
                Curr++;
            }
            topRow++;

            //rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && Curr <= n * n; i++) {
                matrix[i][rightCol] = Curr;
                Curr++;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && Curr <= n * n; j--) {
                matrix[bottomRow][j] = Curr;
                Curr++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && Curr <= n * n; i--) {
                matrix[i][leftCol] = Curr;
                Curr++;
            }
            leftCol++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        int n = sc.nextInt();

        int [][] matrix = GenerateSpiralMatrix(n);
        Print(matrix);
    }
}
