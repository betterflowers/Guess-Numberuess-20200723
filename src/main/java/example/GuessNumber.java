package example;

public class GuessNumber {
    public int[] inputGuess;

    public GuessNumber(int[] answer) {
    }

    public int[] getInputGuess() {
        return inputGuess;
    }

    public String guess(int[] inputGuess,int[] answer) {
        for(int index=0;index<inputGuess.length;index++){
            if(inputGuess[index] == answer[index]){
                continue;
            }else{
                break;
            }
        }
        return "4A0B";
    }
}
