public class enum_laptop {
    public static void main(String[] args) {
        laptop lap = laptop.Macbook;
        System.out.println(lap + ":" + lap.getPrice());
    }
}

enum laptop {
    Macbook(2000), XPS(2200), Surface(2400),
    ThinkPad(2400);

    private int price;

    // defaukt constructor
    private laptop() {
        price = 500;

    }

    // parameterised constrcutor
    private laptop(int price) {
        this.price = price;
        System.out.println("in laptop" + ":" + this.name());
    }

    // getters and setters
    public int getPrice() {
        return price;
    }
}
