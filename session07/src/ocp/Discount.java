package ocp;

public class Discount {
    public void processDiscount(String type) {
        if (type.equals("Trẻ em")) {
            System.out.println("Miễn phí");
        } else if (type.equals("Thiếu niên")) {
            System.out.println("Giảm giá 50%");
        } else if (type.equals("Thanh niên")) {
            System.out.println("Trả đủ thì vào");
        } else {
            System.out.println("X2 giá tiền thì mới được vào");
        }
    }
}
