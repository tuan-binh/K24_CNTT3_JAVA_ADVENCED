package dpi;

public class MonoProcess implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Thanh toán bằng MOMO");
    }
}
