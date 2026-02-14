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

    }
}
