package ru.ulko.animals;


public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        animals[0] = new Dog("German", "Dvornjaga", 3);
        animals[0].setSatisfaction(10);
        animals[1] = new Cat("Big Sonya", "Pers", 3);
        animals[2] = new Cat("Small Sonya", "Dvornjaga", 2);

        for (Animal p : animals){
            if (p != null){
                p.portraiture();
                System.out.println("====================");
            }
            else
                break;
        }
    }

}
