import java.util.Random;

/**
 * The ArithemeticGame class manages the state of the arithmetic game.
 * It handles question generation, score tracking, and difficulty progression.
 */

public class ArithemeticGame {
    private int score;
    private Difficulty difficulty;
    private Random random;

    /**
     * Initializes the game with a starting score of 0 and difficulty at EASY level.
     */

    public ArithemeticGame() {
        score = 0;
        difficulty = Difficulty.EASY;
        random = new Random();
    }

   /**
     * Generates and returns a new arithmetic question based on the current difficulty level.
     * 
     * @return a new Question object
     */

    public Question getQuestion() {
        // Generate question based on current difficulty
        return new Question(difficulty);
    }

    /**
     * Increases the player's score. Every 5 correct answers increase the difficulty level.
     */

    public void increaseScore() {
        score++;
        if (score % 5 == 0) {
            increaseDifficulty();
        }
    }

    /**
     * Decreases the player's score by 1.
     */

    public void decreaseScore() {
        score--;
    }

    /**
     * Increases the difficulty level after certain score thresholds are reached.
     */

    private void increaseDifficulty() {
        if (difficulty == Difficulty.EASY) {
            difficulty = Difficulty.MEDIUM;
            System.out.println("Level Increased to: Medium");
        } else if (difficulty == Difficulty.MEDIUM) {
            difficulty = Difficulty.HARD;
            System.out.println("Level Increased to: Hard");
        }
    }
}
