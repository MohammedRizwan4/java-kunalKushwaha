import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount ");
        int p = in.nextInt();
        System.out.print("Enter Rate of Interest ");
        int r = in.nextInt();
        System.out.print("Enter Total Years ");
        int n = in.nextInt();
        int si = (p*r*n)/100;
        System.out.println("Simple Interest Is :- " + si);
    }
}
