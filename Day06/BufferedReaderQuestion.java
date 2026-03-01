package Day06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderQuestion {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Society Name: ");
        String socName = br.readLine(); //This reads the input from the user.(br.readLine)....

        System.out.println("Enter wing name: ");
        char wingName = br.readLine().charAt(0);

        System.out.println("Enter flat number: ");
        int flatNumber = Integer.parseInt(br.readLine());//But BufferedReader always reads input as a String.Integer.parseInt().This method converts a String into an int value.

        System.out.println("Enter flat rent: ");
        Float flatRent = Float.parseFloat(br.readLine());

        System.out.println("Society Name: " + socName);
        System.out.println("Society Wing name: " + wingName);
        System.out.println("Society flat number: " + flatNumber);
        System.out.println("Society flat Rent: " + flatRent);
    }
}
