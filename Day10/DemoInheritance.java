package Day10;

public class DemoInheritance {
    int wheelcount;
    String vehicalname;

    DemoInheritance(){
        System.out.println("It is run in a first constructor");
    }
    DemoInheritance(int wheelcount){
        this.wheelcount = wheelcount;
        System.out.println("It is run in a first constructor but in second");
    }

    void start(){
        System.out.println("Vehical is starting");
    }
}
