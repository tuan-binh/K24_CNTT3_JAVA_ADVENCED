package ocp;

public class BabyDiscount implements PaymentDiscount {
    @Override
    public void processDiscount() {
        System.out.println("Cho miễn phí");
    }
}
