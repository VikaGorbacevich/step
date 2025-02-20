package by.Gorbatsevich.L_06_02_2025;

public class Smartphone extends ElectronicDevice {
    private int camera;
    private String smartphone = "Android";

    public Smartphone(String brand, String model, int power, int camera) {
        super(brand, model, power);
        this.camera = camera;
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
        return smartphone + " " + "выключено";
    }

    @Override
    public String toString() {
        return super.toString() + " разрешение камеры: " + camera;
    }
}
