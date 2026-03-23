package btth;

public class ACCommand implements Command {
    AC ac;
    int oldTemp;
    int newTemp;

    public ACCommand( AC ac,int newTemp) {
        this.newTemp = newTemp;
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.oldTemp = ac.getTemp();
        ac.changeTemp(newTemp);
        System.out.println("[ AC ] Đã " + (newTemp > oldTemp ? "tăng" : "giảm") + " nhiệt độ " + ac.getTemp());
    }

    @Override
    public void undo() {
        ac.changeTemp(oldTemp);
        System.out.println("[ AC ] Đã trở lại nhiệt đỗ cũ " + ac.getTemp());
    }
}
