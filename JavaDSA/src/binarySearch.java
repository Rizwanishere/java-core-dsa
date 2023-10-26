public class binarySearch {                  // BINARY SEARCH FOR SORTED ARRAY(ASCENDING ORDER)
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,12,15,20,25,36,49};
        int target=20;
        int ans=Binarysearch(arr,target);
        System.out.println(ans);
//
//        int[] arr={56,49,45,40,35,20,5,3,2};
//        int target=5;
//        int ans=Binarysearch2(arr,target);
//        System.out.println(ans);

    }
    static int Binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;

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

    static int Binarysearch2(int arr[],int target){    // DESCENDING ORDER(just replace start & end)
        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid= start + (end-start)/2;

            if (arr[mid] > target) {
                start= mid+1;
            }
            else if(arr[mid] < target){
                end= mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }



}
