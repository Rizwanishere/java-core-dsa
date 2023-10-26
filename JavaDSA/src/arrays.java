import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        int[] arr = new int[5];                                           //1st way
        Scanner scan = new Scanner(System.in);
////        int n= scan.nextInt();
////        int[] arr={10,20,30,40,50}; // direct assigning values              // 2nd way
////        System.out.println(arr[2]);
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i]= scan.nextInt();
//        }





//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;

//       System.out.println(Arrays.toString(arr)); // method which prints values as string if not used it'll print garbage value


        // STRING ARRAY

//        String[] str = new String[6];
//        for(int i=0;i<str.length;i++)   //by input
//        {
//           str[i]= scan.next();
//        }

//        str[0]="rizwan";
//        str[1]="java";
//        str[2]="python";
//        str[3]="maths";
//        str[4]="devops";
//        str[5]="dsa";
//        System.out.println(Arrays.toString(str));

        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
