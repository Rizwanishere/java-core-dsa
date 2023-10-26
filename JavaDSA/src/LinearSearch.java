public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
//        int ans = linearSearch(arr, target);
        boolean ans = linearSearch2(arr,target);
        System.out.println(ans);


    }

    static int linearSearch(int[] arr, int target) {    // 1st way
        if (arr.length == 0) {
            return -1;
        }


        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }

    static boolean linearSearch2(int[] arr, int target) {            //2nd way
        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}




    



