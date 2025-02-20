package by.Gorbatsevich.L_03_02_2025;

import by.Gorbatsevich.L_30_01_2025.Wheel;

import java.util.Arrays;

public class Autor {


   private String name;
   private String surName;
   private int birhYear;

    public Autor(String name, String surName, int birhYear) {
        this.name = name;
        this.surName = surName;
        this.birhYear = birhYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBirhYear() {
        return birhYear;
    }

    public void setBirhYear(int birhYear) {
        this.birhYear = birhYear;
    }

    public String toString() {
        return surName + " " + name + " - " + birhYear;
    }
}