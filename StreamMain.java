import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 };
        List<Integer> intList = new ArrayList();
        for (int i : arr) {
            intList.add(i);
        }
        Stream<Integer> stream = intList.stream();
        stream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    }
}
