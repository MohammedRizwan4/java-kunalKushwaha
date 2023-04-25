import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number :- ");
        int num = in.nextInt();
        factorOfNumber(num);
    }

    static void factorOfNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num ; ++i) {
            for (int j = 1; j <= num; ++j) {
                if(i*j == num) {
                    sum=sum+i;
                    break;
                }
            }
        }
        if(num == sum){
            System.out.println(num + " is a Perfect number");
        }
        else{
            System.out.println(num + " is not a Perfect number");
        }
    }
}
