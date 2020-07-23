package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerGeneratorTest {
    @Test
    void should_return_validAnswer_before_playGame(){
        AnswerGenerator answerGenerator =new AnswerGenerator();
        int[] randomNumber = answerGenerator.generateRandomNumbersArray();

        IsInputValid result = new IsInputValid();
        boolean resultLength = result.isCorrectLength(randomNumber);
        boolean resultRepeat = result.isRepeatNumber(randomNumber);

        //when
        assertEquals(true,resultLength&&resultRepeat);

    }

}
