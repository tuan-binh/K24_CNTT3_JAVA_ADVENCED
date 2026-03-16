package dpi;

public class Main {
    public static void main(String[] args) {
        ProcessOrder processOrder = new ProcessOrder(new MonoProcess());
        ProcessOrder tu = new ProcessOrder(new VNPayProcess());
        processOrder.handleProcessOrder();
        tu.handleProcessOrder();
    }
}
