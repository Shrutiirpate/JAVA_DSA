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
        //4)
        //introduction to string buffer
//        String str1 = "shruti";
//        String str2 = "shruti";
//        String str3 = new String("Shruti");
//        String str4 = new String("shruti"); //they bith creater new object on heep area
//
//        System.out.println(str1 == str2);//true
//        System.out.println(str3 == str4);//false
        //------------------------------------------------------------------------------------------------------
        //5)
//        String str1 = "shashi";
//        String str2 = "bagal";
//
//        System.out.println(str1); //shashi
//        System.out.println(str2); //bagal
//        System.out.println(str2 + "Core2Web"); //bagalCore2Web(direct append method ni change krto karan tostring tevha ch use mdhe yete jevha aaplya te string cha container mdhe store kra lagel
//        System.out.println(str1); //shashi
//        System.out.println(str2); //bagal

//        //when we create string we can can not add another word to it even one charecter so that's why string is immutable
//        String str1 = "Core2web";
//        String str2 = "Shashi";
//        String str3 = "Narhe";
//
//        System.out.println(System.identityHashCode(str1)); // 2065951873
//        System.out.println(System.identityHashCode(str2)); // 1791741888
//        System.out.println(System.identityHashCode(str3));  // 1595428806 (different address)
//
//        str3 = str3 + "IIT";
//
//        System.out.println(System.identityHashCode(str1)); // 2065951873
//        System.out.println(System.identityHashCode(str2)); // 1791741888
//        System.out.println(System.identityHashCode(str3)); // 1915910607
        //-----------------------------------------------------------------------------------------------------------------------
        //6)
        //Strig = immutable(can not change)
        //stringBuffer = mutable(can change)
//        String str1 = "shruti";
//        System.out.println(str1);
//        System.out.println(System.identityHashCode(str1)); //1000 and then this object will taken by garbage collector(proper explain in book)
//
//        str1 = str1 + "Irpate";
//        System.out.println(str1);
//        System.out.println(System.identityHashCode(str1)); //2000
        //---------------------------------------------------------------------------------------------------------------------
        //7)StringBuffer(muttable)
//        StringBuffer str1 = new StringBuffer("Shruti");
//        StringBuffer str2 = new StringBuffer("Irpate");
//
//        System.out.println(str1);
//        System.out.println(System.identityHashCode(str1)); //2065951873
//        System.out.println(str2);
//        System.out.println(System.identityHashCode(str2)); //1791741888
//
//        str1 = str1.append(str2);
//        System.out.println(str1);
//        System.out.println(System.identityHashCode(str1)); //2065951873
//        System.out.println(str2);
//        System.out.println(System.identityHashCode(str2)); //1791741888
        //-------------------------------------------------------------------------------------------------------------
        //stringbuffer has 16 charecter capacity,if capacity full then use formula-current capacity +1 *(2)
//        StringBuffer sb1 = new StringBuffer();
//        System.out.println(sb1); //-
//        System.out.println(sb1.capacity()); //16
//
//        sb1 = sb1.append("core2web");
//
//        System.out.println(sb1);//core2web
//        System.out.println(sb1.capacity()); //16
//
//        sb1 = sb1.append("Incubaters");
//
//        System.out.println(sb1); //core2webIncubaters
//        System.out.println(sb1.capacity()); //34 internally they increased size of a stringbuffer
        //-----------------------------------------------------------------------------------------------------
        String str = "shruti";

        StringBuffer sb = new StringBuffer(str); //shruti

        sb.reverse(); //iturhs

        str = sb.toString(); // iturhs //for converted from stringbuffer to string

        System.out.println(str); //iturhs


    }
}
