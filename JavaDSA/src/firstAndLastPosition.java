import java.util.Arrays;
public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] nums={5,7,7,7,7,8,8,9,10};
        int target=7;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

       return ans;
    }
    static int search(int[] nums, int target, boolean FindStartIndex){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(start<=end){

            int mid= start + (end-start)/2;

            if (nums[mid] > target) {
                end= mid-1;
            }
            else if(nums[mid] < target){
                start= mid+1;
            }
            else{
                if(FindStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }
        }
        return ans;
    }
}


