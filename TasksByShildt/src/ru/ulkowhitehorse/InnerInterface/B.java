package ru.ulkowhitehorse.InnerInterface;

/**
 * Created by User on 08-Dec-16.
 */
public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
