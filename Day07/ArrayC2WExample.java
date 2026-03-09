package Day07;
 class ArrayC2WExample {
         //3rd Question
         void ArrayDemo() {
                 int arr[] = new int[5];
                 System.out.println(arr[0]);//0
                 System.out.println(arr[1]);//0
                 System.out.println(arr[2]);//0
                 System.out.println(arr[3]);//0
                 System.out.println(arr[4]);//0
         }
 }

//       void ArrayDemoCheck(){
//                 int arr1[] = {10,20,30};
//                 System.out.println(arr1[0]);//10
//                 System.out.println(arr1[1]);//20
//                 System.out.println(arr1[2]);//30
//
//                 arr1[0] = 50; //here we chnage the value of 0th index
//                 System.out.println(arr1[0]);//50
//                 System.out.println(arr1[1]);//20
//                 System.out.println(arr1[2]);//30
//         }

 //2nd Question
//         void ArrayDemo(){
//                 int arr1[] = { 10, 20, 30}; //this value stores in a integercache
//                 int arr2[] = new int[]{10,20,30}; //this will store in a heap area . that's why it prints two different address of same data
//
//                 System.out.println(System.identityHashCode(arr1)); //1791741888 this is address of data
//                 System.out.println(System.identityHashCode(arr2));//1595428806
//         }

 //--------------------------------------------------------------------------------------------------

 //1st question
//void checknumner(){
//        int arr[] = {10, 20, 30, 40, 50};
//        float farr[] = {10.2f, 20.35f, 55.5f, 45.25f,44.6f,};
//        char carr[] = { 'A','B','C','D','E','F'};
//        String sarr[] = {"Shrti","Pragati"};
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//
//        System.out.println(farr[0]);
//        System.out.println(farr[1]);
//        System.out.println(farr[2]);
//        System.out.println(farr[3]);
//        System.out.println(farr[4]);
//
//        System.out.println(carr[0]);
//        System.out.println(carr[1]);
//        System.out.println(carr[2]);
//        System.out.println(carr[3]);
//        System.out.println(carr[4]);
//
//        System.out.println(sarr[0]);
//        System.out.println(sarr[1]);
//    }
 class Number{
    public static void main(String[] args){
        ArrayC2WExample obj = new ArrayC2WExample();
        //obj.checknumner();
           obj.ArrayDemo();
            //obj.ArrayDemoCheck();

    }
}

