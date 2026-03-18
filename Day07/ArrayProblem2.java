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
//    int [] ans = ReverseArray(arr);
//    PrintArray(ans);
//    }
//}
//--------------------------------------------------------------------------------------------------------------------
//Reverse an array consisting of integer values(Taking input from user)

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
//public class ArrayProblem2{
//    static void PrintArray(int[]arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print(" ");
//    }
//    static void swapArray(int[]arr, int i, int j){
//        arr[i] = arr[i] + arr[j];
//        arr[j] = arr[i] - arr[j];
//        arr[i] = arr[i] - arr[j];
//    }

import java.util.Scanner;

////    static void ReverseArray(int[]arr){
////        int i = 0, j = arr.length - 1;
////        while(i < j){
////            swapArray(arr, i, j);
////            i++;
////            j--;
////        }
////    }
//    //using fro loop
//    static void ReverseArray(int[]arr){
//        int j = arr.length-1;
//
//        for(int i = 0; i < j; i++){
//            swapArray(arr, i , j);
//                j--;
//        }
//    }
//    public static void main(String[] args) {
//       int[] arr = {1, 2, 3, 4, 5};
//
//        ReverseArray(arr);
//        PrintArray(arr);
//    }
//}
//---------------------------------------------------------------------------------------------------------------------------
//rotate the given array 'a' by k steps where k is non-negative.note-k can be greater than n as well
//public class ArrayProblem2{
//    static void PrintArray(int[]arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print(" ");
//    }
//    static int[] rotate(int[]arr, int k){
//        int n = arr.length;
//        k = k % n; // k=7 and n=5 7=7%5=2 it means it rotated 2 times
//
//        int [] ans = new int[n];
//        int j = 0;
//
//        for(int i = n - k; i < n; i++){ // n for array and k for rotation
//            ans[j++] = arr[i];
//        }
//        for(int i = 0; i < n - k; i++){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.print("Enter " + n + " Elements ");
//        for(int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter k: ");
//        int k = sc.nextInt();
//
//        System.out.print("Orignal array: ");
//        PrintArray(arr);
//
//        System.out.println(" ");
//
//        int[]ans = rotate(arr ,k);
//
//        System.out.print("Array after rotate: ");
//        PrintArray(ans);
//
//    }
//}
//------------------------------------------------------------------------------------------------------------------------
//Rotate the given array 'a' by K steps, where K is non-negative without using extra space. Note- k can be greater than n as well
//public class ArrayProblem2{
//    static void PrintArray(int[]arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print(" ");
//    }
//    static void swap(int[]arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//    }
//        static void ReverseArray(int[]arr, int i,int j ){
//            while(i < j){
//                swap(arr, i, j);
//                i++;
//                j--;
//            }
//        }
//    static void RotatedInPlace(int[]arr, int k){
//        int n = arr.length;
//        k = k % n;
//
//        ReverseArray(arr, 0, n-k-1);
//        ReverseArray(arr, n-k, n-1);
//        ReverseArray(arr, 0, n-1);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.print("Enter " + n + " Elements ");
//        for(int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter k: ");
//        int k = sc.nextInt();
//
//        System.out.print("Orignal array: ");
//        PrintArray(arr);
//
//        RotatedInPlace(arr , k); // we called this method in end that why output change in one aaray
//
//        System.out.println(" ");
//
//        System.out.print("Array after rotate: ");
//        PrintArray(arr);
//    }
//}
//-----------------------------------------------------------------------------------------------------------------
  // Given Q quesries, check if the given number is present in the array or not,Note- values of all elements in the array is less than 10 to the power 5.
public class ArrayProblem2{
  static int[] makeFrequencyArray(int[] arr){
      int [] freq = new int[100005];//here we create frequency array up to 100005(10 to the power 5)

      for(int i = 0; i < arr.length; i++){
          //freq[arr[i]]++;
          freq[arr[i]] = freq[arr[i]] + 1;
      }
      return freq;
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter " + n + " Elements ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of quesries: ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.println("Enter number to be searched: ");
            int x = sc.nextInt();
            if(freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }
    }
}