public class lambdaexp {
    public static void main(String[] args) {
        // A obj = (int i) -> {
        // System.out.println("in show");
        // };
        A obj = i -> {
            System.out.println("in show");
        };
        // when u have only one variable passed then you even don't need to put the
        // brackets even
        // obj.show();
        obj.show(5);
    }
}

interface A {
    // void show();
    void show(int i);
}
