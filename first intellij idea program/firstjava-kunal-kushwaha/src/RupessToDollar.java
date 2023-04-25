import java.util.Scanner;

public class RupessToDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Indian Rupees ");
        int a = in.nextInt();
        System.out.println(a + " INR is $ "+ (.012*a));
    }
}
