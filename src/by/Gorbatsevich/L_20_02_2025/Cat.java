package by.Gorbatsevich.L_20_02_2025;


public class Cat extends Pet {
    public Cat(String name, String species, int age, Owner owner) {

        super(name, species, age, owner);
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
        return name + " играет с хозяином " + getOwner();
    }
}
