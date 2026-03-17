package creational.factory;

public class Main {
    public static void main(String[] args) {
        Transport car = TransportFactory.handleTransport("BUS");
        car.drive();
    }
}
