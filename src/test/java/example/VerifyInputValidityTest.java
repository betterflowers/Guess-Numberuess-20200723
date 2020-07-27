package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerifyInputValidityTest {
    @Test
    void should_return_invalid_when_guess_given_answer_and_input_guess_12345(){
        //given
        int[] inputGuess = {1,2,3,4,5};
        VerifyInputValidity verifyInputValidity = new VerifyInputValidity();

        //when
        boolean result = verifyInputValidity.isCorrectLength(inputGuess);

        //then
        assertEquals(false,result);
    }

    @Test
    void should_return_invalid_when_guess_given_answer_and_input_guess_1223(){
        //given
        int[] inputGuess = {1,2,2,3};
        VerifyInputValidity verifyInputValidity = new VerifyInputValidity();

        //when
        boolean result = verifyInputValidity.isRepeatNumber(inputGuess);

        //then
        assertEquals(false,result);
    }

    @Test
    void should_return_invalid_when_guess_given_answer_and_input_guess_11234(){
        //given
        int[] inputGuess = {1,2,3,41};
        VerifyInputValidity verifyInputValidity = new VerifyInputValidity();

        //when
        boolean result = verifyInputValidity.isCorrectRange(inputGuess);

        //then
        assertEquals(false,result);

    }

    @Test
    void should_return_invalid_when_guess_given_answer_and_input_guess_invalid_values(){
        //given
        int[] inputGuess = {1,2,3,4,5};
        int[] inputGuess1 = {1,2,3,-4};
        int[] inputGuess2 = {1,1,3,4};
        VerifyInputValidity verifyInputValidity = new VerifyInputValidity();

        //when
        boolean result = verifyInputValidity.getVerifyResult(inputGuess);
        boolean result1 = verifyInputValidity.getVerifyResult(inputGuess1);
        boolean result2 = verifyInputValidity.getVerifyResult(inputGuess2);

        //then
        assertEquals(false,result);
        assertEquals(false,result1);
        assertEquals(false,result2);

    }

}



