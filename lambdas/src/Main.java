public class Main {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer("Bulat", 23);
        swimmer.swim(x -> System.out.println(x));
        System.out.println(swimmer.supplier.get());
        swimmer.setNameAge.accept("Ruslan", 20);
        System.out.println(swimmer.supplier.get());
    }
}
