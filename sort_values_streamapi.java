import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class sort_values_streamapi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8);
        Stream<Integer> sortvalues = nums.stream().filter(n -> n % 2 == 0).sorted();
        sortvalues.forEach(n -> System.out.println(n));

    }
}
