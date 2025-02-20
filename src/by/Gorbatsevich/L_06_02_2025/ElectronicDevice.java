package by.Gorbatsevich.L_06_02_2025;

public abstract class ElectronicDevice {
    protected String brand;
    protected String model;
    protected int power;
    protected boolean isOn;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.isOn = false;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract String getStatus();


    public String toString(){
        return "Устройство: " + brand + " " + model + ", мощность: " + power + " Вт";
    }
}


