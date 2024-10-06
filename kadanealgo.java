import java.util.Arrays;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class kadanealgo {
    public static void main(String[] args) {
        int nums[] = { 1, -2, 3, -5, 6 };

        kadane(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void kadane(int nums[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currsum = currsum + nums[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);

        }
        System.out.println(maxsum);
    }
}
