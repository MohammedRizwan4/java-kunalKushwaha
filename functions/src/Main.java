// A optimized school method based Java
// program to check if a number is prime
import java.io.*;

public class Main {

    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
        if (isPrime(43))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(29))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}
