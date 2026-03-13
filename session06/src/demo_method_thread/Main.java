package demo_method_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- HỘI CHỢ BẮT ĐẦU ---");
        Thread bangtrongtu = new Thread(
                new Bakery("Quầy bán bánh cuốn cao bằng", true)
        );

        Thread binh = new Thread(
                new Bakery("Quầy bán bán bánh dày", false)
        );

        bangtrongtu.start();
        binh.start();

        bangtrongtu.join();
        binh.join();

        System.out.println("--- HỘI CHỢ KẾT THÚC ---");
    }
}
