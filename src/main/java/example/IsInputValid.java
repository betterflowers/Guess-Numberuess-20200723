package example;

import java.util.HashMap;

public class IsInputValid {
    public boolean isCorrectLength(int[] inputGuess) {
        if(inputGuess.length !=4){
            return false;
        }
        return true;
    }

    public boolean isRepeatNumber(int[] inputGuess) {
        for(int index=0;index<inputGuess.length-1;index++){
            for(int j=index+1;j<inputGuess.length;j++){
                if(inputGuess[index]==inputGuess[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
