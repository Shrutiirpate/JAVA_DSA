package Day07;
class ArrayExample {
    //SearchInIndex
    void searchIndex(){
        int [] index = { 1,2,5,7,9};
        int x =5;

        int ans = -1;
        for(int i=0; i<index.length; i++){
            if(index[i]==x){
                ans = i;
            }
        }
        System.out.println("Found " + x + " at the position " + ans);
    }

    //find Max number in a given array
    void maxArray(){
        int [] aar2 = {1, 4 ,3 , 8,1};
        int ans = 0;

        for(int i=0; i < aar2.length; i++){
            if(aar2[i] > ans){
                ans = aar2[i];

            }
        }
        System.out.println("Max: " + ans);
    }
    //Print sum of Array
    void sumofArray(){
        int [] arr = {1 ,4 ,5 ,6 ,1};
        int sum = 0;

        for(int i=0; i< arr.length; i++){
            //System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
    //Multi array or 2D Array
    void multiArray(){
        int[][] number = {{55,61, 8},{22,34,9},{54,88,5} };//2D Array

        for(int i=0; i<number.length; i++){
            for(int j=0; j<number[i].length; j++){
                System.out.println(number[i][j]);
            }
        }

//        System.out.println(number[0][0]);//55
//        System.out.println(number[0][1]);//61
//        System.out.println(number[0][2]);//8
//
//        System.out.println(number[1][0]);//22
//        System.out.println(number[1][1]);//34
//        System.out.println(number[1][2]);//9
//
//        System.out.println(number[2][0]);//54
//        System.out.println(number[2][1]);//88
//        System.out.println(number[2][2]);//5
    }

    //Array
    void demoArray() {
        int[] ages = new int[3];
        float[] weight = new float[3];
       // String[] name = new String[3];
        String [] name = {"Shrutikaa", "Samiksha", "Pragati"}; //Using Array litral

        ages[0] = 5;
        ages[1] = 15;
        ages[2] = 20;
        //ages[5] = 30; // it shows ArrayIndexOutOfBoundsException

        weight[0] = 15.6f;
        weight[1] = 20.7f;
        weight[2] = 35.6f;

//        name[0] = "Shruti";
//        name[1] = "Samuu";
//        name[2] = "pagiii";

//        System.out.println("Ages: " + ages[0]);
//        System.out.println("Weight:" + weight[0]);
//        System.out.println("name: " + name[0]);
//        System.out.println(" ");
//
//        System.out.println("Ages: " + ages[1]);
//        System.out.println("Weight:" + weight[1]);
//        System.out.println("name: " + name[1]);
//        System.out.println(" ");
//
//        System.out.println("Ages: " + ages[2]);
//        System.out.println("Weight:" + weight[2]);
//        System.out.println("name: " + name[2]);
//        System.out.println(" ");

        //Array Print using For Loop
        for(int i = 0; i<ages.length; i++){
            System.out.println(ages[i]);
        }

        //Array print Using For Each Loop
        for(int age : ages){
            System.out.println(age);
        }

        //Array Print Using While Loop
        int i = 0;
        while(i<ages.length){
            System.out.println(ages[i]);
           // i = i + 1;
            i++;
        }
        System.out.println("Length of array ages: " + ages.length);//3
        System.out.println("Length of array name: " + name.length);//3
        System.out.println("Length of array weight: " + weight.length);//3
    }
    }

public class Array {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        //obj.demoArray();
       // obj.multiArray();
        //bj.sumofArray();
        //obj.maxArray();
        obj.searchIndex();
    }

}

