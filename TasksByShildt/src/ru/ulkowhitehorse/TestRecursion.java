package ru.ulkowhitehorse;

import ru.ulkowhitehorse.Recursion.Factorial;
import ru.ulkowhitehorse.Recursion.RecTest;

/**
 * Created by User on 12/8/2016.
 */
public class TestRecursion {
    public static void main(String[] args) {

        // ФАКТОРИАЛ
        Factorial f = new Factorial();
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));

        // Первые i элементов массива
        RecTest rec = new RecTest(10);
        int i;

        for (i=0; i<10; i++) rec.setValue(i);

        rec.printArray(10);
    }
}
