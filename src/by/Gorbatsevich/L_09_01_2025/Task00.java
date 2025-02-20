package by.Gorbatsevich.L_09_01_2025;

public class Task00 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            int b = 9;
            for (int j = 0; j < 20; j++) {
                a = 99;
            }
        }
        // тут доступ к переменной b не доступен
        a = 99;
    }
}
