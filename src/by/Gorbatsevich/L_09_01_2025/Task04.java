package by.Gorbatsevich.L_09_01_2025;

import java.util.Scanner;

//Поиск числа
//Напишите программу, которая запрашивает у пользователя ввод чисел до тех пор,
// пока не будет введено число 7. Если пользователь вводит число 5,
// программа должна пропустить его и продолжить выполнение.

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        int i;
        while (true) {
            i = sc.nextInt();
            if (i == 7) {
                System.out.println("i = 7");
                break;
            }
            if (i == 5) {
                continue;
            }
            System.out.println("Вы ввели число: " + i);
        }
    }
}

