
//                                                  //JAVA BASICS

//                                   lecture 1
//                                              variable and data types 1



// public class javabasics {
//     public static void main(String[] args) {
//         int a;

//         a = 10;//variable declaration

//         //a+20 =30
//         //a*20 =200
//         //a/10 =1
//         System.out.println(a);
//         System.out.println(a+20);
//         System.out.println(a/10);
//         System.out.println(a*20);

//         String name;
//         name = "Himanshu Saini";
//         System.out.println(name);//variable name is same as string name but it will print the value of variable name not the string name
//         System.out.println("name");//string name is same as variable name but it will print the string name not the value of variable name

//         //x=12; allowed
//         //x=apple; not allowed because apple is not in double quotes and it is not a variable name
//         //name=apple; not allowed because apple is not in double quotes and it is not a variable name
//     }
// }





//                                             lecture 2
//                                                       variable and data types 2

// public class javabasics {
//     public static void main(String[] args) {
//          // int data type
//          //string data type

//             int a= 10000000;
//             // 32 bit = -2^31 to 2^31-1

//             long b = 100000000000000L;
//             // 64 bit = -2^63 to 2^63-1
//             // long also takes more memory than int

//             short c = 10000;
//             // 16 bit = -2^15 to 2^15-1
//             // takes less memory than int

//                 byte d = 100;
//                 // 8 bit = -2^7 to 2^7-1
//                 // takes less memory than short

//                 double num2= 32.27483;
//                 boolean bool = false;
//                 char ch = 'A';


//     }
// }


//                                             lecture 3
//                                                       Arrays
// public class javabasics {

//     public static void main(String[] args) {
       
//         int arr[] = new int[5];// the number of slots in the bucket

//         // Aeeay = very big bucket , having multiple slots

//         //slot1, slot2, slot3, slot4, slot5
//         //counting starts from
//         //0, 1, 2, 3, 4,     == index of the array

//         arr[0] = 10;//in slot1 we are putting 10
//         arr[1] = 20;//in slot2 we are putting 20 
//         arr[2] = 30;//in slot3 we are putting 30
//         arr[3] = 40;//in slot4 we are putting 40

//         System.out.println(arr[0]);//it will print the value of slot1 which is 10
//             System.out.println(arr[1]);//it will print the value of slot2 which is 20
//             System.out.println(arr[2]);//it will print the value of slot3 which is 30
//             System.out.println(arr[3]);//it will print the value of slot4 which is 40
//             System.out.println(arr[4]);//it will print the value of slot5 which is 0 because we have not put any value in it and by default it takes 0 for int data type


//             int arr1[] = new int[]{10, 20, 30, 40, 50};// we can also initialize the array like this
//                 System.out.println(arr1[0]);//it will print the value of slot1 which is 10
//                 System.out.println(arr1[1]);//it will print the value of slot2 which is 20

//                 String arr2[] = new String[4];
//                 // integer arrays are initialized with 0 by default but string arrays are initialized with null by default because string is a reference data type
                
//                 arr2[0] = "Himanshu";
//                 arr2[1] = "Saini";
//                 //arr2[2] = "10"; not allowed because arr2 is a string array and we are trying to put an integer value in it
//                 System.out.println(arr2[0]);//it will print the value of slot1 which is "Himanshu"

//     }
// }



//                                             lecture 4
//                                                       if else statementf



