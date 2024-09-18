public class annotations {
    public static void main(String[] args) {
        // B obj = new B();
        // obj.show();
        A obj = new A();
        obj.show();

    }
}

@Deprecated
class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("in B show");
    }

}
