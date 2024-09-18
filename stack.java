import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        // num[0] = 1;
        // num[2] = 2;
        // num[1] = 3;
        // System.out.println(Arrays.toString(num));
        // num[1] = 6; // we can update arry value anytime

        // System.out.println(Arrays.toString(num));
        System.out.println("Enter the value:");
        for (int i = 0; i < num.length; i++) {
            // System.out.println("Enter the value:");
            num[i] = sc.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }
}
