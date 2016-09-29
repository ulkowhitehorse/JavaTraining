package ru.ulko;

import java.util.ArrayList;

/**
 * Created by Ulko on 22.09.2016.
 */
public class test {
    public static void main(String[] args) {

        Algorithm algorithm;
        algorithm = Algorithm.MULTIPLE;
        ArrayList<Float> list = new ArrayList<Float>();
        list.add(27f);
        list.add(3f);
        list.add(3f);
        CalculateAlgorithm calculateAlgorithm = new CalculateAlgorithm(list, algorithm);
        System.out.println(calculateAlgorithm.GetResults());

    }
}
