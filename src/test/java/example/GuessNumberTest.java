package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_given_answer_and_input_guess_1234(){
        //given
        int[] answer ={1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateRandomNumbersArray()).thenReturn(answer);

        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        int[] inputGuess = {1,2,3,4};

        //when
        String result =guessNumber.guess(inputGuess,answer);

        //then
        assertEquals("1A0B",result);
    }

    @Test
    void should_return_0A0B_when_guess_given_answer_and_input_guess_5678(){
        //given
        int[] answer ={1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateRandomNumbersArray()).thenReturn(answer);

        int[] inputGuess = {5,6,7,8};
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        //when
        String result =guessNumber.guess(inputGuess,answer);

        //then
        assertEquals("0A0B",result);
    }

    @Test
    void should_return_2A0B_when_guess_given_answer_and_input_guess_1256(){
        //given
        int[] answer ={1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateRandomNumbersArray()).thenReturn(answer);

        int[] inputGuess = {1,2,5,6};
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        //when
        String result =guessNumber.guess(inputGuess,answer);

        //then
        assertEquals("2A0B",result);
    }

    @Test
    void should_return_2A2B_when_guess_given_answer_and_input_guess_1243(){
        //given
        int[] answer ={1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateRandomNumbersArray()).thenReturn(answer);

        int[] inputGuess = {1,2,4,3};
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        //when
        String result =guessNumber.guess(inputGuess,answer);

        //then
        assertEquals("2A2B",result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_and_input_guess_2143(){
        //given
        int[] answer ={1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateRandomNumbersArray()).thenReturn(answer);

        int[] inputGuess = {2,1,4,3};
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        //when
        String result =guessNumber.guess(inputGuess,answer);

        //then
        assertEquals("0A4B",result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_and_input_guess_5643(){
        //given
        int[] answer ={1,2,3,4};
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateRandomNumbersArray()).thenReturn(answer);

        int[] inputGuess = {5,6,4,3};
        GuessNumber guessNumber = new GuessNumber(answerGenerator);

        //when
        String result =guessNumber.guess(inputGuess,answer);

        //then
        assertEquals("0A2B",result);
    }

}
