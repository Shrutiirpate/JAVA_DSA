package Day08;
import java.util.*;
public class Questons {
    // public static void main(String[] args) {
    //given a string, the task is to toggle all the charecters of the string i.e to convert Upper case to Lower case and vice versa
    //Input = physICS
    //Output = PHYSics //ASCII value A=65,a=97,0=48
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String: ");
//        StringBuilder str = new StringBuilder(sc.nextLine());
//        System.out.println(str);
//
//        String result = "";
//        //toggle
//        //SHrutI -> shRUTi
//        //shruti -> SHRUTI
//        //SHRUTI -> shruti
//        for(int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//
//            if( ch >= 'A' && ch <= 'Z'){
//                ch = (char)(ch + 32);
//            }
//            else if(ch >= 'a' && ch <= 'z'){
//                ch =(char)(ch - 32);
//            }
//            result = result + ch;
//        }
//        System.out.println( "output: " + result);
//    }
//}

    //Given a string s, return the number of palindromic substring in it
//input s = "abc"
//output = 3
//        String str = "abaiiiytre";
//        StringBuilder gtr = new StringBuilder(str); //aba
//        gtr.reverse(); //aba
//        String s = gtr.toString(); //aba
//        if(str.equals(s)){ //aba = aba
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//        String str = "abcdcba";
//        int i = 0;
//        int j = str.length() - 1 ;
//
//        boolean flag = true;  //true -> palindrome
//
//        while(i < j){
//            if(str.charAt(i)!=str.charAt(j)){
//                flag = false;
//                break;
//            }
//            i++;
//            j--;
//        }
//        if(flag == true){
//            System.out.println("Palindrome");
//        }
//        else System.out.println("Not Palindrome");
    //--------------------------------------------------------------------------------------------
//     public static boolean ispalindrome(String s) {
//         int i = 0;
//         int j = s.length() - 1;
//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) return false;
//             ;
//
//             i++;
//             j--;
//         }
//         return true;
//     }
//
//public static void main(String[] args) {
//         String str ="abbd";
//         int count = 0;
//
//         for(int i = 0; i < str.length(); i++){
//             for(int j = i+1; j <= str.length(); j++){
//                 if(ispalindrome(str.substring(i,j))==true){
//                     System.out.println(str.substring(i,j));
//                     count++;
//                 }
//             }
//         }
//    System.out.print("The number of palindromic substring are: " + count);
//}
//}
//-------------------------------------------------------------------------------------------
//Q-3) java program to reverse each word in string
//input - i am an educator
//output - i ma na rotacude
//    public static void main(String[] args) {
//        String str = "I am an online educator";
//        String ans = "" ;
//        StringBuilder sb = new StringBuilder("");
//
//        for(int i = 0; i<str.length(); i++){
//            char ch =str.charAt(i);
//            if(ch != ' '){
//                sb.append(ch);
//            }else{
//                sb.reverse();
//                ans = ans + sb;
//                ans = ans +" ";
//                sb = new StringBuilder(" ");
//            }
//        }
//        sb.reverse();
//        ans = ans + sb;
//        System.out.println(ans);
//    }
//}
//--------------------------------------------------------------------------------------------------------------------
//The string should be compressed such that consecutive duplicates of characters are replaced with the character
//and followed by the number of consecutive duplicates.
//input- aaabbbbcddde
//output- a3b4c2d3e1
    public static void main(String[] args) {
        String str = "aaabbbbccdddeeeee";
        String ans = " " + str.charAt(0);
        int count = 1;
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }
            else{
                if(count > 1) ans = ans +count;
                //ans = ans + count;
                count = 1;
                ans = ans + curr;
            }
        }
        if(count>1) ans = ans + count;
       // ans = ans + count;
        System.out.println(ans);

    }
}