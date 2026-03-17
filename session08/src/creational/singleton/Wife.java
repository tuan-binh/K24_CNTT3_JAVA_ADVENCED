package creational.singleton;

public class Wife {
    private static Wife wife;

    private String fullName;
    private Integer age;

    private Wife() {
    }

    public static Wife getInstance() {
        if(wife == null) {
            wife = new Wife();
        }
        return wife;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
