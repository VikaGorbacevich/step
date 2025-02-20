package by.Gorbatsevich.L_10_02_2025;


public abstract class Pet extends Animal {
    protected String vladelecName;

    public Pet(String name, String species, int age, String vladelecName) {
        super(name, species, age);
        this.vladelecName = vladelecName;
    }

    public abstract  String play();

    public String getVladelecName() {
        return vladelecName;
    }
}
