import java.util.Scanner;

public class Zeckendorf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        int prevPos = 0;
        while (x > 0) {
            long prevFibo = 1;
            long nextFibo = 1;
            int i = 0;
            do {
                long newFibo = prevFibo + nextFibo;
                prevFibo = nextFibo;
                nextFibo = newFibo;
                i++;
            } while (i < 91 && nextFibo <= x);
            if (prevPos != 0) {
                for (int j = prevPos - 1; j > i; j--) {
                    System.out.print(0);
                }
            }
            System.out.print(1);
            prevPos = i;
            x -= prevFibo;
        }
        if (prevPos == 0) {
            System.out.print(0);
        }
        else {
            for (int i = 0; i < prevPos-1; i++) {
                System.out.print(0);
            }
        }
    }
}
