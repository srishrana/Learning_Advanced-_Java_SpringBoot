import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 2, 6);
        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        // System.out.println(nums);
        // for (int i = 0; i < nums.size(); i++) {
        // System.ou{t.println(nums.get(i));
        // // }
        // for (int n : nums) {
        // System.out.println(n);
        // } //enhanced for loop
        // will itlself take you to array and print all it's elements

        // nums.forEach(n -> System.out.println(n));
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }

        };
        nums.forEach(con);
    }
}
