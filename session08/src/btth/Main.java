package btth;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Nhấn nút
         *      - Bật đèn
         *      - Tắt đèn
         *      - Bật quạt
         *      - Tắt quạt
         *      - Điều chỉnh nhiệt độ
         * 2. Trở lại trạng thái trước đó
         * 3. Thoát
         * */

        Light light = new Light();
        Fan fan = new Fan();
        AC ac = new AC(25);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(1,new TurnOnLightCommand(light));
        remoteControl.addCommand(2,new TurnOffLightCommand(light));
        remoteControl.addCommand(3,new TurnOnFanCommand(fan));
        remoteControl.addCommand(4,new TurnOffFanCommand(fan));
        remoteControl.addCommand(5,new ACCommand(ac,18));

        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressBack();
        remoteControl.pressButton(5);
        remoteControl.pressBack();

    }
}
