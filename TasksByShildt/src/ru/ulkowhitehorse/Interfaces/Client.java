package ru.ulkowhitehorse.Interfaces;

/**
 * Created by User on 08-Dec-16.
 */
public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth(){
        System.out.println("В классах, реализующих интерфейсы, " +
                            "могут определяться и другие члены.");
    }
}
