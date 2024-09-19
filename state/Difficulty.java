
/**
 * The Difficulty enum represents difficulty levels for the arithmetic game.
 * Each level has a corresponding numeric value that controls the range of numbers used in questions.
 */

public enum Difficulty {
    EASY(1),
    MEDIUM(2),
    HARD(3);

    private final int level;

    /**
     * Constructs a Difficulty level with the specified numeric value.
     * 
     * @param level the numeric value representing the difficulty level
     */

    private Difficulty(int level) {
        this.level = level;
    }

    /**
     * Returns the numeric value associated with the difficulty level.
     * 
     * @return the difficulty level's numeric value
     */

    public int getLevel() {
        return level;
    }
}
