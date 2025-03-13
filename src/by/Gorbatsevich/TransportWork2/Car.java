package by.Gorbatsevich.TransportWork2;

public class Car extends Transport {

    private final String fuel;

    public Car(String model, int speed, String licensePlate, int year, String fuel) {
        super(model, speed, licensePlate, year);
        this.fuel = fuel;
    }
}
