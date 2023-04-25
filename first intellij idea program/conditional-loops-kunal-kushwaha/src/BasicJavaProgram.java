import java.util.Scanner;

public class BasicJavaProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter radius of circle :- ");
//        int radius = in.nextInt();
//        double aoc = areaOfCircle(radius);
//        System.out.println("Area of circle is " + aoc);

//        System.out.println("Enter base of traingle :- ");
//        int base = in.nextInt();
//        System.out.println("Enter Height of traingle :- ");
//        int height = in.nextInt();
//        double aot = areaOfTriangle(base,height);
//        System.out.println("Area of circle is " + aot);

//        System.out.println("Enter length od rectangle :- ");
//        int length = in.nextInt();
//        System.out.println("Enter height of rectangle :- ");
//        int height = in.nextInt();
//        double aor = areaOfRectangle(length,height);
//        System.out.println("Area of circle is " + aor);


        System.out.println("Enter diagonal 1  :- ");
        int diagonal1 = in.nextInt();
        System.out.println("Enter hdiagonal 2 :- ");
        int diagonal2 = in.nextInt();
        double aorh = areaOfRhombus(diagonal1,diagonal2);
        System.out.println("Area of circle is " + aorh);

    }

    static double areaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }
    static double areaOfTriangle(int base , int height) { // area of isosceles triangle
        return .5 * base * height;
    }

    static double areaOfRectangle(int length , int breath) {  // same as area of parellelogram
        return length * breath;
    }

    static double areaOfRhombus(int diagonal1 , int diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

}
