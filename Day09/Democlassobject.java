package Day09;
//tips-1) class and constructor has same name
//2)by default inheritance is present in java
//3)if we don't write anything in a class so by default there is a construtor - compliler aanto
//
//public class Democlassobject {
////    int x = 10;
////    int y = 20;
//
////    there is also another method to write this like
////    static int x = 30;
////    static int y = 20;
//
//    public static void main(String[] args) {
////        Democlassobject d = new Democlassobject(); //we ccan solve error using creating new object why because-non-static variable is strore in each object copy
////        System.out.println(d.x); //10
////        System.out.println(d.y); //20
//
////        System.out.println(x); //error - java: non-static variable x cannot be referenced from a static context
////        System.out.println(y); //error - java: non-static variable x cannot be referenced from a static context
//
////        System.out.println(x); //30
////        System.out.println(y); //20
//
////        object:-
////        int x = 10; //instance variable - memory object cha aat mdhe aste
////        static int 5ay = 20; //static variable - object mdhe nste
//        class Demo{ //by  default construtor
//            int x = 10; //instance variable
//
//            public static void main(String[] args) {
//                Demo obj = new Demo(); //object
//                //instance variable initialize he constructor cha aat hote
//            }
//        }
////
//    }
//}
//---------------------------------------------------------------------------------------------------------------------
//Instance variable and methods
class Demo{
    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        Demo obj = new Demo(); //when we create object thevha ch instance variable la memory miltek
        System.out.println("Core2web");
    }
}