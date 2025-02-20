package by.Gorbatsevich.L_23_01_2025;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt();
        Building[] buildArray = new Building[200];
        for (int i = 0; i < buildArray.length; i++) {
            buildArray[i] = new Building("Ленина", "панельный", r.nextInt(13) + 1, r.nextInt(300));
        }
        for (int i = 0; i < buildArray.length; i++) {
            System.out.println(buildArray[i].getDescription());
        }
    }
}
