package by.Gorbatsevich.L_13_02_2025Vladelec;


public class Bird extends Pet implements Flyable, Swimable {
    public Bird(String name, String species, int age, String owner) {

        super(name, species, age, owner);
    }


    @Override
    public String makeSound() {
        System.out.println(name + " говорит: Чик-чирик!");
        return null;
    }

    @Override
    public String move() {
        return name + " летает в небе.";
    }


    @Override
    public String eat() {
        return name + " ест зерна.";
    }

    @Override
    public String play() {
        return name + " разговаривает с хозяином " + super.getOwner();
    }

    @Override
    public void fly() {
        System.out.println(name + " летает");
    }

    @Override
    public void swim() {
        System.out.println(name + " плавает");
    }
}
