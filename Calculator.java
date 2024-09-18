//oops done in this java class filet
public class Calculator {
    public static void main(String[] args) {

        demo db = new demo();
        int result = db.add(4, 5);
        System.out.println(result);

    }
}

class demo {
    // int num = 4;
    // int num2 = 5;

    public int add(int num, int num2) {
        int sum = num + num2;

        return sum; // method is returnning int value;
    }

}
