public class staticblock_encapsul {
    public static void main(String[] args) {
        Human nk = new Human();
        Human nk1 = new Human(21, "Srishti");
        // nk.age=11; //we will get error
        // nk.name="Nmvim";
        System.out.println(nk.getage() + " " + nk.getname());
        nk.setage(22);
        nk.setname("Srishti Rana");
        System.out.println(nk.getage() + " " + nk.getname());

    }

}

class Human {
    // a lot of people need the ir privayc
    // they don't want their data to be hsared
    private int age = 23;
    private String name = "Janu";

    public Human() {
        // System.out.println("in constructor!");
        age = 21;
        name = "Janu";
    }

    public Human(int a, String name) {
        // System.out.println("in constructor!");
        age = a;
        name = name;
    }

    public int getage() {
        return 21;
    }

    public String getname() {
        return "Srishti";
    }

    public void setage(int a) {
        age = a;
    }

    public void setname(String n) {
        name = n;
    }
}
