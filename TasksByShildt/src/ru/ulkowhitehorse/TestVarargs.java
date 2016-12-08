package ru.ulkowhitehorse;

import ru.ulkowhitehorse.varargs.VarArgs;

/**
 * Created by User on 12/8/2016.
 */
public class TestVarargs {
    public static void main(String[] args) {
        VarArgs.vaTest(10);
        VarArgs.vaTest(1,2,3);
        VarArgs.vaTest();

        VarArgs.vaTest("Один параметр переменной длины: ", 10);
        VarArgs.vaTest("Один параметр переменной длины: ", 1,2,3);
        VarArgs.vaTest("Один параметр переменной длины: ");

    }
}
