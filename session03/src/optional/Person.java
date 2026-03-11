package optional;

import java.util.Optional;

public class Person {

    public Optional<Laptop> takeLaptop() {
        return Optional.of(new Laptop("Dell",false));
    }

}
