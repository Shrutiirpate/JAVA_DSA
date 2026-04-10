package Day08;
import java.util.*;
public class Questons {
    public static void main(String[] args) {
        //given a string, the task is to toggle all the charecters of the string i.e to convert Upper case to Lower case and vice versa
        //Input = physICS
        //Output = PHYSics //ASCII value A=65,a=97,0=48
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        String result = "";
        //toggle
        //SHrutI -> shRUTi
        //shruti -> SHRUTI
        //SHRUTI -> shruti
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if( ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z'){
                ch =(char)(ch - 32);
            }
            result = result + ch;
        }
        System.out.println( "output: " + result);
    }
}

//Given a string s, return the number of palindromic substring in it
//input s = "abc"
//output = 3

