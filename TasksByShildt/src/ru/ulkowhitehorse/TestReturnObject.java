package ru.ulkowhitehorse;

import ru.ulkowhitehorse.ObjectAsArguments.Test;

/**
 * Created by User on 12/8/2016.
 */
public class TestReturnObject {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.getA()); // 2
        System.out.println("ob2.a: " + ob2.getA()); // 12

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увелечения значения:" + ob2.getA()); // 22
    }
}
