package ru.ulko.animals;

public class Cat extends Animal{


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
    boolean setIsSatisfaction(int satisfaction) {
        if (satisfaction < 70)
            return false;
        else return true;
    }


}
