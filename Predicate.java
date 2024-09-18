import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Predicate { // Rename the class to avoid conflict
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // Using Predicate to filter even numbers
        Predicate<Integer> isEven = new Predicate<Integer>() {
            public boolean test(Integer n)
            // express teh condition in a single line using a lambda expresssion
            {
                return n % 2 == 0;
            }
        };

        List<Integer> evens = nums.stream()
                .filter(isEven) // Apply the Predicate
                .collect(Collectors.toList());

        System.out.println(evens); // Output: [2, 4]
    }
}
