package Day08;

public class core2webQuestions {
    public static void main(String[] args) {
        //1) compair == and .equal to
//        String str1 = "shruti"; // hi string heap vr SCP mdhe store hote(it checks Reference number)
//        String str2 = new String("shruti"); //hi string Heap vr navin gola createkrte(it checks containt )
//        System.out.println(str1 == str2); //false
//        System.out.println(str1.equals(str2)); //true
        //--------------------------------------------------------------------------------------------------

        //2)
//        String str1 = "shruti";
//        String str2 = new String("shruti");
//        String str3 = "pragati";
//        String str4 = new String("pragati");
//        String str5 = "shruti pragati";
//        String str6 = new String("shruti pragati");
//
//        System.out.println(str1); // shruti (scp)
//        System.out.println(str2); //shruti(Heap area)
//        System.out.println(str3); //pragati(scp)
//        System.out.println(str4); //pragati (Heap area)
//        System.out.println(str5); //shruti pragati(scp)
//        System.out.println(str6); //shruti pragati (Heap area)
        //------------------------------------------------------------------------------------------------------------------

        //3)
//        String str1 = "shruti";
//        String str2 = "sami";
//        String str3 = "shrutisami";
//        String str4 = str1 + str2; // + ha StringBuilder la call krto mhnje ch StringBuilder cha append method la (book)
//        String str5 = str1.concat(str2);
//        String str6 = str3;
//
//        System.out.println(str1); //shruti
//        System.out.println(str2); //sami
//        System.out.println(str3); //shrutisami (they have same output but there address are different )
//        System.out.println(str4); //shrutisami
//        System.out.println(str5); //shrutisami
//        System.out.println(str4 == str5); //false
//        System.out.println(str4.equals(str5)); //true
//        System.out.println(str6); //shrutisami
//        System.out.println(str3 == str6); //true
        //--------------------------------------------------------------------------------------------------------------

        //interned string
//        String str1 = "shruti";
//        String str2 = "sakshi";
//        String str3 = "shrutisakshi";
//
//        String str4 = str1.concat(str2); //shrutisakshi
//        System.out.println(str3 == str4); //false
//        System.out.println(str3.equals(str4)); //true
//
//        //str4.intern();
//        str4 = str4.intern();//It checks if the same string already exists in the String Constant Pool If yes → returns the reference of that pooled string If no → adds it to the pool
//        System.out.println(str3 == str4);//true
//        System.out.println(str3.equals(str4));//true
        //------------------------------------------------------------------------------------------------------------------------------------------------









    }
}
