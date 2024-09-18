public class class_load {
    public static void main(String[] args) throws ClassNotFoundException {
        // This will load the class and trigger the static block
        // Class.forName("Mobile");

        // Uncommenting the below line would create an instance, but it's not needed if
        // you only want to trigger the static block.
        // Mobile obj = new Mobile();

        Mobile obj = new Mobile();
        Mobile.name = "Srishti";
        obj.show();
        obj.show1(obj);

    }
}

class Mobile {
    String brand;
    int price;
    static String name;

    // constructor
    public Mobile() {
        this.brand = " ";
        this.price = 200;
        System.out.println("in constructor block");
    }

    // static block for initializing static var
    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    // crrating a simple static method
    public static void show1(Mobile obj) {
        System.out.println("in static method");
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}
