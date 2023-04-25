import java.util.Scanner;

public class TakeNameInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any name ");
        String name = in.nextLine();
        System.out.println("Your name is :- " + name);
    }
}
