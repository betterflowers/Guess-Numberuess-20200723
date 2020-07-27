package example;

import java.util.Scanner;

public class GameProcess {

    private final String WIN = "4A0B";
    private int time;
    private final static int CHALLENGE = 6;
    int[] inputs = new int[4];
    private GuessNumber guessNumber;
    private VerifyInputValidity verifyInputValidity;
    Scanner sc = new Scanner(System.in);

    public void play(){
        while(this.time < CHALLENGE){
            for(int index = 0; index <4 ; index++){
                inputs[index] = sc.nextInt();
            }

            if(verifyInputValidity.getVerifyResult(inputs)){
                String result = guessNumber.guess(inputs);
                if(isWin(result)){
                    System.out.println("You win!");
                    break;
                }
                System.out.println("[result]:" + result);
            }else{
                System.out.println("Wrong Input，Input again");
            }
            this.time++;
        }
    }

    private boolean isWin(String answer) {
        return this.time <= CHALLENGE && WIN.equals(answer);
    }

    public static void main(String[] args){
        GameProcess a =new GameProcess();
        a.play();
    }

}
