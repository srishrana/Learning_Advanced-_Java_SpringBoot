import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7);
        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con);
        // // Stream is an interface
        // System.out.println(nums.stream());
        // // it returns the object of stream

        // // now get all the values
        // Stream<Integer> s1 = nums.stream();

        // s1.forEach(n -> System.out.println(s1));
        // s1.forEach(n -> System.out.println(s1));
        // streams are used to refer to the concurrent environments .Since the
        // origninal data is not modified ,multiple threads can operate ont he same data
        // source without causing inconsistent sttates
        // int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0,
        // Integer::sum);
        // int result1 = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0,
        // Integer::sum);
        // System.out.println(result);

        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (c, e) -> c + e);
        // System.out.println(result);\
        int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, Integer::sum);
        System.out.println(result);

    }
}
