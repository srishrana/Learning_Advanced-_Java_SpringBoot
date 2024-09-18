public class objectclass {
    public static void main(String[] args) {
        Laptop lp = new Laptop();
        lp.price = 1000;
        lp.name = "Assu vivobook 14";
        Laptop lp1 = new Laptop();
        lp.price = 1000;
        lp.name = "Assu vivobook 14";
        System.out.println(lp.toString()); /// ye bhi object print karwane lka ek method hai
        // toString (0 method hai to nhi laptop class mein but stilll since every class
        // extendsobject class to ye object class ka method hai)
        System.out.println(lp); /// simple object print karwane ki koshish ki
    }
}
// every class in java by default extends object class

class Laptop {
    int price;
    String name;

    public String toString() {
        return price + " :" + name;
    }

}

// there is an eqauls() method in th eobject class as well
// but we wwant ot implement it ourselves
// object class.equals() method

// generally equals method cmpares two objects by theoir hexadecimal addresses
// bu twe want it to compare both objects using their values
public boolean equals(Laptop lp2) {

    if (this.price.equals(lp2.price)) {
        return true;
    } else {
        return false;
    }
}
