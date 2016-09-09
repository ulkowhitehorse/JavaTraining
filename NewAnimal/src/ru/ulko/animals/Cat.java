package ru.ulko.animals;

public class Cat extends Animal implements AnimalActions{


    public Cat(String nickName, String species, int age) {
        super(nickName, species, age);
    }

    @Override
    public void say() {
        System.out.println("miaow");
    }

    @Override
    public void eat() {
        System.out.println("I eat a fish");
    }

    @Override
    public void drink() {
        System.out.println("I drink milk");
    }

    @Override
    String getName() {
        return "Cat";
    }

    @Override
    public void isSatisfaction() {
        if (getSatisfaction() < 70){
            isSatisfaction = false;
        }
        else
            isSatisfaction = true;
    }


}
