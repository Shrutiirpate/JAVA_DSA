package Day06;
//Integer cache ia a special memory area in java where some
// integer are already created and stored. java resues these objects insted of creating new one
//it save memory and improve performance.

public class integerCache {
    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); //True, because it is range of -128 to 127

        //--------------------------------------------------------------------------------

        Integer s = 200;
        Integer H = 200;
        System.out.println(s == H ); //flase, it is not in range

        //---------------------------------------------------------------------------------

        Integer ab = new Integer(100);
        Integer bc = new Integer(100);
        System.out.println(ab == bc);
        // it gives false because using new keyword t creat new object in a heap area there is two different address

        //-----------------------------------------------------------------------------------

        //difference between == and .equals()
        Integer abc = 200;
        Integer ABC = 200;

        System.out.println(abc == ABC); //false
        System.out.println(abc.equals(ABC)); //true
        //Because == compare memory area and .equals() compare value only

        //------------------------------------------------------------------------------------
        Integer x = Integer.valueOf(100);
        Integer y = Integer.valueOf(100);

        System.out.println(x == y);  // true
        //What is Integer.valueOf()?
        //valueOf() is a static method of Integer class.
        //It converts a primitive int into an Integer object.

    }
}
