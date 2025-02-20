package by.Gorbatsevich.Domaska;

public class Zadacha5 {
    public static void main(String args []) {
        int num = 237;
        int a, b, c, summa;
        a = num / 100;
        b = num / 10 % 10;
        c = num % 10;
        summa = a + b + c;
        System.out.println ("Сумма цифр числа " + num + " = " + summa);
    }
}
