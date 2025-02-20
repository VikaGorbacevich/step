package by.Gorbatsevich.L_23_01_2025;

public class Product {
    String name;
    int price;
    int quantity;

    public Product() {
        // можем задавать здесь любые действия
        System.out.println("Создали продукт ");
    }

    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    int getTotalValue(){
        return price*quantity;
    }
}
