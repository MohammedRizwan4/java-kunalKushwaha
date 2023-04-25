import java.lang.reflect.Array;
import java.util.Arrays;

public class removeDuplicate {

    public static void main(String[] args) {
        int[] arr = {11,11,11,12,12};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
    static int removeDuplicates(int[] nums) {
        int uniqueCount = 1;


        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
            System.out.print(i + "  ");
            System.out.println(Arrays.toString(nums) + " " + uniqueCount);
        }
        System.out.println(Arrays.toString(nums));

        return uniqueCount;
    }
}
