public class Main {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(55));
    }

    static int subtractProductAndSum(int n) {
        int sum =0;int pro=1;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem;
            pro = pro * rem;
        }
        return pro > sum ? pro - sum : sum - pro;
    }
}