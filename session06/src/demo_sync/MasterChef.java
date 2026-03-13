package demo_sync;

public class MasterChef implements Runnable {

    MakeCake makeCake;

    public MasterChef(MakeCake makeCake) {
        this.makeCake = makeCake;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            makeCake.makeTiramisu();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                System.err.println(e.getMessage());
//            }
        }
    }
}
