import java.util.Random;

public class ArithemeticGame {
    private int score;
    private Difficulty difficulty;
    private Random random;

    public ArithemeticGame() {
        score = 0;
        difficulty = Difficulty.EASY;
        random = new Random();
    }

    public Question getQuestion() {
        // Generate question based on current difficulty
        return new Question(difficulty);
    }

    public void increaseScore() {
        score++;
        if (score % 5 == 0) {
            increaseDifficulty();
        }
    }

    public void decreaseScore() {
        score--;
    }

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
