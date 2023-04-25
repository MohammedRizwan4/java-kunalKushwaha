import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First digit ");
        int a = in.nextInt();
        System.out.print("Enter Second digit ");
        int b = in.nextInt();
        System.out.print("Enter operation to perform ");
        String operator = in.next();
        switch (operator) {
            case "+" -> {
                System.out.println("Addition of two number is :- " + (a + b));
            }
            case "-" -> {
                System.out.println("Subtraction of two number is :- " + (a - b));
            }
            case "*" -> {
                System.out.println("Multiplication of two number is :- " + (a * b));
            }
            case "/" -> {
                System.out.println("Division of two number is :- " + (a / b));
            }
            default -> {
                System.out.println("Wrong operator entered");
            }
        }

    }
}
