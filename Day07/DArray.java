package Day07;

import java.util.Scanner;
//Question1- taking input fro user stire it in a array and print array
//public class DArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Array Size: ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//
//        System.out.print("Enter " + size + " Element");
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i= 0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//=---------------------------------------------------------------------------------------------------------------
//Question2:-make method for print array easily,copy array from one to another and showoutput
//public class DArray {
//    //here we create method to print array
//    static void PrintArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 5;
//        arr[1] = 6;
//        arr[2] = 7;
//        arr[3] = 8;
//        arr[4] = 9;
//
//        //print orignail array
//        System.out.println("Orignal Array");
//        PrintArray(arr);
//
//        //copying arr to arr2
//       // int[] arr_2 = arr;
//        int[] arr_2 = arr.clone();// using this we can print orginal value of 1st array
//        System.out.println("Copied array");
//        PrintArray(arr_2);
//
//        //changing some values of arr_2
//        arr_2[0] = 0;
//        arr_2[1] = 0;
//
//        //print orignal array arr
//        System.out.println("Orignal array after chnaging arr_2");
//        PrintArray(arr);
//
//        //printy arr_2 changes
//        System.out.println("Copied array after chnaging arr_2");
//        PrintArray(arr_2);
//    }
//}
//-------------------------------------------------------------------------------------------------------------------------
//public class DArray {
//    //here we create method to print array
//    static void PrintArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    static void changeVal(int[]arr){
//        for(int i = 0; i<arr.length; i++){
//            arr[i] =0;
//        }
//    }
//    static void  chnage_val(int a){
//        a = 1004;
//    }
//
//    public static void main(String[] args) {
//        int a = 5;
//        chnage_val(a);
//        System.out.println(a);//5
//
//        int[] arr = new int[3];
//        arr[0] = 5;
//        arr[1] = 6;
//        arr[2] = 7;
//
//
//        changeVal(arr);
//        PrintArray(arr);
//
//    }
//}
//--------------------------------------------------------------------------------------------------------------------
//Count reapeted number in an array ( 1 2 2 2 3) x=2 count 3
//count the number of occurrences oa a perticular element x
//public class DArray{
//    static int  countnumber(int arr[], int x){
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//           if(arr[i]==x){
//               count++;
//           }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for(int i=0; i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.print("Enter x: ");
//        int x = sc.nextInt();
//
//        System.out.println("Count of x: "+ countnumber(arr,x));
//
//    }
//}
//--------------------------------------------------------------------------------------------------------------
//Find the last occurence of an element x in a given array
//public class DArray{
//    static int LastOccurence(int arr[],int x){
//        int LastIndex = -1;
//        for(int i=0; i<arr.length;i++){
//            if(arr[i]==x){
//                LastIndex = i;
//            }
//        }
//        return LastIndex;
//    }
//    static int  countnumber(int arr[], int x){
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//           if(arr[i]==x){
//               count++;
//           }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for(int i=0; i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.print("Enter x: ");
//        int x = sc.nextInt();
//
//        System.out.println("Count of x: "+ countnumber(arr,x));
//        System.out.println("LastIndex of x: "+ LastOccurence(arr,x));
//
//    }
//}
//count the number of elements strictly greater than value of x
//public class DArray{
//    static int  countnumber(int arr[], int x){
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > x){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for(int i=0; i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.print("Enter x: ");
//        int x = sc.nextInt();
//
//        System.out.println("Number of elements greater than " + x + " are: " +  countnumber(arr, x));
//
//    }
//}
//----------------------------------------------------------------------------------------------------------------
//Check if the given array is sorted or not
//public class DArray{
//    static boolean checksorted(int []arr){
//        boolean check = true;
//        for(int i = 1; i<arr.length;i++){
//            if(arr[i] < arr[i-1]){
//                check = false;
//                break;
//            }
//        }
//        return check;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array: ");
//        int size = sc.nextInt();
//        int []arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for(int i=0; i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Given number sorted: "+ checksorted(arr));
//    }
//}
//----------------------------------------------------------------------------------------------------------------
//sorted and and find smallest and lasegest element
import java.util.Arrays;
public class DArray{
    static int[] soretedArray(int []arr){
        Arrays.sort(arr);
        int[]ans = {arr[0], arr[arr.length-1]};
        return ans;

        }
//        for(int i=0; i<arr.length; i++){ //using this we can creat array
//            System.out.println(arr[i]);
//        }
//        return arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.println("Enter " + size + " Elements");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // sortedArray(arr);
        int [] ans = soretedArray(arr);
        System.out.println("Samllest: " + arr[0]);
        System.out.println("Largest: " + ans[1]);

    }
}


