package btth;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteControl {
    List<Command> commands = new ArrayList<>(); // lưu trữ chức năng
    Stack<Command> histories = new Stack<>(); // lưu trữ lịch sử

    public void addCommand(int slot, Command command) {
        commands.add(slot - 1, command);
    }

    public void pressButton(int slot) {
        Command behavior = commands.get(slot - 1);
        if (behavior != null) {
            behavior.execute();
            histories.push(behavior);
        } else {
            System.err.println("Chức năng không tồn tại");
        }
    }

    public void pressBack() {
        if (!histories.isEmpty()) {
            Command back = histories.pop();
            back.undo();
        } else {
            System.err.println("Chưa có lịch sử");
        }
    }
}
