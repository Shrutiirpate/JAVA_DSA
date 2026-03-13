package Day07;

import java.util.Scanner;

public class ArrayProblems {
    //Find the total number of pairs in the array whose sum is equal to the given value x
    static int pairSum(int[] arr, int target) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) { //here we print 1st number
            for (int j = i + 1; j < arr.length; j++) {//second
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
            return ans;
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of a Array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter " + size + " Elements");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter target sum: ");
            int target = sc.nextInt();

            System.out.println("total pair sum are: " + (pairSum(arr, target)));
        }

    }
