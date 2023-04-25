import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number :- ");
        int num = in.nextInt();
        factorOfNumber(num);
    }

    static void factorOfNumber(int num) {
        for (int i = 1; i <= num ; ++i) {
            for (int j = 1; j <= num; ++j) {
                if(i*j == num) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
