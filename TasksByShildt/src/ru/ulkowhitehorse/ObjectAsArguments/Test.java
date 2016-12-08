package ru.ulkowhitehorse.ObjectAsArguments;

/**
 * Created by User on 12/8/2016.
 */
public class Test {
    int a;

    public int getA(){
        return a;
    }

    public Test(int i){
        a = i;
    }

    public Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }
}
