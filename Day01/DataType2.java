package Day01;

import javax.xml.transform.Source;

public class DataType2 {

    public static void main(String[] args) {

        byte age = 22;
        int rollNo = 101;
        long mobile = 8080267174L;
        float percentage = 85.5f;
        double height = 5.4;
        char grade = 'A';

        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mobile: " + mobile);
        System.out.println("Percentage: " + percentage);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);

        //-----------------------------------------------

         // Char
        char ch1;
        ch1 = 68;                             //if we right number they print ASCII values.(for char)

        char ch2;
        ch2 = 'A';                             //if we write 'A' it prints only 'A'(for char)

        System.out.println("ch =" + ch1);     //D
        System.out.println("ch =" + ch1 + 1); //D1

        System.out.println("ch =" + ch2);     //A
        System.out.println("ch =" + ch2 + 2);  //A2

        //--------------------------------------

        //Short
        short sh1 = 19;
        short sh2= 11;

        int sh3 = sh1 + sh2;     // here we perform arithmetic operation like addition so java automatically converts short, byte,char into int.that why here print additon of 19+11=30. it is called type promotion.
        System.out.println(sh3); //30

        //short sh3 = sh1 + sh2; // it shows error because Even if both are short,Java automatically changes them into int while calculating.
        //short sh3 = sh1 + sh2  // here is right side is int and left side is short , so we can not add big value in a small container.
        //short sh3 = (short)(sh1+sh2); //if you want to run this using short you can use Type casting.

        //----------------------------------------

        //short2
        short num1 = 'A'; //in short when we write value in a 'A' is prints ASCII value
        short num2 = '1';
        short num3 = 65; // when we right number it prints only no.

        System.out.println(num1); //65
        System.out.println(num2); //49
        System.out.println(num3); //65

        // here are two difference, in short when we write value in a 'A' is prints ASCII value & in char when we write 'A' it prints only A.
        //same for no. in short when we write no. like 65 it prints only 65 but in char they print ASCII value.

        //--------------------------------------

        char valueFirst = 1;  // Nulll
        char valueFirst1 ='1'; //store single char
       // char valueFirst2 = "1"; // char can store only single char not string

        char valueSecond = 0;
        char valueSecond1 = '0';
       // char valueSecond2 = "0";

        System.out.println(valueFirst); //Null
        System.out.println(valueFirst1);//1

        System.out.println(valueSecond); //Null
        System.out.println(valueSecond1);//0

        //------------------------------------

        int numInt = 10;
        float numFloat = numInt;
        System.out.println(numFloat);//10.0-float can take int value but it returns in point

        //----------------------------------
        int numInte = 'a';
        float numF = numInte;
        System.out.println(numF ); //97.0 print ASCII value 97.0 why because we store int data to the float

        numF  = 20.0005f;
        System.out.println(numF);

    }
}


