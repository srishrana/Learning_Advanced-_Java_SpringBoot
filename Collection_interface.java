import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Collection_interface {
    private static final String Iterator = null;

    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<>();
        // List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = (Set<Integer>) new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(7);
        nums.add(9);
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
            System.out.println(values.next());
        // System.out.println(nums);
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(2));

        // in case you want to print value one by one
        for (int n : nums)
        // actually there are objects in nums
        {
            // int num = (Integer) n;
            System.out.println(n);

        }

    }
}
