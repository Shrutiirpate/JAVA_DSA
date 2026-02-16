package Day02;

import java.sql.SQLOutput;
//-------Arithmetic operator------------
public class operators {
    public static void main(String[] args) {
        int s = 10;
        int h = 5;

        System.out.println(s + h); //15
        System.out.println(s - h); //5
        System.out.println(s * h); //50
        System.out.println(s / h); //2
        System.out.println(s % h); //0

 //--------Relational operator------
         int p = 10;
         int q = 15;

        System.out.println(p == q); //False
        System.out.println(p != q); //True
        System.out.println(p > q); // False
        System.out.println(p >= q); // False
        System.out.println(p < q); // True
        System.out.println(p <= q); //True

         //-------Logicaloperator-------------
        int p1 = 15;
        int q1= 10;
        int r = 5;

        //&& operator
        System.out.println((p1 > q1) && (p1 > r));// true
        System.out.println((p1 > q1) && (p1 < q1));// false

        // || operator
        System.out.println((r < q1) || (p1 < q1));// true
        System.out.println((p1 > q1) || (q1 > r));// true
        System.out.println((p1 < q1) || (q1 < r));//false

        // ! operator
        System.out.println(!(p1 == q1));//true
        System.out.println(!(p1 > q1)); //false

        //-------Assignment operator--------
        int  sh = 10;
        int  pa;

        // = assignment op.
        pa = sh; //pa =10
        System.out.println(pa);//10

        // +=
         pa += sh;//pa = pa + sh; (pa = 10 + 10=20)
        System.out.println(pa);//20

        // -=
        pa -= sh; //pa = pa - sh (pa = 20 - 10= 10)
        System.out.println(pa);//10

        // *=
        pa *= sh; // pa = pa * sh; ( pa = 10 * 10 = 100)
        System.out.println(pa);//100

        // /=
        pa /= sh; //pa = pa / sh (pa = 100 / 10 = 10)
        System.out.println(pa);//10

        // Unary operator
        int D = 5;
        int A = 5;

        System.out.println(D++);//5 it is post increment that's why first assign and then increment
        System.out.println(D);//6 and here the increment is done

        System.out.println(++A);//6 it is pre increment 1st increment and then assign
        System.out.println(A);//6

        int X = D++;
        int Y = ++A;

        System.out.println(X);//6 post increment by 1 fist assign
        System.out.println(Y);//7

        System.out.println(D);//7 post increment , increment done here
        System.out.println(A);//7

        //Bitwise Operator
        int a = 9; //1001
        int b = 10; //1010

        System.out.println("bitwise OR " + (a | b));//1001 1010 = 1011 = 11
        System.out.println("bitwise AND & " + ( a & b));//1001 1010 = 1000 = 8
        System.out.println("bitwise  exclusive OR ^ " + ( a ^ b));//1001 1010 = 0011 = 3( if same bit  = 0, different bit =1) 1 1 = 0, 0 0=0, 1 0 = 1.
        System.out.println("bitwise complement ~ " + (~ b));//0101 (it converts 1 into 0 or 0 into 1)

        System.out.println("Leftshift " +( a << 1));// 1001 after 1 left shift it will be 10010 = 18
        System.out.println("Leftshift " + (a << 2));// 1001 after 2 left shift it will be 100100 = 36

        System.out.println("Rightshift " + (b >> 1));//101 = 5
        System.out.println("Rightshift " + (b >> 2));//10 = 2


    }
}
