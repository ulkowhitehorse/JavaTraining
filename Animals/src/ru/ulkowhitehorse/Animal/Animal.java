package ru.ulkowhitehorse.Animal;

//Sub class for all animals
public class Animal {
    private String Name;
    private String Age;

    public Animal(String name, String age){
        setName(name);
        setAge(age);
    }

    public void setName(String n){
        Name = n;
    }

    public void setAge(String a){
        Age = a;
    }

    public String getName(){
        return Name;
    }

    public String getAge(){
        return Age;
    }

    private void run(){
        System.out.println("Run");
    }

    private void haunch(){
        System.out.println("Haunch");
    }
}
