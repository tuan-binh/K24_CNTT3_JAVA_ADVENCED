package producer_consumer;

public class HandleServeCustomer implements Runnable {
    private String boxName;

    private Banking banking;

    public HandleServeCustomer() {
    }

    public HandleServeCustomer(String boxName, Banking banking) {
        this.boxName = boxName;
        this.banking = banking;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    @Override
    public synchronized void run() {
        try {
            while (!banking.customers.isEmpty()) {
                System.out.println(boxName);
                banking.serveCustomer();
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
