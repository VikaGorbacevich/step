package by.Gorbatsevich.L_03_02_2025;

import by.Gorbatsevich.L_30_01_2025.Wheel;

public class Book {


    private String title;
    private Autor autor;
    private int year;

    public Book(String title, Autor autor, int year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return title + " (" + year + ") - " + autor;
    }
}