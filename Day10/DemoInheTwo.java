package Day10;

public class DemoInheTwo extends DemoInheritance{
    void start(){
        super.start(); //using super we print Demoinheritnce method
        System.out.println("DemoInheTwo run"); // if we create method here then it print this method not DemoInheritance Method(Method overriding or method chaining)\

    }
    DemoInheTwo(){
        start();
        System.out.println("it is run in a second constructor");
    }
    public static void main(String[] args) {
        DemoInheTwo obj  = new DemoInheTwo();
        obj.wheelcount = 4;
        obj.start();

    }
}
