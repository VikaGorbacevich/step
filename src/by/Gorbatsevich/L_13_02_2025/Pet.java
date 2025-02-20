package by.Gorbatsevich.L_13_02_2025;


import java.util.Random;

public abstract class Pet extends Animal {
    private static String[] surNames = new String[5];
    private Random random = new Random();

    static {
        surNames[0] = "Моисеенко";
        surNames[1] = "Горбацевич";
        surNames[2] = "Мурадян";
        surNames[3] = "Савчук";
        surNames[4] = "Куделько";
    }

    protected String vladelecName;
    protected String ownerSurName;

    public Pet(String name, String species, int age, String vladelecName) {
        super(name, species, age);
        this.vladelecName = vladelecName;
        this.ownerSurName = surNames[random.nextInt(surNames.length)]; //присваиваем рандомную фамилию
    }

    public abstract  String play();

    public String getVladelecName() {
        return vladelecName+ " " + ownerSurName;
    }
}
