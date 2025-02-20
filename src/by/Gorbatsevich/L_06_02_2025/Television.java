package by.Gorbatsevich.L_06_02_2025;

public class Television extends ElectronicDevice {
    private int diagonal;
    private String television = "Samsung";

    public Television (String brand, String model, int power, int diagonal) {
        super(brand, model, power);
        this. diagonal = diagonal;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public String getStatus() {
        return television + " " +  "включено";
    }

    @Override
    public String toString() {
        return super.toString() + " диагональ: " + diagonal;
    }
}

