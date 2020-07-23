package example;

public class IsInputValid {
    public String isCorrectLength(int[] inputGuess) {
        if(inputGuess.length !=4){
            return "Wrong Input，Input again";
        }
        return String.valueOf(inputGuess);
    }
}
