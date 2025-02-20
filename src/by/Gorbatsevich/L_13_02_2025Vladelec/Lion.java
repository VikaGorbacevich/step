package by.Gorbatsevich.L_13_02_2025Vladelec;


public class Lion extends WildAnimal {
    public Lion(String name, String species, int age, String hunt) {
        super(name, species, age, hunt);
    }

    @Override
    public String makeSound() {
        return name+ " рычит: Рррр!";
    }

    @Override
    public String move() {
        return name+" быстро бежит по "+ super.getHabitat();
    }

    @Override
    public String eat() {
        return name+" ест мясо.";
    }

    @Override
    public String hunt() {
        return name+" охотиться в Африканской "+ super.getHabitat();
    }
}
