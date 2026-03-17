package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Wife tu = Wife.getInstance();
        tu.setFullName("Bành Trọng Tú");
        tu.setAge(21);
        System.out.println(tu);
    }
}
