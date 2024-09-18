public class Thread_Race_cond {
    public static void main(String[] args) throws InterruptedException {
        Counter obj = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 10; i++) {
                obj.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10; i++) {
                obj.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join(); // main method will wait for 2 threads to return their output before it itself
                   // just prints anything
        t2.join();
        System.out.println(obj.counter);

    }
}

class Counter {
    int counter = 0;

    public synchronized void increment() { // by making the method synchronized it will prevent race condition between
        // the threads
        counter++;

    }
}
