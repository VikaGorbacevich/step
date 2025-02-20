package by.Gorbatsevich.L_13_02_2025Vladelec;


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
        return name + " разговаривает с хозяином "+ super.getOwner();
    }
}
