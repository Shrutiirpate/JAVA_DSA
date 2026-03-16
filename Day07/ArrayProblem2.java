package Day07;
//given 2 integers a and b, swap the 2 given values uisng temporary variables
//public class ArrayProblem2 {
//    static int swap(int a, int b){
//        System.out.println("Enter Orignal value before swap: ");
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//
//        int temp = a; //stores orignal value of a
//
//        a = b; // 3
//        b = temp; // 9
//
//        System.out.println("Values after swap: ");
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//        return a;
//
//    }
//    public static void main(String[] args) {
//    int a = 9;
//    int b = 3;
//
//   // int [] arr = {1,2, 3, 4, 5};
//
//       swap(a ,b);
//        //System.out.println(swap(a,b));
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//given 2 integers a and b , swap the given 2 given values using sum and difference method
//public class ArrayProblem2 {
//    static int swapwithoutTemp(int a, int b){
//        System.out.println("Enter Orignal value before swap: ");
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//
//       a = a + b; // a = 9 + 3 = 12
//       b = a - b; //b = 12 - 3 = 9
//       a = a - b; //a = 12 - 9 = 3
//
//        System.out.println("Values after swap: ");
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//        return a;
//
//    }
//    public static void main(String[] args) {
//        int a = 9;
//        int b = 3;
//
//        // int [] arr = {1,2, 3, 4, 5};
//
//       // swap(a ,b);
//        //System.out.println(swap(a,b));
//        swapwithoutTemp(a,b);
//
//    }
//}
// --------------------------------------------------------------------------------------------------------------------------
//Reverse an array consisting of integer values
// public class ArrayProblem2 {
//
//    static void PrintArray(int[]arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println(" ");
//    }
//    static int[] ReverseArray(int[]arr){
//        int n = arr.length;
//        int [] ans = new int[n];
//        int j =0;
//
//        for(int i = n - 1; i >= 0; i--){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//    int a = 9;
//    int b = 3;
//    int [] arr = {1,2, 3, 4, 5};
//    int[]ans = ReverseArray(arr);
//    PrintArray(ans);
//    }
//}
//--------------------------------------------------------------------------------------------------------------------
//Reverse an array consisting of integer values(Taking input from user)
import java.util.Scanner;

//public class ArrayProblem2{
//    static void PrintArray(int[]arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print(" ");
//    }
//    static int[] ReverseArray(int[]arr){
//        int n = arr.length;
//        int [] ans = new int[n];
//       // int j = 0;
//
//        //Using while loop
//        int i = n-1, j=0;
//        while(i >= 0){
//            ans[j++] = arr[i];
//            i--;
//        }
//
////         USING FORlOOP
////        for(int i = n - 1; i >= 0; i--){
////            ans[j++] = arr[i];
////        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Size of an Array:");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.println("enter Elements: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//       // int [] arr = { 1, 2, 3, 4, 5, 6};
//        int [] ans = ReverseArray(arr);
//
//        PrintArray(ans);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//Reverse array without using another array
public class ArrayProblem2{
    static void PrintArray(int[]arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ");
    }
    static void swapArray(int[]arr, int i, int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void ReverseArray(int[]arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5,6};

        ReverseArray(arr);
        PrintArray(arr);
    }
}

