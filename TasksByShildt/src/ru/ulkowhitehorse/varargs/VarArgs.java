package ru.ulkowhitehorse.varargs;

/**
 * Метод с аргументами переменной длины
 */
public class VarArgs {
    public static void vaTest(int ... v){
        System.out.print("Количестко аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }
}
