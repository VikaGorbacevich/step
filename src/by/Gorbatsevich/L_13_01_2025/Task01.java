package by.Gorbatsevich.L_13_01_2025;

import java.util.Scanner;

//Заполните массив размером 10. Любыми числами (int).
// Найдите сумму всех его элементов и выведите результат на экран.
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] array = new int [10]; // массив из 10 ячеек
            for (int i = 0; i < array.length ; i++) {
            array[i] = sc.nextInt(); // записываем значение с консоли в каждую ячейку массива
// получили заполненный массив
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // суммируем все введенные значения
        }
                System.out.println("Сумма: " + sum);
    }
}
