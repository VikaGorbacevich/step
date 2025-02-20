package by.Gorbatsevich.L_20_02_2025;


public class Bird extends Pet {
    public Bird(String name, String species, int age, Owner owner) {

        super(name, species, age, owner);
    }

    @Override
    public String makeSound() {
        System.out.println(name+ " говорит: Чик-чирик!");
        return null;
    }

    @Override
    public String move() {
        return name+" летает в небе.";
    }



    @Override
    public String eat() {
        return name+" ест зерна.";
    }

    @Override
    public String play() {
        return name + " разговаривает с хозяином "+ getOwner().toString();
    }
}
