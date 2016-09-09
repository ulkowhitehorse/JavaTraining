package ru.ulko.animals;


public abstract class Animal {

    public Animal(String nickName, String species, int age){
        this.nickName = nickName;
        this.species = species;
        this.age = age;
    }

    //Name (dog, cat, etc) SET FINALLY
    abstract String getName();

    //NickName
    private String nickName;
    public String getNickName(){
        return nickName;
    };
    public void setNickName(String nick){
        nickName = nick;
    };

    //Satisfaction
    private int satisfaction = 100;

    public int getSatisfaction(){
        return satisfaction;
    };

    public void setSatisfaction(int satisfaction){
        if (satisfaction >= 0 & satisfaction <= 100)
            this.satisfaction = satisfaction;
        else
            System.out.println("Satisfaction can't be less then 0 and more then 100");
    };

    protected boolean isSatisfaction = true;
    abstract void isSatisfaction();

    //Species
    private String species;
    public String getSpecies(){
        return species;
    };
    public void setSpecies(String species){
        this.species = species;
    };

    //Age
    private int age;
    public int getAge(){
        return age;
    };
    public void setAge(int age){
        if (age > 0)
            this.age = age;
        else
            System.out.println("age must be more then 0");
    };

    //Actions
    public void go(){
        System.out.println("I go");
    };
    public void sleap(){
        System.out.println("I sleap");
    };


    //Portraiture
    public void portraiture(){
        System.out.println("It is a " + getName());
        System.out.println("It is nickname " + getNickName());
        System.out.println(getNickName() + " is species " + getSpecies());
        System.out.println(getNickName() + " is " + getAge() + " Years old");
        if (isSatisfaction)
            System.out.println(getNickName() + " is satisfied");
        else
            System.out.println(getNickName() + " isn't satisfied");
    }

}
