sealed class A permits B, C, D {

}

final class B extends A {

}

final class C extends A {

}

final class D extends A {

}

public class sealed11 {
    public static void main(String[] args) {

    }
}


//sealed class A extends thread
// implements Clonable permits B,C

//permits should be the last word after 
//extends and implements 
