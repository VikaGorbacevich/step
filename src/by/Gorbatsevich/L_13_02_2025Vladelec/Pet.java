package by.Gorbatsevich.L_13_02_2025Vladelec;


import java.util.Random;

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
