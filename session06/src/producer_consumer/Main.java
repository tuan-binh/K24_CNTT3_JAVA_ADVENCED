package producer_consumer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Banking banking = new Banking();
        Thread boxA = new Thread(new HandleServeCustomer("Quầy A",banking));
        Thread boxB = new Thread(new HandleServeCustomer("Quầy B",banking));

//        Thread guard = new Thread(new HandleAddCustomer(banking));
//
//
//        guard.start();


        boxA.start();
        boxB.start();
        boxA.interrupt();
        boxB.interrupt();
    }
}
