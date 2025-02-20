package by.Gorbatsevich.Domaska;

public class Zadacha6 {
    public static void main(String args []) {
        int a = 12;
        int b = 25;
        int c = 7;
        int chislo;
        if (a > b && a > c)
            chislo = a;
        else if (c > a && c > b)
            chislo = c;
        else
            chislo = b;
        System.out.println ("Наибольшее число " + chislo);
    }
}
