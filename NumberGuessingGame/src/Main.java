import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String input = "";

        do{
            int randomNumber = rand.nextInt(100) + 1;
            boolean correctGuess = false;

            while(!correctGuess){
                System.out.print("Guess a number (1-100): ");
                input = scanner.nextLine().trim().toLowerCase();

                if(input.equals("end")) {
                    return;
                }

                int userGuessInt = Integer.parseInt(input);
                if (userGuessInt > randomNumber){
                    System.out.println("Too high");
                } else if (userGuessInt < randomNumber){
                    System.out.println("Too low");
                } else {
                    System.out.println("You win!");
                    correctGuess = true;
                }
            }
            System.out.println("Good game! Press Enter to play another or write end.");
            input = scanner.nextLine().trim().toLowerCase();
        }while(!input.equals("end"));
    }
}