package example;

public class GuessNumber {
    public int[] inputGuess;

    public GuessNumber(int[] answer) {
    }

    public int[] getInputGuess() {
        return inputGuess;
    }

    public String guess(int[] inputGuess,int[] answer) {
        int correctNumCorrectPosition=0;
        int correctNumWrongPosition=0;
        for(int index=0;index<inputGuess.length;index++){
            if(inputGuess[index] == answer[index]){
                correctNumCorrectPosition++;
                continue;
            }else{
                for(int positon=0;positon<inputGuess.length;positon++){
                    if(inputGuess[index] == answer[positon]){
                        correctNumWrongPosition++;
                    }
                }
            }
        }
//        if(index==0){ return "0A0B";}
//        if(index==4){ return "4A0B";}
//        else{
                int aNumber=correctNumCorrectPosition;
                int bNumber = correctNumWrongPosition;
                String result= aNumber+"A"+bNumber+"B";
                return result;}
//    }
}
