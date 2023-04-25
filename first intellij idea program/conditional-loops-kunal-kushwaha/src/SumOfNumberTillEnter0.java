import java.util.Scanner;

public class SumOfNumberTillEnter0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number :- ");
        int num = in.nextInt();
        int n = 1;
        int sum = 0;
        while(n == 1) {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
            System.out.println("Answer is " + sum);
            System.out.println("Enter 1 if you wanna start second time ");
            int yes = in.nextInt();
            if(yes != 1) {
                n = 0;
            }
            else {
                System.out.print("Enter any number :- ");
                num = in.nextInt();
            }
        }
    }
}
