package behavioral.observer;

public class Newspaper implements Observer {
    @Override
    public void update(String news) {
        System.out.println("[ Tờ báo ] Đang phát tin tức " + news);
    }
}
