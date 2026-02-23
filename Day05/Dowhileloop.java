package Day05;

import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
//        int num = 1;
//        do{
//            System.out.println(num);
//            num++;
//        }while(num<=10);
        //----------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        do{
            sum += num;
            num = sc.nextInt();
            if(num == -1)break;

        }while(num <= -1);



//        while(num != -1){
//           sum += num;
//           num = sc.nextInt();
//        }
//        System.out.println(sum);

    }
}
