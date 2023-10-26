import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch= scan.next().trim().charAt(0);

        if(ch>='a' && ch<='z') {
            System.out.println("Lowercase");
        }
        else{
                System.out.println("UpperCase");
            }
        }
    }
