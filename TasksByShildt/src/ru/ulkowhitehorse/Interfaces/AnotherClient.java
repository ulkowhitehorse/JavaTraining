package ru.ulkowhitehorse.Interfaces;

/**
 * Created by User on 08-Dec-16.
 */
public class AnotherClient implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
