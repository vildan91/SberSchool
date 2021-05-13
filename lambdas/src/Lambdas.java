import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class Lambdas {
    static <T, R> List<R> map (List<T> origin, Function<T, R> mapper){
        Iterator<T> it = origin.iterator();
        List<R> resultList = new ArrayList<>();
        while (it.hasNext()){
            T t = it.next();
            resultList.add(mapper.apply(t));
        }
        return resultList;
    }

    static <T> List<T> filter (List<T> origin, Predicate<T> predicate){
        Iterator<T> it = origin.iterator();
        while (it.hasNext()){
            T t = it.next();
            if (predicate.test(t)) {
                it.remove();
            }
        }
        return origin;
    }

    static <T> void foreach (List<T> origin, Consumer<T> consumer){
        Iterator<T> it = origin.iterator();
        while (it.hasNext()){
            T t = it.next();
            consumer.accept(t);
        }
    }

    static <T> T foldL (List<T> origin, BinaryOperator<T> binaryOperator){
        Iterator<T> it = origin.iterator();
        T result = it.next();
        while (it.hasNext()){
            T t = it.next();
            binaryOperator.apply(t, result);
        }
        return result;
    }
    static <T> T foldR (List<T> origin, BinaryOperator<T> binaryOperator){
        Iterator<T> it = origin.iterator();
        List<T> reverse = new ArrayList<>();
        while (it.hasNext()){
            T t = it.next();
            reverse.add(t);
        }
        return foldL(reverse, binaryOperator);
    }

}
