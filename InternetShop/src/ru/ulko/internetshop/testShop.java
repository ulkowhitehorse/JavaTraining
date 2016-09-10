package ru.ulko.internetshop;


public class testShop {
    public static void main(String[] args) {
        InternetShop shop = new InternetShop();
        shop.items[0] = new MobilePhone(3,"Nokia",20000);
        shop.items[1] = new MobilePhone(4, "Sony", 40000);
        shop.items[3] = new MobilePhone(6, "iPhone", 70000);
        shop.items[4] = new Tablet(6, "iPad", 30000);
        shop.items[5] = new Tablet(6, "Lenovo", 20000);

        shop.discount(shop.items[0]);
        shop.discount(shop.items[5]);

        for (item item: shop.items) {
            if (item != null) {
                System.out.println(item.getName() + " does cost " + item.getPrice());
                System.out.println("==========================");
            }
        }
    }
}
