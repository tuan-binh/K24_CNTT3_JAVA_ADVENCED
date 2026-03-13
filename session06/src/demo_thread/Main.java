package demo_thread;

public class Main {
    public static void main(String[] args) {
        StallA stallA = new StallA(); // NEW
        Thread stallB = new Thread(new StallB());
        stallA.start(); // RUNNABLE
        stallB.start();
    }
}
