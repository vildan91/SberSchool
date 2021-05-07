import java.util.HashSet;
import java.util.Set;

public class MyIntegerDecimals implements Comparable<MyIntegerDecimals> {
    private Integer number;

    public MyIntegerDecimals(Integer number) {
        this.number = number;
    }

    public MyIntegerDecimals() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public int compareTo(MyIntegerDecimals o) {
        if (this.uniqueDigits().compareTo(o.uniqueDigits()) == 0) {
            return this.number.compareTo(o.number);
        }
        else {
            return this.uniqueDigits().compareTo(o.uniqueDigits());
        }
    }

    public Integer uniqueDigits() {
        int num = this.number;
        Set<Integer> set = new HashSet<>();
        do {
            set.add(num % 10);
            num /= 10;
        } while (num != 0);
        return set.size();
    }
}
