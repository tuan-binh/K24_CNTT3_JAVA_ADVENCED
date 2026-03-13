package demo_thread;

public class StallB implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("[ Thuỳ tiên ] Đang bán kẹp kera thứ = " + (i + 1));
        }
    }
}
