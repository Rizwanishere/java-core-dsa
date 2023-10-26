public class reverse {
    public static void main(String[] args) {
        int num=23232334;
        int ans=0;

        while(num>0){
            int rem=num%10;
            num=num/10;
            ans=ans*10+rem;  // ans is just a ref variable for rem. ans stores rem & multiplies it by 10

        }
        System.out.println(ans);
    }
}
