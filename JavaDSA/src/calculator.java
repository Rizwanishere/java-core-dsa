import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("ENTER THE OPERATOR: ");
            char op = scan.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("ENTER NUM1: ");
                int num1 = scan.nextInt();
                System.out.println("ENTER NUM2: ");
                int num2 = scan.nextInt();

                if (op == '+') {
                    ans = num1 + num2;

                }
                if (op == '-') {
                    ans = num1 - num2;

                }
                if (op == '*') {
                    ans = num1 * num2;

                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;

                    }
                }
                if (op == '%') {
                    ans = num1 % num2;

                }
                System.out.println(ans);
                break;
            }
            else {
                System.out.println("f off because you entered invalid operator");
                 }
        }
    }
}

