package ru.ulko;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ulko on 22.09.2016.
 */
public class CalculateAlgorithm {


    public CalculateAlgorithm(ArrayList<Float> args, Algorithm algorithm){
        if (args.size() == 0){
            System.out.println("No elements");
        }else {
            Calculate(args, algorithm);
        }
    }

    private Float result;

    public Float GetResults() {
        return result;
    }
    private void SetResults(Float result){
        this.result = result;
    }

    private void Calculate(ArrayList<Float> arguments, Algorithm algorithm){
            Float res = arguments.get(0);
            for (int i = 1; i < arguments.size(); i++){
            if(algorithm == Algorithm.SUM){
                res = res + arguments.get(i);
            }
            if(algorithm == Algorithm.MINUS){
                res = res - arguments.get(i);
            }
            if(algorithm == Algorithm.DEVIDE){
                res = res * arguments.get(i);
            }
            if(algorithm == Algorithm.MULTIPLE){
                res = res / arguments.get(i);
            }

        }
        SetResults(res);
    }







}
