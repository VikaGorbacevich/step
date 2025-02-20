package by.Gorbatsevich.L_10_02_2025;





public class Dog extends Pet{

    public Dog(String name, String species, int age, String vladelecName) {
        super(name, species, age, vladelecName);
    }

    @Override
    public String move() {
        return name+" бегает на четырех лапах";
    }

    @Override
    public String makeSound() {
        System.out.println( name + "говорит: Гав-гав!");
        return null;
    }

    @Override
    public String eat() {
        return name+" ест собачий корм.";
    }


    public String play() {
        return name + " играет с хозяином "+ super.getVladelecName();
    }

}
