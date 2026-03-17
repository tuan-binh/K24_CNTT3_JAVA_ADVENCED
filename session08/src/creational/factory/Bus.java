package creational.factory;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("[ BUS ] Đang phi trên đường long biên");
    }
}
