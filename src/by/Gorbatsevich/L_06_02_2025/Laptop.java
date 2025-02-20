package by.Gorbatsevich.L_06_02_2025;

public class Laptop extends ElectronicDevice {
    private String brand;
    private String model;
    private int power;
    private boolean isOn;

    public Laptop(String brand, String model, int power) {
        super(brand, model, power);
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    @Override
    public void turnOn() {
        isOn = true;

    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return "включен";
    }


}
