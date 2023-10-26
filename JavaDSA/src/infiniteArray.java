public class infiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(boxRange(arr,target));
    }
    static int boxRange(int[] arr, int target){
        int start=0;
        int end=1;

        while(target > arr[end]){
            int newStart= end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return Binarysearch(arr,target,start,end);
    }


    static int Binarysearch(int arr[],int target,int start,int end){

        while(start<=end){

            int mid= start + (end-start)/2;

            if (arr[mid] < target) {
                start= mid+1;
            }
            else if(arr[mid] > target){
                end= mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
