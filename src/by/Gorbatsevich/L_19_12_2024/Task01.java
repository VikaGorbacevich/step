package by.Gorbatsevich.L_19_12_2024;

public class Task01 {
    public static void main(String[] args) {
        int sec = 186385; //количество секунд до нового года
        // в сутках 86400 секунд нашли в Google
        int day = sec / 86400; //переводим секунды в дни
        int hour = sec % 86400 / 3600; //переводим дни в часы
        int minut = sec % 3600 / 60; //переводим часы в минуты
        int sec1 = sec % 60; //переводим минуты в секунды

        System.out.println("До нового года осталось " + day + " дней, " + hour + " часов, " + minut + " минут, " + sec1 + " секунд");

    }
}
