import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,fact=1;
//        int number= input.nextInt();
        int number=5;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of " +number+ " is " + fact);
    }
}
