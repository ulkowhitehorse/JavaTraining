package ru.ulko.internetshop;

public interface item {

    public int getAvailable();
    public void setAvailable(int available);
    public void setName(String name);
    public String getName();
    public void setPrice(double price);
    public double getPrice();


    double getDiscount();

}
