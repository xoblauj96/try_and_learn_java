package javaapplication1;

/**
 *
 * @author stl_sdd_sor
 */
public class TrySynchronized implements Runnable {

    private Counter counter = new Counter();

    public static void main(String[] args) {
        TrySynchronized main = new TrySynchronized();
        Thread A = new Thread(Thread.currentThread().getThreadGroup(),main, "A");
        Thread B = new Thread(main, "B");

        A.start();
        B.start();
    }

    public void run() {
        counter.increase();
    }

}

class Counter {

    private int value = 0;

    synchronized public void increase() {
        for (int i = 0; i < 10; i++) {
            value = value + 1;
            System.out.println("value => " + value + " : thread => " + Thread.currentThread().getName());
        }
    }
}
