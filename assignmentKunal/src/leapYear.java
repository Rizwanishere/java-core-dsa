import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year:");
        int i= scan.nextInt();
        while(true){
            if(i%4==0){
                System.out.println("leap year");
                break;
            }
            else{
                System.out.println("not a leap year");
                break;
            }
        }
    }
}