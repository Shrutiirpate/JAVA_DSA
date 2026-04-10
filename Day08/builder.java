package Day08;
import java.util.*;
public class builder {
    public static void main(String[] args) {
        //used .append
        StringBuilder str = new StringBuilder("Hello");
        str.append("World"); //use this for attach 2 string
        System.out.println(str); //HelloWorld

        //setCharAt()
        StringBuilder str2 = new StringBuilder("Shruti");
        str2.append("Irpate");
        System.out.println(str2); //ShrutiIrpate

        str2.setCharAt(0, 'D'); //change String using index number and charecter
        System.out.println(str2); //DhrutiIrpate

        //append in stringbuilder here we can append string int char or many more
        str2.append(13); //we can also add integer in our string
        System.out.println(str2); //DhrutiIrpate13

        //.insert(idx,ch)
         str2.insert(6 ,"Anant");
        System.out.println(str2); //Insert Anant in previous String at idex 6(DhrutiAnantIrpate13)

        //.delete(idx,ch)
        str2.delete(0,6);
        System.out.println(str2); //delete using index number output will be(AnantIrpate13)

        //Reverse()
        str2.reverse();
        System.out.println(str2); //31etaprItnanA
        //for orinal output again reverse
        str2.reverse();
        System.out.println(str2); //AnantIrpate13

        //delete(i,j)
        str2.delete(0,5); //Delete using index
        System.out.println(str2); //output Irpate13



    }
}
