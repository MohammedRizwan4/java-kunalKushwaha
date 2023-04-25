import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any digit ");
        int digit = in.nextInt();
        if(digit <= 0) {
            System.out.println("Please enter positive number");
        } else if(digit % 2 == 0){
            System.out.println(digit + " is even number");
        } else  {
            System.out.println(digit + " is odd number");
        }
    }
}
