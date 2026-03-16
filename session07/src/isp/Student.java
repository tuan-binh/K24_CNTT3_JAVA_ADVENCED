package isp;

public class Student implements Workable, Eatable, Sleepable {
    public void work() {
        System.out.println("Đang làm việc");
    }

    public void eat() {
        System.out.println("Đang ăn trưa");
    }

    public void sleep() {
        System.out.println("Đang ngủ");
    }
}
