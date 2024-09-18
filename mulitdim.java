import java.util.Scanner;

public class mulitdim {
    public static void main(String[] args) {
        int num[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value");
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // num[i][j] = sc.nextInt();

        // }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[k][j]);

            }
            System.out.println();
        }
    }
}
