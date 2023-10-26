public class findInMountainArray {
    public static void main(String[] args) {
    }


     int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int FirstTry = agnosticBS(arr, target, 0, peak);
        if (FirstTry != -1) {
            return FirstTry;
        }
        return agnosticBS(arr,target,peak+1, arr.length-1);
    }



    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // or return end doesnt matter
    }


    static int agnosticBS(int[] arr, int target,int start,int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}


