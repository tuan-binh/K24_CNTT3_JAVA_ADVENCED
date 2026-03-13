package btth;

public class TrainStation {
    private int counter;

    public TrainStation() {
    }

    public TrainStation(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public synchronized void sellTicket(String stall) {
        if (counter > 0) {
            System.out.println(stall + " đang chuẩn bị hàng..., số lượng trong kho: " + counter);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            counter--;
            System.out.println(stall + " đã bán vé thành công, với số lượng còn lại: " + counter);
        } else {
            System.out.println("Đã bán hết rồi... quay lại vào ngày hôm sau");
        }
    }
}
