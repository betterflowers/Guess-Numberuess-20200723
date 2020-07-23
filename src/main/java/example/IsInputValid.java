package example;

import java.util.HashMap;

public class IsInputValid {
    public String isCorrectLength(int[] inputGuess) {
        if(inputGuess.length !=4){
            return "Wrong Input，Input again";
        }
        return String.valueOf(inputGuess);
    }

    public String isRepeatNumber(int[] inputGuess) {
        for(int index=0;index<inputGuess.length-1;index++){
            for(int j=index+1;j<inputGuess.length;j++){
                if(inputGuess[index]==inputGuess[j]){
                    return "Wrong Input，Input again";
                }
            }
        }
        return String.valueOf(inputGuess);
    }
}
