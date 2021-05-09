import java.util.Iterator;

public class MyNumber implements Iterable<Integer> {
    private Integer number;

    public MyNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new DigitIterator();
    }

    public class DigitIterator implements Iterator<Integer> {
        private int position;


        @Override
        public boolean hasNext() {
            if (number / (int)(Math.pow(10, position)) > 0) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public Integer next() {
            int tempNumber = number / (int)(Math.pow(10, position));
            position++;
            return tempNumber % 10;
        }
    }
}
