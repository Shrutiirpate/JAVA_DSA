package Day08;
import java.util.*;
public class stringaddstringintchar {
    public static void main(String[] args) {
//        String str = "abc";
//        str = str + "xyz";
//        str = str + 'A';
//        str = str + 10;
//        System.out.println(str);
//        System.out.println("ABC"+"XYZ"+10+20); //calculate from left to right ABCXYZ1020
//        System.out.println("ABC"+"XYZ"+(10+20)); //ABCXYZ30
//        System.out.println((10+20)+"ABC"+"XYZ"); //30ABCXYZ

        //subString(i,j) and subString(i)
        String str = "abcd";
        System.out.println(str.substring(0,4)); //abcd
        System.out.println(str.substring(1)); //bcd

        //code
        String ex = "Physics";
        for(int j = 2; j < 4; j++){
            System.out.print(ex.substring(j));
        }
        System.out.println();
        //code2
        String s = "xyza";
        for(int i = 0; i <= 3;i++){
            for(int j = i+1;j <= 4;j++){
                System.out.print(s.substring(i,j) + " ");
            }
        }
        System.out.println();

        //Immutability String
        String immu = "Hello";
//        String jmmu = "Hello";
//        jmmu = "Mello"; //  we use this if we want to change total string
//        System.out.println(jmmu);

        immu = immu.substring(0,2) + "y" + immu.substring(3); //we use this if  we want to change charecter
        System.out.print(immu);
        System.out.println();

        //.equals() and ==
        String shruti = "ShrutiIrpate";
        String pragati = "ShrutiIrpate";
        String sami = new String("ShrutiIrpate");

        System.out.println(shruti == pragati); //True == check address
        System.out.println(shruti == sami); // False
        System.out.println(shruti.equals(sami)); //True ,equals check content(String)





    }
}
