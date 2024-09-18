public class abstract1 {
    public static void main(String[] args) {
        // Car obj=new Car(); ///cannot create an object of abstract class
        WagorR obj = new WagorR();
        obj.drive();

    }

}

abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playmusic() {
        System.out.println("Play jaane jaana");
    }

}

class WagorR extends Car {

    public void drive() {

        System.out.println("drives fast!");
    }

}

// there is no compulsion that an abstarct class has to have abstarct methods
// an abstact class can have abstarct as well as concrete methods
// any concrete class which has extended from the concrtete class must implement
// the abstarct class as well
// we cannot creatte an object of abstarct class
