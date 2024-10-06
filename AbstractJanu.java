public class AbstractJanu {
    public static void main(String[] args) {
        // You cannot create an object of an abstract class
        Janu obj = new Mumma();

        obj.roti(); // Calls Mumma's roti() method
        obj.study(); // Calls Mumma's overridden study() method
    }
}

abstract class Janu {
    // Declare abstract method
    public abstract void roti();

    // Define a non-abstract method
    public void study() {
        System.out.println("Study");
    }
}

class Mumma extends Janu {
    // Override the abstract method
    public void roti() {
        System.out.println("Mumma makes roti");
    }

    // Optionally override the non-abstract method
    public void study() {
        System.out.println("Mumma says not study");
    }
}
