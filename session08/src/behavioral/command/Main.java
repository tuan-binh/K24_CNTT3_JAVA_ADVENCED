package behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        RemoteControl remoteControl = new RemoteControl(
                new TurnOffLightCommand(light)
        );

        remoteControl.pressButton();

    }
}
