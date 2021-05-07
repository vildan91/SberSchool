import java.util.Scanner;

public class Kth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();
        long sum = 0;
        int i = 0;
        for (long tmp = 0; i < 18 && tmp - 1 < k; i++) {
            sum = tmp;
            tmp += 9 * (i + 1) * tenPower(i);
        }
        long n = k - sum;
        long first = tenPower(i - 1);
        long number = first + n / i;
        int digitNum = (int) (n % i);
        number = number / tenPower(i - digitNum - 1);
        System.out.println(number % 10);
    }

    public static long tenPower(int power) {
        long result = 1;
        for (int i = 0; i < power; i++) {
            result *= 10;
        }
        return result;
    }
}