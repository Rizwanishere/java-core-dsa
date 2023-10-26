
import java.util.Scanner;

public class lcmHcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateHCF(num1, num2);
    }
}

