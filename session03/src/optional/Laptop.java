package optional;

public class Laptop {
    private String name;
    private Boolean isFix;

    public Laptop() {
    }

    public Laptop(String name, Boolean isFix) {
        this.name = name;
        this.isFix = isFix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFix() {
        return isFix;
    }

    public void setFix(Boolean fix) {
        isFix = fix;
    }
}
