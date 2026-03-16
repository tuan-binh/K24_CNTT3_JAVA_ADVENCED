package ocp;

public class TeenAger implements PaymentDiscount {
    @Override
    public void processDiscount() {
        System.out.println("Giảm một nửa");
    }
}
