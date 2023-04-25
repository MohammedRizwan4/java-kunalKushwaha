import java.util.Scanner;

public class LargestFromAllTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int max = 0;
        while (num!=0) {
            System.out.print("Enter a number : ");
            num = in.nextInt();
            if(num > max) {
                max = num;
            }
//            System.out.println("Enter 0 to stop loop");
        }
        System.out.println("Max number is : " + max);
    }
}
