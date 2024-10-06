public class kuch_interface {
    public static void main(String[] args) {
        // no problem in creating a reference of interfcae
        A obj;
        obj = new B();
        obj.show();
        obj.config();
    }
}

interface A {
    void show();

    void config();
} // in interfcae all methods are by defaulty public abstrcat

// interfcae says i will tell you the methods it's your job to implemnt them
class B implements A {
    public void show() {
        System.out.println("in B");

    }

    public void config() {
        System.out.println("in B1");
    }
}
