package creational.factory;

public class TransportFactory {
    public static Transport handleTransport(String type) {
        if(type.equals("CAR")) {
            return new Car();
        }
        if(type.equals("BUS")) {
            return new Bus();
        }
        return null;
    }
}
