package by.Gorbatsevich.L_13_02_2025;


public class Bird extends Pet {
    public Bird(String name, String species, int age, String vladelecName) {
        super(name, species, age, vladelecName);
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
        return name + " разговаривает с хозяином "+ super.getVladelecName();
    }
}
