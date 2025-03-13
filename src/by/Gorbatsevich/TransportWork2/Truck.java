package by.Gorbatsevich.TransportWork2;

public class Truck extends Transport {

    private final int loadCapacity;

    public Truck(String model, int speed, String licensePlate,int loadCapacity, int year) {
        super(model, speed, licensePlate, year);
        this.loadCapacity=loadCapacity;
    }


    @Override
    public String toString() {
        return super.toString() + " Грузоподъемность " + loadCapacity;
    }
}