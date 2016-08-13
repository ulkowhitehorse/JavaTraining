package ru.ulkowhitehorse.Animal;

/**
 * Created by Ulko on 13.08.2016.
 */
public class Cat implements Animal {

    private String name;
    private int age;
    final String voice = "Mew";
    final String animal = "Cat";

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void getAnimal() {
        System.out.println(getName() + " is a " + this.animal);
    }

    @Override
    public String getName() {
        return this.name;
    }

    protected void setName(String n) {
        this.name = n;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    protected void setAge(int a) {
        this.age = a;
    }

    @Override
    public void voice() {
        System.out.println(getName() + " say " + this.voice + " ");
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running ");
    }

    @Override
    public void haunch() {
        System.out.println(getName() + " is haunching" );
    }
}
