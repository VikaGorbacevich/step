package by.Gorbatsevich.L_13_01_2025;

import java.util.Scanner;
//Заполните массив размером 10. Любыми числами (int).
// Найдите максимальное число и выведите результат на экран.
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
           if (max < array[i])
               max = array[i]; // значение ячейки
        }
        System.out.println("Максимальное число: " + max);
    }
}
