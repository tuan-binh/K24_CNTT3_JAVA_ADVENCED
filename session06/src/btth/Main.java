package btth;

public class Main {
    public static void main(String[] args) {
        TrainStation trainStation = new TrainStation(10);

        Thread stallA = new Thread(new Stall("Stall A",trainStation));
        Thread stallB = new Thread(new Stall("Stall B",trainStation));
        Thread stallC = new Thread(new Stall("Stall C",trainStation));

        stallA.start();
        stallB.start();
        stallC.start();

    }
}
