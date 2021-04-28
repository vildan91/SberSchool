import java.util.Scanner;

public class StringFrame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int frameHeight = in.nextInt();
        int frameLength = in.nextInt();
        String str = in.next();
        if (str.length() > frameLength || frameHeight < 3) {
            System.out.println("Ошибка");
        } else {
            printFirst(frameLength);
            for (int i = 1; i < frameHeight-1; i++) {
                System.out.print("*");
                if (i == (frameHeight - 1) / 2) {
                    printCenter(frameLength, str);
                }
                else {
                    for (int j = 1; j < frameLength - 1; j++)
                        System.out.print(" ");
                }
                System.out.println("*");
            }
            printFirst(frameLength);
        }
    }

    public static void printFirst(int stringLength) {
        for (int i = 0; i < stringLength; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printCenter(int stringLength, String str) {
        int i = 0;
        for (; i < (stringLength - 2 - str.length()) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(str); i+= str.length()+1;
        for (; i < stringLength - 1; i++) {
            System.out.print(" ");
        }
    }
}
