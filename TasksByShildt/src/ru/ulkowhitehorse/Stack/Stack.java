package ru.ulkowhitehorse.Stack;

/**
 * Created by User on 12/8/2016.
 */
public class Stack {
    private int stck[];
    private int tos; // Вершина стека

    // выделить память под стек и инициализировать его
    public Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    // разметить элемент в стеке
    public void push(int item){
        if (tos == stck.length-1)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop(){
        if (tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }

}
