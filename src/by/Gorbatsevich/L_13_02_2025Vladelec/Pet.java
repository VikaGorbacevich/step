package by.Gorbatsevich.L_13_02_2025Vladelec;


public abstract class Pet extends Animal {
    private Owner owner;

    public Pet(String name, String species, int age, String owner) {
        super(name, species, age);
           }

    public abstract  String play();

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }


}
