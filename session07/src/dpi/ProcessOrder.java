package dpi;

public class ProcessOrder {
    PaymentMethod paymentMethod;

    public ProcessOrder(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void handleProcessOrder() {
        paymentMethod.pay();
    }
}
