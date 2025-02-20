package by.Gorbatsevich.L_03_02_2025;


import by.Gorbatsevich.L_30_01_2025.Wheel;

import java.util.Arrays;

public class Library {
    Book[] books;
    int size;

    public Library(int capasity) {
        books = new Book[capasity];
    }

    public void add(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            Book[] books1 = new Book[books.length + 1];

            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[size++] = book;
            books = books1;

        }

    }

    public Book get(int index) {
        return books[index];
    }

    public void sortBybirhYear() {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j] == null || books[j + 1] == null) {
                    continue;
                }
                if (books[j].getAutor().getBirhYear() > books[j + 1].getAutor().getBirhYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public void sortByyear() {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j] == null || books[j + 1] == null) {
                    continue;
                }
                if (books[j].getYear() > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;

    }

    public void printBook(String title) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }

    }

}


