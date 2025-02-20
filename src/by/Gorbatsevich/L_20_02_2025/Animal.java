package by.Gorbatsevich.L_20_02_2025;


public abstract class Animal {
    protected int id; //уникальный идентификатор
    protected String name;
    protected String species;
    protected int age;
    private static int totalAnimals = 0;

    public Animal(String name, String species, int age) {
        this.id = ++totalAnimals;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String makeSound();

    public abstract String move();

    public abstract String eat();

    public String toString() {
       return species + " по имени " + name + ", возраст: " + age
               + " (id: " + id + ")";
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}

