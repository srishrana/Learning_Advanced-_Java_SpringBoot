public class Computer {
    public static void main(String[] args) {
        Comp cmp = new Comp();
        cmp.pplaymusic();
        String str = cmp.getMeAPen();
        int money = cmp.givemoneyback();
        System.out.println(str);
        System.out.println(money);

    }

}

class Comp {
    int display;
    int size;
    String color;
    String keyboardsize;

    public void pplaymusic() {
        System.out.println("muisc is playing !");

    }

    public String getMeAPen() {
        return "Pen";
    }

    public int givemoneyback() {
        return 10;

    }
}
