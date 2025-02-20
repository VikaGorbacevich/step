package by.Gorbatsevich.L_13_01_2025;

import java.util.Arrays;

//массивы
public class Task00 {
    public static void main(String[] args) {
        int[] array = new int [10]; // массив из 10 ячеек
        int length = array.length;
        System.out.println(length);
        int a = array[5]; // переменной а присваиваем название ячейки 5 из массива
        for (int i = 0; i < length; i++) {
            array [i] = i * 13; // этим действием заполняем массив
        }
        System.out.println(Arrays.toString(array)); // выводим заполненный массив из чего он состоит
        int[] array2 = {1,2,3,4,5,7,95,3,1424,3,1}; // 2 вариант присвоения значкения массива
        System.out.println(Arrays.toString(array2));
        // int array3 [] = new int [2]; // так не надо
        int[] array4 = new int[]{1,2,3,44,6,7};
        array4[2] = 32; // 3 заменится на 32
        System.out.println(Arrays.toString(array4));
       // array4[10] = 6; // ошибка, длина массива 6, ячейки 10 нет
        char[] chars = new char[]{'a', 'b', 'g'};
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) { // посмотреть что внутри массива chars
            System.out.println(chars[i]);
        }
        for (char aChar : chars) { // тип данных в массиве, название переменной : aChar переменная в которую будут сохраняться данные
            System.out.println(aChar);
        }
    }
}
