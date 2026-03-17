package behavioral.observer;

public class TVNews implements Observer {
    @Override
    public void update(String news) {
        System.out.println("[ TV ] Đang phát tin tức " + news);
    }
}
