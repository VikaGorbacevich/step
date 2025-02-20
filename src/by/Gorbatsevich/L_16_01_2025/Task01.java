package by.Gorbatsevich.L_16_01_2025;

import by.Gorbatsevich.utils.ArrayUtil;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        // deleteNumFromArray();
        //isPalindrome();
        isOdinakovye();
    }

    private static void deleteNumFromArray() {
        int[] intArray = ArrayUtil.generateIntArray(10, 0, 60);
        int deleteIndex = 2; //Удалим элемент с индексом 2
        if (deleteIndex < intArray.length && deleteIndex >= 0) {
            int[] intArray2 = new int[intArray.length - 1]; //создали новый массив, с длиной -1
            for (int i = 0, j = 0; i < intArray.length; i++) {
                if (deleteIndex == i) {
                    continue;
                }
                intArray2[j] = intArray[i];
                j++;

            }
            System.out.println(Arrays.toString(intArray2));
        } else {
            System.out.println("Индекс вне диапазона");
        }
    }

    private static void isPalindrome() {
        int[] array = {1, 2, 3, 4, 3, 2, 1};
        boolean poli = true;
        for (int i = 0; i < array.length / 2; i++) { //проверяем до серидины массива
            if (array[i] == array[array.length - 1 - i]) {
                poli = false;
                break;
            }
        }

        System.out.println(poli ? "Симметричный" : "Не симметричный");
    }

    private static void isOdinakovye() {
        int[] arr = {1,1,21,1};
        boolean a = true;
        for (int i =0; i< arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                a = false;
                break;
            }
        }
        System.out.println(a ? "Все одинаковые" : "Числа в массиве не совпадают");
    }

}
