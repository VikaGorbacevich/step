package by.Gorbatsevich.L_13_01_2025;

import java.util.Scanner;
//Заполните массив размером 10. Любыми числами (int).
// найдите ячейку с числом 5 в этом массиве.
// если этого числа нет, то выводится на экран "-1"
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

    }
}
