import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Swimmer {
    private String name;
    private Integer age;

    public Swimmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void swim(Consumer<String> c) {
         c.accept(this.name);
    }

    Supplier<String> supplier = ()->name;

    BiConsumer<String, Integer> setNameAge = (x, y)->{name=x; age=y;};
}
