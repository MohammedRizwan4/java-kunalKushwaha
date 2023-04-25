import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(input.nextFloat());
        System.out.println(num);
    }
}
//type should be compatible
// casting incompatible types - narrowing conversion