package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsInputValidTest {
    @Test
    void should_return_invalid_when_guess_given_answer_1234_and_input_guess_12345(){
        //given
        int[] answer ={1,2,3,4};
        int[] inputGuess = {1,2,3,4,5};
        IsInputValid isInputValid = new IsInputValid();

        //when
        String result = isInputValid.isCorrectLength(inputGuess);

        //then
        assertEquals("Wrong Input，Input again",result);
    }
}



