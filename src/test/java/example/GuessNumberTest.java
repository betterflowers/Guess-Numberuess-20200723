package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234(){
        //given
        int[] answer ={1,2,3,4};
        int[] inputGuess = {1,2,3,4};
        GuessNumber guessNumber = new GuessNumber(answer);

        //when
        String result =guessNumber.guess(inputGuess,answer);

        //then
        assertEquals("4A0B",result);
    }

}
