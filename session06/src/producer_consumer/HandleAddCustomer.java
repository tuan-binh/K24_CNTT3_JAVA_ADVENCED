package producer_consumer;

public class HandleAddCustomer implements Runnable {
    Banking banking;

    public HandleAddCustomer(Banking banking) {
        this.banking = banking;
    }

    @Override
    public synchronized void run() {
        int i = 1;
        while (banking.customers.isEmpty()) {
            banking.addCustomer("khách hàng " + (i++));
        }
    }
}
