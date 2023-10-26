public class arraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum=0;
        int i=0;
        while(i<arr.length){
            i=i+1;
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
