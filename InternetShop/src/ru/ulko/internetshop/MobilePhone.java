package ru.ulko.internetshop;

public class MobilePhone implements item {

    public MobilePhone(int available, String name, double price){
        this.available = available;
        this.name = name;
        this.price = price;
    }

    //Properties

    String name;
    double price;
    int available;

    @Override
    public int getAvailable() {
        return available;
    }

    @Override
    public void setAvailable(int available) {
        this.available = available;
    }


    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscount() {
        return 0.01;
    }
}
