package by.Gorbatsevich.L_23_01_2025;

import java.util.Random;

public class Building {
    String street;
    String materia;
    int doors;
    int windows;

    public Building(String street, String materia, int doors, int windows) {
        this.street = street;
        this.materia = materia;
        this.doors = doors;
        this.windows = windows;
    }

    String getDescription() { //метод
        return ("Здание на улице " + street + ": " + windows + " окон, " + doors + " дверей, из " + materia);
    }




        }




