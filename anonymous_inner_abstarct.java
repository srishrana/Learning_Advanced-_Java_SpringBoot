public class anonymous_inner_abstarct {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in new Show");
            }
        };
        obj.s1();
        obj.show();

    }
}

abstract class A {
    public abstract void show();

    public void s1() {
        System.out.println("hi");
    }
}
