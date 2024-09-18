public class static_concept {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
    }
}

class A {
    int gae;

    public void show() {
        System.out.println("in show");
    }

}

class B {
    public void config() {
        System.out.println("in config");
    }
}
