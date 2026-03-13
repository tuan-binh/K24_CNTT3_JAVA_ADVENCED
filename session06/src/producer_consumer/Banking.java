package producer_consumer;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Banking {
    Queue<String> customers = new LinkedList<>(List.of(
            "Tú",
            "Khánh",
            "Ninh",
            "Hoàng",
            "Dũng",
            "Mạnh",
            "Anh",
            "An",
            "Quý"
    ));

    public synchronized void addCustomer(String customerName) {
        customers.offer(customerName);
//        if (customers.isEmpty()) {
        notify();
//        }

        System.out.println("Đã thêm thành công " + customerName);
    }

    public synchronized void serveCustomer() throws InterruptedException {
        if (customers.isEmpty()) {
            wait();

        } else {
            String fullName = customers.poll();
            System.out.println("Đã phục vụ khách hàng: " + fullName);
        }
    }

}
