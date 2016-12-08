package ru.ulkowhitehorse.Recursion;

/**
 * printArray() выводит первые i элементов из массива values
 */
public class RecTest {
    int values[];
    public RecTest(int i){
        values = new int[i];
    }

    public void setValue(int val){
        values[val] = val;
    }

    // Вывести рекурсивно элементы массива
    public void printArray(int i){
        if (i == 0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
