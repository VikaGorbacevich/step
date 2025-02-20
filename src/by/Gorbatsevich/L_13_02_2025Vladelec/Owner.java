package by.Gorbatsevich.L_13_02_2025Vladelec;

import by.Gorbatsevich.L_30_01_2025.Wheel;

import java.util.Random;

public class Owner {
    private int id;
    private String name;
    private String surName;
    private String owner;
    private static int totalOwner;

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
            pets[size++] = wheel;
        } else {
            Pet[] pets1 = new Wheel[pets.length + 1];

            for (int i = 0; i < pets.length; i++) {
                pets1[i] = pets[i];
            }
            pets1[size++] = wheel;
            pets = pets1;

        }

    }
}
