package Day07;

import javax.swing.*;
import java.util.Scanner;
public class PrefixSumProblems {
    //given an integer 'a' return the prefix sum/running sum in the same array without creating a new array?
    static void PrintArray(int[]arr){
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

//    static int[] makePrefixSum(int[]arr){  //Using another array pref
//        int n = arr.length;
//        int [] pref = new int[n];
//        pref[0] = arr[0];
//
//        for(int i = 1; i < n; i++){
//            pref[i] = pref[i - 1] + arr[i];
//        }
//        return pref;
//    }
    static int[] makePrefixSum(int[]arr){  //without creating another aaray
        int n = arr.length;

        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter size of array: ");
    int n = sc.nextInt();
    int [] arr = new int[n];

    System.out.println("Enter " + n + " Elements ");
    for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }

    System.out.print("Input Array: ");
    PrintArray(arr);

    System.out.print("After prefix: ");
   int [] pref = makePrefixSum(arr);
    PrintArray(arr);

}
}
//--------------------------------------------------------------------------------
//given an arary of integers of szize n. Answer q queries where you need to pritn the
//sum of values ina given range of indices from 1 to r (both includes)
//note-the values of 1 and r in queries follow 1-based indexing.