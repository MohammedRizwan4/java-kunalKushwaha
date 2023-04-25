import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Roman number to convert into Integer");
        String roman = in.next();
        int len = roman.length();
        int prev = 0;
        int sum = 0;
        for (int i = len - 1 ; i >= 0; i--){
                int cur = romanTable(roman.charAt(i));
                if(i == len - 1) sum += cur;
                else {
                    if (cur < prev) {
                        sum -= cur;
                    } else {
                        sum += cur;
                    }
                }
                prev = cur;
        }
        System.out.println("The number is " + sum);
    }

    public static int romanTable(char findNum){
        int num = 0;
        switch (findNum) {
            case 'I' -> num = 1;
            case 'V' -> num = 5;
            case 'X' -> num = 10;
            case 'L' -> num = 50;
            case 'C' -> num = 100;
            case 'D' -> num = 500;
            case 'M' -> num = 1000;
        }
        return num;
    }
}
