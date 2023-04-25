public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {213,456,8787,5454,23232,7675444,43576543,4354786,4356,4567654};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count = 0;

        for(int num:nums){
            if(even(num)){
                count++;
                System.out.println(num);
            }
        }
        return count;
    }

    static boolean even(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }

        return (count % 2 == 0);
    }
}
