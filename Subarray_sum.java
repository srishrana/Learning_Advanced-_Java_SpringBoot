import java.util.Scanner;

class Subarray_sum {
    public static int sum(int prefix_array[], int nums[]) {
        int max_sum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                // Calculating the subarray sum using prefix array
                currsum = i == 0 ? prefix_array[j] : prefix_array[j] - prefix_array[i - 1];

                // Update max_sum if current sum is greater
                if (currsum > max_sum) {
                    max_sum = currsum;
                }
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 }; // Input array

        // Prefix sum array should have one extra space
        int prefix_array[] = new int[nums.length];

        // Initialize the prefix array
        prefix_array[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix_array[i] = prefix_array[i - 1] + nums[i];
        }

        // Find the maximum subarray sum using the prefix array
        int max_sum = sum(prefix_array, nums);

        System.out.println("Maximum Subarray Sum: " + max_sum);
    }
}
