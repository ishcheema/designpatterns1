import java.util.ArrayList;
import java.util.Random;

/**
 * TriviaGame class that implements the Singleton pattern.
 * It handles the trivia game logic, including score, question handling, and results.
 */

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private final ArrayList<Question> questions;

    // Private constructor (Singleton)
    private TriviaGame() {
        score = 0;
        numGames = 0;
        rand = new Random();
        questions = DataLoader.getTriviaQuestions();
    }

    // Public method to get the single instance (Singleton)
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    // Returns a random question
    public Question getQuestion() {
        if (questions.isEmpty()) {
            return null;
        }
        int index = rand.nextInt(questions.size());
        return questions.get(index);
    }

    // Returns whether there are more questions
    public boolean hasMoreQuestions() {
        return !questions.isEmpty();
    }

    // Increment score for a correct answer
    public void winRound() {
        score++;
        numGames++;
    }

    // Increment numGames for a wrong answer
    public void loseRound() {
        numGames++;
    }

    // Returns formatted score string
    public String getScores() {
        return "You scored " + score + "/" + numGames;
    }
}
