package by.Gorbatsevich.L_09_01_2025;
//Сумма положительных чисел
//Напишите программу, которая запрашивает у пользователя ввод чисел до тех пор,
// пока не будет введено отрицательное число.
// Подсчитайте сумму всех введенных положительных чисел.
// Используйте break для выхода из цикла.

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        int i;
        int su = 0;
        while (true) {
            i = sc.nextInt();
            if (i < 0) {
                System.out.println("Вы ввели отрицательно число");
                break;
            }
            su += i;
        }
        System.out.println("Сумма чисел равна " + su);
    }
}
