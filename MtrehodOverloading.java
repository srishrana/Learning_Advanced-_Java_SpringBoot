public class MtrehodOverloading {
    public static void main(String[] args) {
        Calculator cb = new Calculator();
        System.out.println(cb.add(2, 3, 4));
        System.out.println(cb.add(4, 5));
        System.out.println(cb.add(2.4, 4.5));
    }
}

class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;

    }

    public int add(int n1, int n2) {
        return n1 + n2;

    }

    public double add(double n1, double n2) {
        return n1 + n2;

    }
}
