import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = in.nextLine();
        int sum = lengthOfLastWord(str.trim());
        System.out.println(sum);
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0 ; --i){
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }
        return length;
    }
}
