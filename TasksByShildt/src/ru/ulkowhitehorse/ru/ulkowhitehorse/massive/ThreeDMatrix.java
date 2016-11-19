package ru.ulkowhitehorse.ru.ulkowhitehorse.massive;

/**
 * 	three-dimensional array 3*4*5
 *  every element of massive is a multiplication of indexes
 *  каждый элемент массива заполняется произведением индексов
 */
public class ThreeDMatrix {
    public ThreeDMatrix(int firstInd, int secondInd, int thirdInd){
        this.firstInd = firstInd;
        this.secondInd = secondInd;
        this.thirdInd = thirdInd;
        threeD = new int[firstInd][secondInd][thirdInd];
        InitMassive();
    }

    public ThreeDMatrix(){
        threeD = new int[firstInd][secondInd][thirdInd];
        InitMassive();
    }

    private int firstInd = 3;
    private int secondInd = 4;
    private int thirdInd = 5;

    private int threeD[][][];

    private void InitMassive(){
        byte first;
        byte second;
        byte third;
        for (first = 0; first < firstInd; first++){

            for(second = 0; second < secondInd; second++){

                for(third = 0; third < thirdInd; third++){
                    threeD[first][second][third] = first*second*third;
                }

            }
        }
    }




    public void printElements(){

        System.out.println("multiplication of indexes for massiv [" + firstInd + "][" + secondInd + "][" + thirdInd + "]");
        byte i;
        byte j;
        byte k;
        for (i = 0; i < firstInd; i++){

            for(j = 0; j < secondInd; j++){

                for(k = 0; k < thirdInd; k++){
                    System.out.print(threeD[i][j][k]+"\t");
                    if ((k+1) == thirdInd){
                        System.out.print("\n");
                    }
                }
                if((j+1) == secondInd) {
                    System.out.print("\n\n\n");
                }
            }
            if((i+1) == firstInd) {
                System.out.print("\n\n\n");
            }
        }

    }
}
