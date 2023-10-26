//public class Fibonacci {                        //0 1 1 2 3 5 8 13 21 34 55 // this program prints sequence of fibonacci nos
//    public static void main(String[] args) {    //a b c  // now c=a+b && new 'a' is b and new 'b' is c
//        int num=0;
//        int result= fib(num);
//        System.out.println(result);
//    }
//    static int fib(int num){
//        int a=0;
//        int b=1;
//        int c=0;
//        int count=20;                   // tells "after when the sequence stops"
//        for(int i=2;i<= count; i++){
//            c=a+b;
//            System.out.print(" "+c);
//            a=b;
//            b=c;
//        }
//        return c;
//    }
//}


//import java.util.Scanner;
//
//public class Fibonacci {                        // this program prints the sequence element by taking index(position) as inout
//    public static void main(String[] args) {
////        int num=5;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Index(position): ");
//        int num= input.nextInt();
//        int result= fib(num);
//        System.out.println(result);
//    }
//    static int fib(int num){
//        int a=0;
//        int b=1;
//        int c=0;
//        for(int i=2;i<=num; i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return c;
//    }
//}


import java.util.Scanner;

//public class Fibonacci {                        //fibonacci using recursion //num is the position of element in sequence of fibonacci series
//    public static void main(String[] args) {
//        int num=9;
////        Scanner input = new Scanner(System.in);
////        System.out.print("Enter the Index(position): ");
////        int num= input.nextInt();
//        int result= fib(num);
//        System.out.println(result);
//    }
//    static int fib(int num){
//        if(num==0) return 0;
//        if(num==1||num==2) return 1;
//        return fib(num-1)+fib(num-2);
//    }
//}

import java.util.HashMap;
import java.util.Map;
public class Fibonacci {                        //memoization: memorizing code to improve its runtime::generally comprises of maps,Hashmaps in recursive problems
                                                //map: its like dictionary of python(key value pair)
    private static Map<Integer,Integer> cache= new HashMap<>();
    public static void main(String[] args) {
        int num=9;
        int result= fib(num);
        System.out.println(result);
    }
    static int fib(int num){
        if(num==0) return 0;

        if(num==1||num==2) return 1;

        if(cache.containsKey(num)) return cache.get(num);

        return fib(num-1)+fib(num-2);
    }
}

