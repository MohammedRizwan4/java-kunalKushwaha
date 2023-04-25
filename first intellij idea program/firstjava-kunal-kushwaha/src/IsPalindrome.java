import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = in.nextLine();
        str = str.replaceAll("[^a-z0-9A-Z]","");
        str = str.toLowerCase();
        boolean ans =  isPalindrome(str,0,str.length()-1);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String str,int firstIndex,int lastIndex) {
        if(firstIndex >= lastIndex){
            return true;
        }

        if(str.charAt(firstIndex) != str.charAt(lastIndex)) return false;
        return isPalindrome(str,firstIndex+1,lastIndex-1);
    }
}
