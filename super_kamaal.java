public class super_kamaal {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

class A {
    public A() {
        super();
        System.out.println(" in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(5);
        System.out.println("in b");
    }

    public B(int n) {

        this();

        System.out.println("in B int");
    }

}
