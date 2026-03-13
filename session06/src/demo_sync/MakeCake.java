package demo_sync;

public class MakeCake {
    private int counter;

    public MakeCake() {
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public MakeCake(int counter) {
        this.counter = counter;
    }

    public synchronized void makeTiramisu() {
        counter++;
    }
}
