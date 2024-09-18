public class interface111 {
    public static void main(String[] args) {
        a obj = new a() {
            public void show() {
                System.out.println("in show");
            }

        };
    }

    @FunctionalInterface
    interface a {
        void show();
        // void run();//sam interface or fucntional interface
    }

    class B implements a {
        public void show() {
            System.out.println("in show");
        }
    }
}

// we will work more with functional interface

// interface wtih two or more emthods is normal interface
// interface with only one method is Single method interface
// interface with no method declared is marker interface

// normally there are three types of interfaces
// normal/SAM/marker interface
