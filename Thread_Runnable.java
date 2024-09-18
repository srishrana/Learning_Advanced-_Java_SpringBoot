// import java.io.IOException;

// public class Thread_Runnable {
//     public static void main(String[] args) {
//         Runnable obj = new A(); // Reference o f Interface and object of class works ok!!
//         Runnable obj1 = new B();
//         // obj.start(obj);
//         // obj1.start();

//         // ab 2 threads bna le
//         Thread t1 = new Thread(obj, "Thread1");// doing threadnaming as well
//         Thread t2 = new Thread(obj1, "Thread2"); // pass object of runnable interface in thread because o/w threads will
//                                                  // no idea
//         // actually what is going!
//         t1.start();
//         t2.start();

//     }
// }

// class A implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }
import java.io.IOException;

public class Thread_Runnable {
    public static void main(String[] args) {
        Runnable obj = new A(); // Reference of Interface and object of class works ok!
        Runnable obj1 = new B();

        // Create 2 threads and start them
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10); // Pause for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(5); // Pause for 5 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
