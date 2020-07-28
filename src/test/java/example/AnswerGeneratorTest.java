package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerGeneratorTest {
    @Test
    void should_return_validAnswer_before_playGame(){
        AnswerGenerator answerGenerator =new AnswerGenerator();
        int[] randomNumber = answerGenerator.generateAnswerNumber();

        boolean isTestPass = true;

        if (randomNumber.length != 4) {
            isTestPass = false;
        }

        for (int index = 0; index < randomNumber.length; index++) {
            for (int j = index + 1; j < randomNumber.length; j++) {
                if (randomNumber[index] == randomNumber[j]) {
                    isTestPass = false;
                }
            }
        }

        for (int index = 0; index < randomNumber.length; index++) {
            if (randomNumber[index] < 0 || randomNumber[index] > 9)
                isTestPass = false;
        }


        //when
        assertEquals(true,isTestPass);

    }

}
