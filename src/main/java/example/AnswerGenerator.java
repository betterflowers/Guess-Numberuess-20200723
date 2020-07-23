package example;

import java.util.ArrayList;

public class AnswerGenerator {
    public int[] generateRandomNumbersArray() {
        int[] randomNumber = new int[4];
        ArrayList<Integer> randomNumberList = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            randomNumberList.add(i);
        }
        boolean[] bool = new boolean[52];

        for(int index=0;index<4;index++){
            do{
                randomNumber[index] = randomNumberList.get((int)(Math.random()*9));
            }while(bool[randomNumber[index]]);
            bool[randomNumber[index]]=true;

        }
        return randomNumber;

    }
}
