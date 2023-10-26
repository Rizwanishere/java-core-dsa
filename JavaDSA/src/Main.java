import java.util.*;

public class Main {
    public static void main(String[] args) {
//      int salary=25000;
      int salary;
        System.out.print("Enter your salary:");

      Scanner scan = new Scanner(System.in);
      salary=scan.nextInt();

      if(salary>10000)
      {
          salary=salary+2000;

      }

      else
      {
          salary=salary+1000;
      }

        System.out.println("Your new salary is:" +salary);

    }
}