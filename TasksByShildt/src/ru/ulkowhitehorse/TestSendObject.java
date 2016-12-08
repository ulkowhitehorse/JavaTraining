package ru.ulkowhitehorse;

import ru.ulkowhitehorse.ObjectAsArguments.Box;

/**
 * Created by User on 12/8/2016.
 */
public class TestSendObject {
    public static void main(String[] args) {
        // Создать параллелепипеды, используя разные конструкторы
        Box mybox1 = new Box(10,20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        // Создать копию объекта mybox1
        Box myclone = new Box(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Объем куба равен " + vol);

        // получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);

    }
}
