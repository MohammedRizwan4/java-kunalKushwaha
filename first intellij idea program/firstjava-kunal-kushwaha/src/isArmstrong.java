import java.util.Scanner;

public class isArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            if(isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
