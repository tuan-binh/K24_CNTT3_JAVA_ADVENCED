package dpi;

public class VNPayProcess implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Đã thành toán bằng VNPay");
    }
}
