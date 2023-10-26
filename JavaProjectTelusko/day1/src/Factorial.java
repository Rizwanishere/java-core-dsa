//import java.util.Scanner;
//
//public class Factorial {
//        public static void main(String args[]){
//            Scanner input= new Scanner(System.in);
//            int i,fact=1;
////            int number=5;
//            System.out.print("Enter a number: ");
//            int number =input.nextInt();
//            for(i=1;i<=number;i++){
//                fact=fact*i;
//            }
//            System.out.println("Factorial of "+number+" is: "+fact);
//        }
//    }



import java.util.Scanner;       //factorial using RECURSION

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num= input.nextInt();
        int num=0;
        int result=0;
        result= fact(num);
        System.out.println(result);
    }
    static int fact(int num){
        if(num==0) return 1;                     // because 0!=1
        return num * fact(num-1);
    }
}

