import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        System.out.println("Choose [r]ock, [p]aper, [s]cissors:");

        Scanner scanner = new Scanner(System.in);
        String playerMove = scanner.nextLine().toLowerCase();

        switch (playerMove) {
            case "r", "rock" -> playerMove = ROCK;
            case "p", "paper" -> playerMove = PAPER;
            case "s", "scissors" -> playerMove = SCISSORS;
            default -> {
                System.out.println("Invalid Input. Try Again...");
                return;
            }
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        String computerMove = "";

        switch (computerRandomNumber) {
            case 0 -> computerMove = ROCK;
            case  1 -> computerMove = PAPER;
            case  2 -> computerMove = SCISSORS;

        }
        System.out.printf("The computer chose %s.%n", computerMove);

        if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) ||
                playerMove.equals(PAPER) && computerMove.equals(ROCK)  ||
                playerMove.equals(SCISSORS) && computerMove.equals(PAPER)) {
            System.out.println("You win!");
        } else if (playerMove.equals(ROCK) && computerMove.equals(PAPER) ||
                playerMove.equals(PAPER) && computerMove.equals(SCISSORS)  ||
                playerMove.equals(SCISSORS) && computerMove.equals(ROCK)) {
            System.out.println("You lose!");
        } else {
            System.out.println("This game was  a draw");
        }
    }
}