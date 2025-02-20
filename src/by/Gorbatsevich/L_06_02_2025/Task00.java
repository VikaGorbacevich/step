package by.Gorbatsevich.L_06_02_2025;

public class Task00 {
    public static void main(String[] args) {
     ElectronicDevice smartphone = new Smartphone("Honor", "P30", 200, 200);
     ElectronicDevice television = new Television("LG", "25cot", 200, 200);

     ElectronicDevice[] electronicDevices = {smartphone, television};
     for (ElectronicDevice device : electronicDevices){
         System.out.println(electronicDevices);
         System.out.println("Состояние: " + device.getStatus() );
         device.turnOn();
         System.out.println("Состояние: " + device.getStatus() );
         device.turnOff();
         System.out.println("Состояние: " + device.getStatus() );
         System.out.println();

     }

    }
}

