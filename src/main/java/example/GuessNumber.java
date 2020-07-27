package example;

public class GuessNumber {

    private int[] answer;

    public GuessNumber(AnswerGenerator answer) {
        this.answer = answer.generateAnswerNumber();
    }


    public String guess(int[] inputGuess) {
        int correctNumCorrectPosition = 0;
        int correctNumWrongPosition = 0;

        for (int index = 0; index < inputGuess.length; index++) {
            if (inputGuess[index] == answer[index]) {
                correctNumCorrectPosition++;
            } else {
                correctNumWrongPosition = getCorrectNumWrongPosition(inputGuess, correctNumWrongPosition, index);
            }
        }

        return formatGuessResult(correctNumCorrectPosition, correctNumWrongPosition);

    }

    private int getCorrectNumWrongPosition(int[] inputGuess, int correctNumWrongPosition, int index) {
        for (int positon = 0; positon < inputGuess.length; positon++) {
            if (inputGuess[index] == answer[positon]) {
                correctNumWrongPosition++;
            }
        }
        return correctNumWrongPosition;
    }

    public String formatGuessResult(int correctNumCorrectPosition, int correctNumWrongPosition) {
        String result = correctNumCorrectPosition + "A" + correctNumWrongPosition + "B";
        return result;
    }


}
