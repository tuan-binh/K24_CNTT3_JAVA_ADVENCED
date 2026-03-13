package demo_thread;

public class StallA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("[ Ộ i i ] Đang bán hộp khô gà thứ = " + (i + 1));
        }
    }
}
