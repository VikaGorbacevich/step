package by.Gorbatsevich.L_10_02_2025;


public class Cat extends Pet {
    public Cat(String name, String species, int age, String vladelecName) {
        super(name, species, age, vladelecName);
    }

    @Override
    public String makeSound() {
        System.out.println(name + " говорит: Мяу!");
        return null;
    }

    @Override
    public String move() {
        return name + " гациозно крадется.";
    }

    @Override
    public String eat() {
        return name + " ест рыбу.";
    }

    @Override
    public String play() {
        return name + " играет с хозяином " + super.getVladelecName();
    }
}
