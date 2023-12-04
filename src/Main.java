import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    // Receive a list of integers, remove odd elements, square each remaining element, collect the result in a new list. (hint use filter and map)
    public List<Integer> exercise1(List<Integer> numbers) {
        return numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
    }

    //  Receive a list of integers, return the sum of squares (hint use map and reduce)
    public List<Integer> exercise2(List<Integer> numbers) {
        return Collections.singletonList(numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum));
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = new Main().exercise1(numbers);

        List<Integer> numbers2 = List.of(2, 2, 2);
        List<Integer> result2 = new Main().exercise2(numbers2);

        System.out.println(result2);
        System.out.println(result);
    }
}