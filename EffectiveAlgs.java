public class EffectiveAlgs {
    public static void main(String[] args) {

    }

    public static int findMaxDigit(int n) {
        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (maxDigit < digit) {
                maxDigit = digit;
            }
            if (maxDigit == 9) {
                break;
            }
        }
        return maxDigit;
    }

    public static boolean isPalendrom(int n) {
        int rightDigit, leftDigit;
        boolean answer = true;
        int digs = getNumberOfDigits(n);
        for (int i = 0; i < digs / 2; i++) {
            rightDigit = n % 10;
            leftDigit = (int) (n / (Math.pow(10, (getNumberOfDigits(n) - 1))));
            n = (int) (n - leftDigit * Math.pow(10, (getNumberOfDigits(n) - 1))) / 10;  // Delete first and last digit of the number
            if (rightDigit != leftDigit) {
                answer = false;
                break;
            }
        }
        return answer;

    }

    public static int getNumberOfDigits(int n) {
        int numberOfDigits = 0;
        while (n > 0) {
            numberOfDigits++;
            n /= 10;
        }
        return numberOfDigits;
    }


    public static boolean isPrime(int n) {
        boolean ans = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void findPrimeDenominators(int n) {
        for (int i = 2; i < n / i; i++) {
            if (isPrime(i)) {
                if (n % i == 0) {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    public static int findGCD(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 %= n2;
            } else {
                n2 %= n1;
            }
        }
        return n1 + n2;
    }

    public static int findLCM(int n1, int n2) {
        return n1 * n2 / findGCD(n1, n2);
    }

    public static int countDiferentDigs(int n) {
        int counterOfDifdigs = 0;
        int n2 = n;
        for (int i = 0; i < 10; i++) {
            n = n2;
            while (n > 0) {
                if (i == n % 10) {
                    counterOfDifdigs++;
                    break;
                }
                n /= 10;
            }
        }
        return counterOfDifdigs;
    }
}
