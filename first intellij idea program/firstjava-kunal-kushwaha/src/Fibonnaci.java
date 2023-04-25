import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Limit ");
        int n = in.nextInt();
        int[] arr = new int[n + 2];
        int first = 0;
        int last = 1;
        int i = 2;
        arr[0] = first;
        arr[1] = last;
        while(i<=n){
            if(first + last >= n){
                break;
            }
            arr[i] = first + last;
            first = last;
            last = arr[i];
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
