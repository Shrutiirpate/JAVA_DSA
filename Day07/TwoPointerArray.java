package Day07;
//Sort an Array consisting  of only 0s and 1s
//import java.util.Scanner;
//
//public class TwoPointerArray {
//
//    static void PrintArray(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(" ");
//    }
//    static void swap(int [] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//    static void SortedZerosandOnes(int[]arr){
//        int n = arr.length;
//        int zeros = 0;
//
//        //count number of zeros
//        for(int i=0; i < n; i++){
//            if(arr[i] == 0){
//                zeros++;
//            }
//        }
//        //covert 0 to zeros-1 : 0, zeros to n-1 : 1
//        for(int i = 0; i < n; i++){
//            if(i < zeros){
//                arr[i] = 0;
//            }else{
//                arr[i] = 1;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of an array: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.print("Enter " + n + " Elements ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Orignal array: ");
//        PrintArray(arr);
//
//        SortedZerosandOnes(arr);
//
//        System.out.print("After sorted array: ");
//        PrintArray(arr);
//    }
//}
//---------------------------------------------------------------------------------------------------------------------------
//Sort an Array consisting  of only 0s and 1s
//import java.util.Scanner;
//
//public class TwoPointerArray {
//
//    static void PrintArray(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(" ");
//    }
//    static void swap(int [] arr, int left, int right){
//        int temp = arr[left];
//        arr[left] = arr[right];
//        arr[right] = temp;
//    }
//    static void SortedZerosandOnes(int[]arr) {
//        int n = arr.length;
//
//        int left = 0, right = n - 1;
//
//        while (left < right) {
//            if (arr[left] == 1 && arr[right] == 0) {
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//            if (arr[left] == 0) {
//                left++;
//            }
//            if (arr[right] == 1) {
//                right--;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of an array: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.print("Enter " + n + " Elements ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Orignal array: ");
//        PrintArray(arr);
//
//        SortedZerosandOnes(arr);
//
//        System.out.print("After sorted array: ");
//        PrintArray(arr);
//    }
//}
//---------------------------------------------------------------------------------
//given an array of integers 'a', move all the even integers at the beginning of the
//array followed by all the odd integers.the relative oder of add or even integers does not
//matter. return anu array that satisfies the condition.

//import java.util.Scanner;
//
//public class TwoPointerArray {
//
//    static void PrintArray(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(" ");
//    }
//    static void swap(int [] arr, int left, int right){
//        int temp = arr[left];
//        arr[left] = arr[right];
//        arr[right] = temp;
//    }
//    static void SortedEVENODD(int[]arr) {
//        int n = arr.length;
//
//        int left = 0, right = n - 1;
//
//        while (left < right) {
//            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//            if (arr[left] % 2 == 0) {
//                left++;
//            }
//            if (arr[right] % 2 == 1) {
//                right--;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of an array: ");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//
//        System.out.print("Enter " + n + " Elements ");
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("Orignal array: ");
//        PrintArray(arr);
//
//        SortedEVENODD(arr);
//
//        System.out.print("After sorted array: ");
//        PrintArray(arr);
//    }
//}
//---------------------------------------------------------------------------------------------
//gjiven an integer array 'a' sorted in non-decreasinf order, return an array
//of the square of each numbersorted in non-decresing order.
import java.util.Scanner;
public class TwoPointerArray {

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void ReverseArray(int[]arr, int left,int right ){
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    static int[] SortedSquare(int[]arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        int [] ans = new int[n];
        int k = 0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k] = arr[left] * arr[left];
                        k++;
                        left++;
                }else{
                    ans[k] = arr[right] * arr[right];
                    k++;
                    right--;
                }
            }
        return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " Elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Orignal array: ");
        TwoPointerArray.PrintArray(arr);

        int[] ans = SortedSquare(arr);

        System.out.print("After sorted array: ");
        PrintArray(ans);

        System.out.print("After reverse array: ");
        ReverseArray(ans, 0, ans.length - 1);
        PrintArray(ans);
    }
}