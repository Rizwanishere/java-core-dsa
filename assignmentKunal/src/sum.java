import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a= scan.nextInt();
        System.out.print("Enter the value of b: ");
        int b= scan.nextInt();

        int sum=a+b;
        System.out.println("The sum of a & b is : " + sum);


    }
}
