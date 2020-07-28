package example;

import java.util.HashMap;

public class InputValidity {

    private final int inputsLength = 4;



    public boolean getVerifyResult(int[] inputGuess) {
        return isCorrectLength(inputGuess) && isRepeatNumber(inputGuess) && isCorrectRange(inputGuess);

    }

    public boolean isCorrectLength(int[] inputGuess) {
        if (inputGuess.length != inputsLength) {
            return false;
        }
        return true;
    }

    public boolean isRepeatNumber(int[] inputGuess) {
        for (int index = 0; index < inputGuess.length; index++) {
            for (int j = index + 1; j < inputGuess.length; j++) {
                if (inputGuess[index] == inputGuess[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isCorrectRange(int[] inputGuess) {
        for (int index = 0; index < inputGuess.length; index++) {
            if (inputGuess[index] < 0 || inputGuess[index] > 9)
                return false;
        }
        return true;
    }

}
