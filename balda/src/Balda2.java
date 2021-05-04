import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Balda2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().toLowerCase(Locale.ROOT);
        Set<Character> letters = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            letters.add(c);
        }
        Set<String> words = new HashSet<>();
        String str;
        int resultFirst = 0, resultSecond = 0, wrongFirst = 0, wrongSecond = 0;
        boolean markerFirst = true, markerSecond = true;
        do {

            System.out.println("Первый игрок:");
            str = in.nextLine().toLowerCase(Locale.ROOT);
            boolean marker = true;
            if (!str.isEmpty()) {
                for (char c : str.toCharArray()) {
                    if (!letters.contains(c)) {
                        System.out.println("Нельзя использовать букву " + c);
                        marker = false;
                        wrongFirst++;
                        break;
                    }
                }
                if (marker) {
                    if (!words.contains(str)) {
                        resultFirst++;
                        words.add(str);
                    } else {
                        System.out.println("Слово уже было");
                        wrongFirst++;
                    }
                }
            } else {
                markerFirst = false;
            }
            System.out.println("Второй игрок");
            str = in.nextLine().toLowerCase(Locale.ROOT);
            marker = true;
            if (!str.isEmpty()) {
                for (char c : str.toCharArray()) {
                    if (!letters.contains(c)) {
                        System.out.println("Нельзя использовать букву " + c);
                        marker = false;
                        wrongSecond++;
                        break;
                    }
                }
                if (marker) {
                    if (!words.contains(str)) {
                        resultSecond++;
                        words.add(str);
                    } else {
                        System.out.println("Слово уже было");
                        wrongSecond++;
                    }
                }
            } else {
                markerSecond = false;
            }
        } while (markerFirst || markerSecond);
        System.out.println("Результат: ");
        System.out.println("Первый игрок: слов " + resultFirst + " ; неверных попыток " + wrongFirst);
        System.out.println("Второй игрок: слов " + resultSecond + " ; неверных попыток " + wrongSecond);
    }
}
