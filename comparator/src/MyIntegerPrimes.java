public class MyIntegerPrimes implements Comparable<MyIntegerPrimes> {
    private Integer number;


    public MyIntegerPrimes(Integer number) {
        this.number = number;
    }

    public MyIntegerPrimes() {
    }

    @Override
    public int compareTo(MyIntegerPrimes o) {
        if (this.primeDivisors().compareTo(o.primeDivisors()) == 0) {
            return this.number.compareTo(o.number);
        }
        else {
            return this.primeDivisors().compareTo(o.primeDivisors());
        }

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer primeDivisors() {
        int num = this.getNumber();
        int count;
        int result = 0;
        for (int i = 2; i <= (num); i++) {
            count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
                if (count == 0) {
                    continue;
                }
            }
            if (count > 0) {
                result++;
            }
        }
        return result;
    }
}

