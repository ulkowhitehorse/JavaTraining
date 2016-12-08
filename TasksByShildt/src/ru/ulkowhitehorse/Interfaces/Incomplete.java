package ru.ulkowhitehorse.Interfaces;

/**
 * Created by User on 08-Dec-16.
 */
public abstract class Incomplete implements Callback{
    int a, b;

    void show(){
        System.out.println(a + " " + b);
    }
}
