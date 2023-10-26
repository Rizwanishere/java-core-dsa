import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
////
//        int max=a;
//        if(b>a){
//            max=b;
//        }
//        if(c>b){
//            max=c;
//        }
//        System.out.println(max);

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

//       System.out.println(Math.max(45,55)); // without scanner
    }
}
