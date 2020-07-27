package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {

    private GuessNumber setAnswerNumber() {
        int[] answer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswerNumber()).thenReturn(answer);
        return new GuessNumber(answerGenerator);
    }

    @Test
    void should_return_4A0B_when_guess_given_answer_and_input_guess_1234() {
        //given
        int[] inputGuess = {1, 2, 3, 4};

        //when
        String result = setAnswerNumber().guess(inputGuess);

        //then
        assertEquals("4A0B", result);
    }


    @Test
    void should_return_0A0B_when_guess_given_answer_and_input_guess_5678() {
        //given
        int[] inputGuess = {5, 6, 7, 8};

        //when
        String result = setAnswerNumber().guess(inputGuess);

        //then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_2A0B_when_guess_given_answer_and_input_guess_1256() {
        //given
        int[] inputGuess = {1, 2, 5, 6};

        //when
        String result = setAnswerNumber().guess(inputGuess);

        //then
        assertEquals("2A0B", result);
    }

    @Test
    void should_return_2A2B_when_guess_given_answer_and_input_guess_1243() {
        //given
        int[] inputGuess = {1, 2, 4, 3};

        //when
        String result = setAnswerNumber().guess(inputGuess);

        //then
        assertEquals("2A2B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_and_input_guess_2143() {
        //given
        int[] inputGuess = {2, 1, 4, 3};

        //when
        String result = setAnswerNumber().guess(inputGuess);

        //then
        assertEquals("0A4B", result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_and_input_guess_5643() {
        //given
        int[] inputGuess = {5, 6, 4, 3};

        //when
        String result = setAnswerNumber().guess(inputGuess);

        //then
        assertEquals("0A2B", result);
    }

    @Test
    void should_return_1A3B_when_guess_given_answer_and_input_guess_1342() {
        //given
        int[] inputGuess = {1, 3, 4, 2};

        //when
        String result = setAnswerNumber().guess(inputGuess);

        //then
        assertEquals("1A3B", result);
    }

}
