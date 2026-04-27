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
//class Demo{
//    int x = 10;
//    int y = 20;
//
//    public static void main(String[] args) {
//        Demo obj = new Demo(); //when we create object thevha ch instance variable la memory miltek
//        System.out.println("Core2web");
//    }
//}
//--------------------------------------------------------------------------------------------------------------------------
//class Demo{
//    //instance variable (instance variable always out side the main method
//    int x = 10;
//
//    //instance method
//    void fun(){
//        System.out.println("In fun");
//    }
//
//    //entry point method
//    public static void main(String[] args) {
//        Demo obj = new Demo(); //whenever we created new object memory allocated to the instance variable
//        System.out.println(obj.x); // and when we print obj.x it prints x=10
//        obj.fun();  //it prints instance method
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//class Demo{
//    int x = 10;
//    int y = 20;
//    static int s = 30;
//
//    void fun(){
//        System.out.println(x); //internaly it work as this.x 10
//        System.out.println(y); //this.y 20
//        System.out.println(s);
//    }
//
//    public static void main(String[] args) {
//      Demo obj1 = new Demo();
//      Demo obj2 = new Demo();
//
//      obj1.x = 100;
//      obj1.y = 200;
//      obj1.s = 300;
//        System.out.println("OBJ change value");
//        System.out.println(obj1.x); //100
//        System.out.println(obj1.y); //200
//        System.out.println(obj1.s); //300
//
//        System.out.println("Instance actual value and static change value");
//        System.out.println(obj2.x); //10 instance variable has a seperate copy
//        System.out.println(obj2.y); //20
//        System.out.println(obj2.s); //300 once we chnage it changes from all
//
//        System.out.println("Instance Method called foor 2 different object");
//        obj1.fun(); //100 200 300
//        obj2.fun(); //10 20 300
//    }
//}
//---------------------------------------------------------------------------------------------------------------------------
//Static block 1))))
//class Demo{
//    static{
//        System.out.println("In static block");//JVM loads the class Demo While loading static block runs -Then JVM calls main()
//        //Static block is used for initialization at class loading time
//    }
//
//    public static void main(String[] args) {
//        System.out.println("In mail method");
//    }
//}
//2)))
//class Demo{
//    static{
//        System.out.println("In static block1");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("In main method");
//    }
//
//    static{
//        System.out.println("In static block2");
//    }
//}
//3)))
//class Demo{
//    static int x = 10;
//    static{
//        System.out.println("In static block");
//    }
//    static void fun(){
//        System.out.println("in static mehtod : Run");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(x);
//        fun();
//
//        //output- In static block , 10 in static method : Run
//        //because- only static block and static variable initialization run fist- static method not run first when we cann fun in main then it run
//    }
//}
//-------------------------------------------------------------------------------------
//lecture 20-core2web 1))
//class Demo{
//    int x = 10;
//    int y = 20;
//
//    void fun(){
//        System.out.println("In Fun");
//    }
//    void Run(){
//        System.out.println("In Run");
//    }
//    public static void main(String[] args) {
//        Demo obj = new Demo();
//        System.out.println(obj.x);//10
//        System.out.println(obj.y);//20
//        obj.fun();//In fun
//        obj.Run();//In Run
//    }
//}
//-----------------------------------------------------------------------------
//2))
class Demo{
    int x = 10;
    static int y = 20;

    void fun(){
        System.out.println("In Fun");
    }
    static void Run(){
        System.out.println("In Run");
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.x);//10
        System.out.println(y);//20
        obj.fun();//In fun
        Run();//In Run
    }
}
