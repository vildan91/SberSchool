import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyIntegerDecimals> array1 = new ArrayList<>();
        ArrayList<MyIntegerPrimes> array2 = new ArrayList<>();
        array1.add(new MyIntegerDecimals(12312333));
        array1.add(new MyIntegerDecimals(0));
        array1.add(new MyIntegerDecimals(12312333));
        array1.add(new MyIntegerDecimals(-152128));
        array1.add(new MyIntegerDecimals(-142128));
        array1.add(new MyIntegerDecimals(1));
        for (var a : array1) {
            System.out.print(a.getNumber() + "(" + a.uniqueDigits() + ") ");
        }
        System.out.println();
        Collections.sort(array1);
        for (var a : array1) {
            System.out.print(a.getNumber() + "(" + a.uniqueDigits() + ") ");
        }
        array2.add(new MyIntegerPrimes(31));
        array2.add(new MyIntegerPrimes(62));
        array2.add(new MyIntegerPrimes(7));
        array2.add(new MyIntegerPrimes(14));
        array2.add(new MyIntegerPrimes(1));
        System.out.println();
        for (var a : array2) {
            System.out.print(a.getNumber() + "(" + a.primeDivisors() + ") ");
        }
        System.out.println();
        Collections.sort(array2);
        for (var a : array2) {
            System.out.print(a.getNumber() + "(" + a.primeDivisors() + ") ");
        }
    }
}
