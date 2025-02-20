package by.Gorbatsevich.L_20_01_2025;

import by.Gorbatsevich.utils.ArrayUtil;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        search();
    }
    private static void search() {
        long[] ints = ArrayUtil.generateIntArray1(10000000, 375330000000L,375339999999L);
        Arrays.sort(ints);
        long index = Arrays.binarySearch(ints, 375336106850L);
        System.out.println(index >= 0 ? "Найден " + index : "Не найден");

    }
}
