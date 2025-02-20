package by.Gorbatsevich.L_09_01_2025;

import java.util.Scanner;

// цикл while
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i > 5) {
            if (i == 7) {
                System.out.println("i = 7 и это значит, что мы не будем выполнять код ниже этого блока");
                continue; //бесконечный цикл, если введем 8
            }
            if (i == 6) {
                System.out.println("i = 6 и это значит, что мы прекращаем while");
                break;
            }
            System.out.println(i);
            i--;
        }
    }
}
