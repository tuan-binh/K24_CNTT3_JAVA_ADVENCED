package demo_sync;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MakeCake makeCake = new MakeCake();
        Thread khanhChef = new Thread(new MasterChef(makeCake));
        Thread tuChef = new Thread(new MasterChef(makeCake));
        khanhChef.start();
        tuChef.start();

        khanhChef.join();
        tuChef.join();

        System.out.println(makeCake.getCounter());
    }
}
