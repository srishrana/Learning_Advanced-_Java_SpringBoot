public class this_super {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
    }
}

class A {
    public A() {
        super();
        System.out.println("I A constructor");

    }

    public A(int n) {
        super();
        System.out.println("In constrcutor B ");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in b");

        // when you create object class method then it will call the constructot of
        // subclass and superclass both
    }

    public B(int n) {
        super(n);
        System.out.println("In B initialised constructor");
    }

}
