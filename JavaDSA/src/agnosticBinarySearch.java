public class agnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8,};
        int target = 7;
        int ans = agnosticBS(arr, target);
        System.out.println(ans);
    }

    static int agnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
            }
            else {
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


















