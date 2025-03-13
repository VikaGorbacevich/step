package by.Gorbatsevich.TransportWork2;

import java.util.List;
import java.util.Random;

public class UserFactory {

    private static final Random random = new Random();

    private final static List<String> name = List.of("Александра", "Вадим", "Есения", "Михаил");


    public static User next() {
        return new User(name.get(random.nextInt(name.size())));
    }
}