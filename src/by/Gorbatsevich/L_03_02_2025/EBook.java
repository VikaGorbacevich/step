package by.Gorbatsevich.L_03_02_2025;

public class EBook extends Book{

    private int fileSize;

    public EBook(String title, Autor autor, int year) {
        super(title, autor, year); // вызов конструктора из род класса
        this.fileSize = fileSize;
    }

    public String toString(){
        return super.toString();

    }
}
