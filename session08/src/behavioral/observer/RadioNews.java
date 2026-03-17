package behavioral.observer;

public class RadioNews implements Observer {
    @Override
    public void update(String news) {
        System.out.println("[ Radio ] Đang phát tin tức " + news);
    }
}
