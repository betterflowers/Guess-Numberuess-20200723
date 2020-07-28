package example;

public class main {
    public static void main(String[] args){
        GameProcess a =new GameProcess(new InputValidity());
        AnswerGenerator answerGenerator = new AnswerGenerator();
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        a.play(guessNumber);
    }
}
