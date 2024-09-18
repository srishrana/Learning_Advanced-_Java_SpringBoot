public class finalkeyword {
    public static void main(String[] args) {
        final int num = 8;
        // num = 9;  
        //cannot assign a value to a final varaible num
        //u will not get any unexpected value 
        System.out.println(num);
        // A obj=new A();
        A obj=new A();
        obj.show();
        obj.add(4,5)

    }
}

class A {
    public void show() {
        System.out.println("in A ");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class B {
    public void show() {
        System.out.println("in B ");
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

// final variable -to make it constant
// final method-to not let it get overridden
// final class- once you make class a s final then you stop it's further
// inheritance
