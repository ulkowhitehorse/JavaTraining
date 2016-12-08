package ru.ulkowhitehorse.InnerClass;

/**
 * Created by User on 12/8/2016.
 */
public class Outer {
    int outer_x = 100;

    public void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println("вывод: outer_X = " + outer_x);
        }
    }
}
