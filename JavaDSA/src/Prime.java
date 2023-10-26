//import java.util.Scanner;
//
//public class Prime {
//    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        int num=scan.nextInt();
//        int c=2;
//
//
//        while(c < num)
//        {
//            if(num%c==0)
//            {
//                System.out.println("not a prime number");
//                break;
//            }
//            else
//            {
//                c=c+1;
//                System.out.println("prime number");
//                break;
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Prime {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int c = 2;
//
//
//        if (n <= 1) {
//            System.out.println("prime number");
//        }
//
//
//        while (c * c <= n)
//        {
//            if (n % c == 0)
//            {
//                System.out.println("not a prime number");
//                break;
//            }
//            else
//            {
//                c = c + 1;
//                System.out.println("Prime number");
//                break;
//            }
//
//        }
//    }
//}




import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();


        boolean isPrime = true;

        for(int i=2;i<num;i++){

            if(num%i==0){
              isPrime = false;
              break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }

    }
}



























