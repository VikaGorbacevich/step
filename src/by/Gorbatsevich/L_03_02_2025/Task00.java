package by.Gorbatsevich.L_03_02_2025;

public class Task00 {
    public static void main(String[] args) {

        Library library = new Library(3);

        Autor tolkien = new Autor("Джон", "Толкин", 1892);
        Book lordOfTherings = new Book("Властелин колец", tolkien, 1955);
        library.add(lordOfTherings);

        System.out.println("Все книги:");
       // library.printBook();

        System.out.println("Поиск книги 'Властелин колец':");
        System.out.println(library.findBook("Властелин колец"));

        System.out.println("Книги после сортировки по году издания:");
        library.sortByyear();
        //library.printBook();

        System.out.println("Книги после сортировки по году рождения автора:");
        library.sortBybirhYear();
       // library.printBook();

    }

}

