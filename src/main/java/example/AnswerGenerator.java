package example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AnswerGenerator {

    public int[] generateAnswerNumber() {

        int[] randomNumber = new int[4];
        ArrayList<Integer> randomNumberList = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            randomNumberList.add(i);
        }
        boolean[] bool = new boolean[52];

        for(int index=0;index<4;index++){
            do{
                randomNumber[index] = randomNumberList.get((int)(Math.random()*10));
            }while(bool[randomNumber[index]]);
            bool[randomNumber[index]]=true;

        }
        return randomNumber;
    }

}
