package by.Gorbatsevich.L_20_02_2025;

public class Task00 {
    public static void main(String[] args) {
        Pet cat = new Cat("Мурка", "кошка", 2, new Owner());
        Pet dog = new Dog("Барсик", "собака", 3, new Owner());
        Pet bird = new Bird("Кеша", "попугай", 1, new Owner());
        WildAnimal lion = new Lion("Симба", "лев", 7, "Саванна");

        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        Owner owner3 = new Owner();

        owner1.add(cat);
        owner2.add(bird);
        owner3.add(dog);

        Pet[] pets = {dog, cat, bird};
//        for (Pet pet : pets) {
//            System.out.println(pet);
//            pet.makeSound();
//            String move = pet.move();
//            System.out.println(move);
//            String eat = pet.eat();
//            System.out.println(eat);
//            String play = pet.play();
//            System.out.println(play);
//            System.out.println();
//
//        }


        WildAnimal[] wildAnimals = {lion};
//        for (WildAnimal wildAnimal : wildAnimals) {
//            System.out.println(wildAnimal);
//            wildAnimal.makeSound();
//            String move = wildAnimal.move();
//            System.out.println(move);
//            String eat = wildAnimal.eat();
//            System.out.println(eat);
//            String hunt = wildAnimal.hunt();
//            System.out.println(hunt);
//            System.out.println();
//        }

        System.out.println("Общее количество животных " + Animal.getTotalAnimals());


    }
}

