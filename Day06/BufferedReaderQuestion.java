//package Day06;

//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class BufferedReaderQuestion {
//    public static void main(String[] args)throws IOException {
//        BufferedReaderQuestion br = new BufferedReaderQuestion(new InputStreamReader(System.in));
//
//        System.out.println("Enter society number: ");
//        String socName = br.readLine();
//
//        System.out.println("Enter wing Name: ");
//        char wingName = br.readLine().charAt(0);
//
//        System.out.println("Enter flat num: ");
//        int flatNum = Integer.parseInt(br.readLine());
//
//        System.out.println("Enter flat Rent: ");
//        Float rent = float.parseFloat(br.readLine());
//
//        System.out.println("Name of society: " + socName);
//        System.out.println("Name of wing: " + wingName);
//        System.out.println("Name of flat: "+ flatNum);
//        System.out.println("Flat rent: " + rent);
//    }
//
//}
package Day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderQuestion {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter society number: ");
        String socName = br.readLine();

        System.out.println("Enter wing Name: ");
        char wingName = br.readLine().charAt(0);

        System.out.println("Enter flat num: ");
        int flatNum = Integer.parseInt(br.readLine());

        System.out.println("Enter flat Rent: ");
        float rent = Float.parseFloat(br.readLine());

        System.out.println("Name of society: " + socName);
        System.out.println("Name of wing: " + wingName);
        System.out.println("Name of flat: " + flatNum);
        System.out.println("Flat rent: " + rent);
    }
}
