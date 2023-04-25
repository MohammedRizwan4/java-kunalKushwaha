public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,76,29,54,32,75,34};
        int target = 32;
        boolean ans = linearSearch3(nums,target);
        System.out.println(ans);
    }

    static boolean linearSearch3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }

        for(int element : arr) {
            if(element == target){
                return true;
            }
        }
        return false;
    }

    static int linearSearch2(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        for(int element : arr) {
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0;index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
