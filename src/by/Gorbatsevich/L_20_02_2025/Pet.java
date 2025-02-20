package by.Gorbatsevich.L_20_02_2025;


public abstract class Pet extends Animal {
    private Owner owner;

    public Pet(String name, String species, int age, Owner owner) {
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
