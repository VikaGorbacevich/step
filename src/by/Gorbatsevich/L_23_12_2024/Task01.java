package by.Gorbatsevich.L_23_12_2024;
//День недели
//
//Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
//«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
//если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
//Пример для номера 5:
//пятница
//Пример для номера 10:
//такого дня недели не существует

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("День недели = понедельник");
                break;
            case 2:
                System.out.println("День недели = вторник");
                break;
            case 3:
                System.out.println("День недели = среда");
                break;
            case 4:
                System.out.println("День недели = четверг");
                break;
            case 5:
                System.out.println("День недели = пятница");
                break;
            case 6:
                System.out.println("День недели = суббота");
                break;
            case 7:
                System.out.println("День недели = воскресенье");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
       // if (a>7 || a==0)
            //System.out.println("Такого дня не существует");
    }
}
