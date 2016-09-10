package ru.ulko.animals;

/**
 * Created by mqc647 on 09.09.2016.
 */
public class Dog extends Animal {
    public Dog(String nickName, String species, int age) {
        super(nickName, species, age);
    }

    @Override
    public void say() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("I eat a meat");
    }

    @Override
    public void drink() {
        System.out.println("I drink water");
    }

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public boolean setIsSatisfaction(int satisfaction) {
        if (satisfaction < 50)
            return false;
        else return true;
    }


}
