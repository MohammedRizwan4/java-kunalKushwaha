import java.util.Scanner;

public class SumOffAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int positiveTotal = 0;
        int negativeTotal = 0;
        int positiveOddTotal = 0;
        if(num > 0) {
            positiveTotal+=num;
            if(num % 2 != 0){
                positiveOddTotal+=(num*-1);
            }
        }else if(num < 0) {
            negativeTotal+=num;
        }
        while (num!=0) {
            System.out.print("Enter a number : ");
            num = in.nextInt();
            if(num > 0) {
                positiveTotal+=num;
                if(num % 2 != 0){
                    positiveOddTotal+=num;
                }
            }else if(num < 0) {
                negativeTotal+=num;
            }
        }
        System.out.println("Positive Numbers total is : " + positiveTotal);
        System.out.println("Negative Numbers total is : " + (negativeTotal*-1));
        System.out.println("Positive Odd Numbers total is : " + positiveOddTotal);
    }
}
