package by.Gorbatsevich.L_19_12_2024;
//рассчитываем идеальный вес
public class Task02 {
    public static void main(String[] args) {
        int a = 110;
        int rost = 163;
        int myv = 59;
        int norma = rost - a;
        int res = myv - norma;

        if (norma < myv) {
            System.out.println("Вам нужно похудеть на " + res);
        }
        else if (norma > myv) {
            System.out.println("Вам нужно набрать " + res);
        }
        else {
            System.out.println("Всё ОК");
        }

       // System.out.println("Мне нужно ");
    }
}
