import java.util.Scanner;

public class samadQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter a number: ");
            int a = scan.nextInt();
            sum=sum+a;
            if(a==0){
                System.out.println("loop is terminated");
                break;
            }
        }
        System.out.println(sum);
    }
}



