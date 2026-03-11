package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Laptop son = new Laptop("LOQ", true);
        Optional<Laptop> optionalLaptop = Optional.ofNullable(son);
        System.out.println(optionalLaptop);
        optionalLaptop.ifPresent((laptop) -> {
            System.out.println("Đang fix " + laptop.getName());
        });

        Optional<Laptop> msi = findByName("LOQ");
        Laptop thanh = msi.orElseThrow(() -> new RuntimeException("Lap top không tìm thấy"));
        System.out.println(thanh.getName());

        Optional<Person> personOptional = Optional.of(new Person());
        Laptop laptop = personOptional.
                flatMap(Person::takeLaptop)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy laptop"));
        System.out.println(laptop.getName());

    }

    public static Optional<Laptop> findByName(String name) {
        if(name.equals("LOQ")) {
            return Optional.of(new Laptop("LOQ",true));
        }
        return Optional.ofNullable(null);
    }



}
