public class PerfectNumbers {
    public static void main(String[] args) {

    }

    public static boolean isPerfectNumber(int n) {
        int summOfDel = 1;
        for (int i = 2; i < n / i; i++) {
                if (n % i == 0) {
                    summOfDel += i + n/i;
                }
        }
        return summOfDel == n;
    }
}
