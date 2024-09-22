import java.util.Scanner;

/**
 * TriviaDriver is the main class that drives the trivia game.
 * It interacts with the player, manages rounds, and prints results.
 */

public class TriviaDriver {
    private static final String WIN_STRING = "YAY! You got it right!";
    private static final String LOSE_STRING = "You got it wrong!";
    private final Scanner reader;
    private final TriviaGame triviaGame;

    /**
     * Constructor for TriviaDriver. Initializes the game and greets the player.
     */

    public TriviaDriver() {
        reader = new Scanner(System.in);
        triviaGame = TriviaGame.getInstance();
        System.out.println("Welcome to our trivia game");
    }

    /**
     * Starts the trivia game, allowing the user to play rounds or quit.
     */

    public void play() {
        while(true){
            System.out.print("(P)lay or (Q)uit: ");
            String command = reader.nextLine();

            if(command.equalsIgnoreCase("q")) break;

            if(!command.equalsIgnoreCase("p")) {
                System.out.println("Sorry, you must enter p or q");
                continue;
            }

            playRound();
        }

        System.out.println("\n" + triviaGame.getScores());
        System.out.println("Goodbye");
    }

    private void playRound() {

    /**
     * Plays a single round of trivia.
     * The user is presented with a question and asked to enter an answer.
     */

        Question question = triviaGame.getQuestion();
        System.out.println(question);

        while(true){
            System.out.print("Enter Answer: ");
            String ansText = reader.nextLine().trim();

            try {
                int userAnswer = Integer.parseInt(ansText);

                if(question.isCorrect(userAnswer)){
                    System.out.println(WIN_STRING);
                    triviaGame.winRound();
                    return;
                } else {
                    System.out.println(LOSE_STRING);
                    System.out.println("The correct answer is " + question.getCorrectAnswer());
                    triviaGame.loseRound();
                    return;
                }

            } catch (NumberFormatException ex){
                System.out.println("Sorry, you need to enter a number between 1 and 4");
            }
        }
    }

    /**
     * The main method to run the trivia game.
     * 
     * @param args Command-line arguments (not used)
     */

    public static void main(String[] args){
        (new TriviaDriver()).play();
    }
}
