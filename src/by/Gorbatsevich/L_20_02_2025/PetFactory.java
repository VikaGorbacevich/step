package by.Gorbatsevich.L_20_02_2025;

import java.util.Random;

public class PetFactory {
    //Owner owner = OwnerFactory.next();
    private String cat;
    private String dog;
    private String bird;

    private static String[] cats = new String[5];
    private static String[] dogs = new String[5];
    private static String[] birds = new String[5];
    private Random random = new Random();

    static {
        cats[0] = "Мурзик";
        cats[1] = "Барсик";
        cats[2] = "Микки";
        cats[3] = "Мася";
        cats[4] = "Пуся";

        dogs[0] = "Рекс";
        dogs[1] = "Бакс";
        dogs[2] = "Филл";
        dogs[3] = "Анзор";
        dogs[4] = "Роксана";

        birds[0] = "Кеша";
        birds[1] = "Глаша";
        birds[2] = "Рокки";
        birds[3] = "Маня";
        birds[4] = "Троша";
    }

    public PetFactory() {
        this.cat = cat[random.nextInt(cats.length)];
    }

    public PetFactory() {
        this.dog = dog[random.nextInt(dogs.length)];
    }

    public PetFactory() {
        this.bird = bird[random.nextInt(birds.length)];
    }
}
