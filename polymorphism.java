public class polymorphism {
    // two types of polymorphism
    // compiler time(early binding) or runtime polymorphism(late binding)
    // compiler time ( overloading)
    // runtime polymorphism (overriding)

    // implement runtime polymorphism
    // implement dynamic method dispatch
    // implementing runtime polymrophism
    public static void main(String[] args) {
        A obj = new A();
        // we can refer the reference as parent but the object must be child
        // it is possible to create a reference of a super class and object of a
        // sublcass
        obj.show();

        // but if i have the same
        obj = new A();
        obj.show();
        // method in both A and B
        obj = new C();
        obj.show();

    }
}

class A {
    public void show() {
        System.out.println("in a ");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B ");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C ");
    }
}
