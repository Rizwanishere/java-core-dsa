public class countOccurence {
    public static void main(String[] args) {
        int n=23232334;
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem==3){
                count=count+1;
            }
            n=n/10;
        }
        System.out.println(count);



    }
}
