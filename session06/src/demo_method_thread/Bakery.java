package demo_method_thread;

public class Bakery implements Runnable {
    private String name;
    private Boolean isPolite;

    public Bakery(String name, Boolean isPolite) {
        this.name = name;
        this.isPolite = isPolite;
    }

    @Override
    public void run() {
        System.out.println("[ Quầy " + name + " ] Chuẩn bị hàng ...");

        for (int i = 0; i < 5; i++) {
            if (isPolite) {
                Thread.yield();
                System.out.println("[ Quầy " + name + " ] Đã bán được " + (i + 1));
            } else {
                System.out.println("[ Quầy " + name + " ] Đã bán được " + (i + 1));
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        }

        System.out.println("[ Quầy " + name + " ] Đã bán xong ...");
    }
}
