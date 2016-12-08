package ru.ulkowhitehorse.ObjectAsArguments;

/**
 * Передача объектов в качестве методов
 */
public class Box {
    double width;
    double height;
    double depth;

    // Конструктор
    // Параметр - объект типа Box
    public Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob. depth;
    }

    // Конструктр
    // Параметры - все размеры
    public Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор
    // Нет параметров
    public Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор для создания куба
    public Box(double len){
        width = height = depth = len;
    }

    // Рассчитать и возвратить объем
    public double volume(){
        return width * height * depth;
    }
}


