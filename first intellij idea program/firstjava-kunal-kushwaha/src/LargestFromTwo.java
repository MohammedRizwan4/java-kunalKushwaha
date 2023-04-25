import java.util.Scanner;

public class LargestFromTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = in.nextInt();
        System.out.print("Enter second number ");
        int b = in.nextInt();
        if(a>b){
            System.out.println(a + " is greater than " + b);
        }else if(b>a){
            System.out.println(b + " is greater than " + a);
        } else{
            System.out.println("Both are same " + a + " " + b);
        }
    }
}
