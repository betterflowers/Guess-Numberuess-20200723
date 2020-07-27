package example;

public class GuessNumber {

    private int[] inputGuess;
    private int[] answer;

    public GuessNumber(AnswerGenerator answer) {
        this.answer = answer.generateAnswerNumber();
    }

    public int[] getInputGuess() {
        return inputGuess;
    }

    public String guess(int[] inputGuess) {
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

                int aNumber=correctNumCorrectPosition;
                int bNumber = correctNumWrongPosition;
                String result= aNumber+"A"+bNumber+"B";
                return result;}

}
