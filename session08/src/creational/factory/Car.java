package creational.factory;

public class Car implements Transport{
    @Override
    public void drive() {
        System.out.println("[ CAR ] Đang phi trên đường quốc lộ");
    }
}
