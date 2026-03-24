package Day08;

public class stringDemo {
    public static void main(String[] args) {
        String name = "ABC";
        String Reverse = "";
        char ch;

        for(int i = 0; i < name.length(); i++){
            ch = name.charAt(i);
            Reverse = ch + Reverse;
        }
        System.out.println("Reverse String will be: " + Reverse);
    }

}
