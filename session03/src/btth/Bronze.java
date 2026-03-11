package btth;

public class Bronze extends Tier{
    String name;

    public Bronze(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
