package by.Gorbatsevich.L_20_02_2025;

import java.util.Random;

public class Owner {
    private int id;
    private String name;
    private String surName;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    private String owner;
    private static int totalOwner;
    private Pet[] pets = new Pet[0];
    private int size;

    private static String[] surNames = new String[5];
    private Random random = new Random();
    private static String[] names = new String[5];
    private Random random1 = new Random();

    static {
        surNames[0] = "Моисеенко";
        surNames[1] = "Горбацевич";
        surNames[2] = "Мурадян";
        surNames[3] = "Савчук";
        surNames[4] = "Куделько";
        names[0] = "Иван";
        names[1] = "Ольга";
        names[2] = "Анна";
        names[3] = "Даниил";
        names[4] = "Вера";
    }

    public Owner() {
        this.surName = surNames[random.nextInt(surNames.length)];
        this.name = names[random.nextInt(names.length)];
    }

    public void add(Pet pet) {
        if (size < pets.length) {
            pets[size++] = pet;
        } else {
            Pet[] pets1 = new Pet[pets.length + 1];

            for (int i = 0; i < pets.length; i++) {
                pets1[i] = pets[i];
            }
            pets1[size++] = pet;
            pets = pets1;

        }
        pet.setOwner(this);
    }

    @Override
    public String toString() {
        return name + " " + surName;
    }
}
