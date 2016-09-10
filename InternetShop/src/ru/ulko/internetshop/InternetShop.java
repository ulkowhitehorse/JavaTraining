package ru.ulko.internetshop;

public class InternetShop {

    item items[] = new item[10];

    public void buy(item item){
        if (item.getAvailable() != 0)
        {
            item.setAvailable(item.getAvailable()+1);
        }
    }


    public void sell(item item){
        if (item.getAvailable() != 0)
        {
            item.setAvailable(item.getAvailable()-1);
        }
    }

    public void discount(item item){
        item.setPrice(item.getPrice() - (item.getPrice()*item.getDiscount()));
    }

}
