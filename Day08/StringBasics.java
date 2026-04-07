package Day08;
import java.util.*;

public class StringBasics {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String: ");
//        String str = sc.nextLine();
        //String str = sc.next(); //Print only single word

//        System.out.println(str);
//        String str = "Shruti Irpate";
//        System.out.println(str);

        //length()
        String str = "Shruti Anant Irpate";
        int length = str.length();
        System.out.println(length);//19

        //chatAt(0) or any number
        String str2 = "Pragati";
//        char ch = str2.charAt(6);
//        System.out.println(ch);//i
        System.out.println((str2.charAt(6))); // we can also write like this without using another line

        //indexOf()
        String str3 = "Shruti Rutu";
        int idx = str3.indexOf('u');
        System.out.println(idx);//3 it give staring index where he find u

        //compareTo()
        String STR = "DELLO";
        String GTR = "HELLO";
        System.out.println(STR.compareTo(GTR));// 4 if STR is greater than GTR it prints positive value
        // if STR and GTR is equal then output will be 0
        // if STR is less than GTR then it print Negative value
        //contains()
        String abc = "Hello shruti";
        System.out.println(abc.contains("ruti")); //true
        System.out.println(abc.startsWith("sh")); // false, it starts with He
        System.out.println(abc.endsWith("ti")); // true

        //toLowercase() & toUppercase() & concat
        String xy = "Pragati Kasar";
        String yz = "Shruti Irpate";
        System.out.println(xy); //Pragati Kasar
        System.out.println(xy.toLowerCase()); //pragati kasar
        System.out.println(xy.toUpperCase()); //PRAGATI KASAR
        System.out.println(xy.concat(yz)); //Pragati Kasar Shruti Irpate

    }
}
