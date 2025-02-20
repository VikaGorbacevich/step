package by.Gorbatsevich.L_16_12_2024;

public class Task03 {
    public static void main(String[] args) {
        byte a = 30; // byte используется в массивах
        System.out.println(a);
        short b = -29561;
        System.out.println(b);
        int c = 387859367;
        System.out.println(c);
        long d = 138956738289L; // для long указывается в конце буква L
        System.out.println(d);
        int t = c / 4;
        System.out.println(t);
        float f = c / 4F;
        System.out.println(f);
        double g = c / 4D;
        System.out.println(g);
        float h = 1.5F;
        float k = h / 2;
        System.out.println(k);
        char q = 'Q'; // только 1 символ присваивается
        System.out.println(q);
        boolean o = true;
        boolean p = false;
        System.out.println(o);
        double w = 11 % 10; //остаток от деления
        System.out.println(w);
        double r = 112 % 10;
        System.out.println(r);

        //задача на остаток от деления 12345, чтобы каждое число выводилось с новой строки
        int z = 12345;
        double x = z % 10;
        double xx = z % 100;
        double x1 = xx / 10;



        System.out.println(x);
        System.out.println(x1);

    }
}
