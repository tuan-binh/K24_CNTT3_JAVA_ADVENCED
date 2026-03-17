package structural.facade;

public class Agency {
    Address address;
    Contact contact;
    Payment payment;

    public Agency() {
        this.address = new Address();
        this.contact = new Contact();
        this.payment = new Payment();
    }

    public void rent() {
        System.out.println("Sinh viên năm nhất lên hà nội tìm trọ");
        address.findAddress();
        contact.makeContact();
        payment.deposit();
        System.out.println("Đã tìm được trọ ngol bổ rẻ");
    }
}
