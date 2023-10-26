import java.util.*;
public class stringTokenizer {
 public static void main(String[] args) {
     int sum = 0;
     Scanner scan = new Scanner(System.in);
     String s = scan.next();
     StringTokenizer st = new StringTokenizer(s,",");
     while (st.hasMoreTokens()) {
         String s2 = st.nextToken();
         System.out.println(s2);
         int x = Integer.parseInt(s2);
         sum = sum + x;
     }
     System.out.println(sum);
 }
}

