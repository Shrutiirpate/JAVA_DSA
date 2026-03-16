package Day07;

import java.util.Scanner;

//public class ArrayProblems {
//    //Find the total number of pairs in the array whose sum is equal to the given value x
//    static int pairSum(int[] arr, int target) {
//        int ans = 0;
//
//        for (int i = 0; i < arr.length; i++) { //here we print 1st number
//            for (int j = i + 1; j < arr.length; j++) {//second
//                if (arr[i] + arr[j] == target) {
//                    ans++;
//                }
//            }
//        }
//            return ans;
//        }
//        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter size of a Array: ");
//            int size = sc.nextInt();
//            int[] arr = new int[size];
//
//            System.out.println("Enter " + size + " Elements");
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = sc.nextInt();
//            }
//
//            System.out.println("Enter target sum: ");
//            int target = sc.nextInt();
//
//            System.out.println("total pair sum are: " + (pairSum(arr, target)));
//        }
//
//    }
//--------------------------------------------------------------------------------------------------------------------
//Q2-count the number of triplets whose sum is equal to the given value x
//public class ArrayProblems {
//    //Find the total number of pairs in the array whose sum is equal to the given value x
//    static int pairSum(int[] arr, int target) {
//        int ans = 0;
//
//        for (int i = 0; i < arr.length; i++) { //here we print 1st number
//            for (int j = i + 1; j < arr.length; j++) {//second
//                for (int r = j + 1; r < arr.length; r++) {
//                    if (arr[i] + arr[j] + arr[r] == target) {
//                        ans++;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//    public static void main (String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of a Array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter target sum: ");
//        int target = sc.nextInt();
//
//        System.out.println("total pair sum are: " + (pairSum(arr, target)));
//    }
//
//}
//---------------------------------------------------------------------------------------------------------------------
//Q3:-Find the unique number in a given array where all the elements are being repeated twice with one value being uniquw
//public class ArrayProblems {
//    //Find the total number of pairs in the array whose sum is equal to the given value x
//    static int FindUniquenum(int[] arr) {
//        int n = arr.length;
//
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j<n; j++){
//                if(arr[i] == arr[j]){
//                    arr[i] = -1;
//                    arr[j] = -1;
//                }
//            }
//        }
//        int ans = -1;
//        for(int i = 0; i < n; i++){
//            if(arr[i]>0){
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }
//
//    public static void main (String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of a Array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Uniques number is : " + FindUniquenum(arr));
//    }
//
//}
//--------------------------------------------------------------------------------------------------------------------
// Q4:- Find the second largest element in the given array
//public class ArrayProblems {
//    static int FindMax(int[] arr) {
//        int MAX = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > MAX) {
//                MAX = arr[i];
//            }
//        }
//        return MAX;
//    }
//    static int FindSecondMax(int[] arr) {
//        int MAX = FindMax(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == MAX) {
//                arr[i] = Integer.MIN_VALUE;
//            }
//        }
//        int seccondMax = FindMax(arr);
//
//        return seccondMax;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of a Array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Second MAX value is : " + FindSecondMax(arr));
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//Q5:- given an array 'a' consisting of an integer return the first value that is repeating in this array. if the no value being repeated,return-1
//public class ArrayProblems {
//    static int firstsearchingnum(int[] arr) {
//        int n = arr.length;
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if(arr[i] == arr[j]){
//                    return(arr[i]);//After return method end here when we founf our answer we don't want we go for next iteration
//                }
//            }
//        }
//        return -1; //if there is no reapeting no. it print -1
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of a Array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("First Repeating value is: " + firstsearchingnum(arr));
//    }
//}
//------------------------------------------------------------------------------------------------------------------------------
//Q5:- given an array 'a' consisting of an integer return the Last value that is repeating in this array. if the no value being repeated,return-1(Assignment Question)
//public class ArrayProblems {
//    static int Lastsearchingnum(int[] arr) {
//        int n = arr.length;
//        int Last = -1;
//
//        for(int i = 0; i < n; i++){
//            for(int j = i+1; j < n; j++){
//                if(arr[i] == arr[j]){
//                    Last = arr[i];
//                }
//            }
//        }
//        return Last;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of a Array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//
//        System.out.println("Enter " + size + " Elements");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Last Repeating value is: " +Lastsearchingnum(arr));
//    }
//}
//------------------------------------------------------------------------------------------------------------------
//Q4:- Find the second Smallest element in the given array
public class ArrayProblems {
    static int FindMIN(int[] arr) {
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < MIN) {
                MIN = arr[i];
            }
        }
        return MIN;
    }
    static int FindSecondMIN(int[] arr) {
        int MIN = FindMIN(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == MIN) {
                arr[i] = Integer.MAX_VALUE; //while using this line of code array becomes[ 2147483647 2 3 4 5]
            }
        }
        int seccondMIN = FindMIN(arr);

        return seccondMIN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of a Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second MIN value is : " + FindSecondMIN(arr));
    }
}
