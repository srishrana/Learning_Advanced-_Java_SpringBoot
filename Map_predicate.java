import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Map_predicate {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 5, 6, 7, 8, 9);
        // Predicate<Integer> p = n -> n % 2 == 0;
        // int result = num.stream().filter(p).reduce(0, (c, e) -> c + e);
        // System.out.println(result);
        Function<Integer, Integer> squarefunction = n -> n * n;
        List<Integer> sq = num.stream().map(squarefunction).collect(Collectors.toList());
        System.out.println(sq);
    }
}

// stream api is used to perfrom the operations on sequences od elements
// beacause it offers several adv:
// 1.)Conciseness and declarative nature
// (Functional programming interface)
// chain of operations
// we will use lmabda expressions
// parallel processing //using parallelle stream()
// seamless integration with collections as well
