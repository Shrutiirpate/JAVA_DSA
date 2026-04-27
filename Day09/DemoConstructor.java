package Day09;

//class DemoConstructor {
//    int x = 10; //Instance Variable
//    static int y = 20; //Static Variable
//
//    static{
//        System.out.println("In static block"); //Static block
//    }
//    {
//        System.out.println("In instnace block"); //Instance Block // for instnace you have to create Object without object instnace not Run
//    }
//
//    DemoConstructor(){
//        System.out.println("In Constructor"); //instance
//    }
//    void fun(){
//        System.out.println("Instance method"); //instance method
//    }
//   static  void Run(){
//        System.out.println("Static method"); //static method
//    }
//
//    public static void main(String[] args) {
//       // System.out.println(x);
//        System.out.println(y);
//        System.out.println("in main");
//        Run();
//    }
    //output-In static block
    //in main
    //Static method
//}
//-------------------------------------------------------------------------------------------------------------------------
//Creating onject
//class DemoConstructor {
//    int x = 10; //Instance Variable
//    static int y = 20; //Static Variable
//
//    static {
//        System.out.println("In static block"); //Static block
//    }
//
//    {
//        System.out.println("In instnace block"); //Instance Block // for instnace you have to create Object without object instnace not Run
//    }
//
//    DemoConstructor() {
//        System.out.println("In Constructor"); //instance
//    }
//
//    void fun() {
//        System.out.println("Instance method"); //instance method
//    }
//
//    static void Run() {
//        System.out.println("Static method"); //static method
//    }
//
//    public static void main(String[] args) {
//        System.out.println("in main");
//        Run();
//        DemoConstructor obj = new DemoConstructor();
//        System.out.println(obj.x);
//        System.out.println(y);
//        obj.fun();
//    }
//    //output-In static block
//    //in main
//    //Static method
//    //In instnace block
//    //In Constructor
//    //10
//    //20
//    //Instance method
//}
//=--------------------------------------------------------------------------------------------------------------------------
//3)))))
//class DemoConstructor{
//    DemoConstructor(){
//        System.out.println("Construtor");
//        System.out.println(this);
//    }
//
//    public static void main(String[] args) {
//        DemoConstructor obj = new DemoConstructor(); //object creat kela ki concstructor la call jato
//        System.out.println(obj);
//    }
//}
//-------------------------------------------------------------------------------------------------------------------------------
//Types of constructor
//there are two ypes if constructor
//1) no-argument constructor 2) Parameterized constructor
import java.util.*;
class DemoConstructor{
    int empID;
    String empName;

    DemoConstructor(int empId, String empName){
        this.empID = empID;
        this.empName = empName;
        System.out.println("Para constructor");
    }

    void empInfo(){
        System.out.println(empID);
        System.out.println(empName);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter empID");
            int empID = sc.nextInt();
            System.out.println("enter empName");
            String empName = sc.next();

            DemoConstructor obj = new DemoConstructor(empID,empName);
            obj.empInfo();
        }
    }
