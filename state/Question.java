import java.util.Random;

/**
 * The Question class represents an arithmetic question.
 * It generates operands and operations based on the current difficulty level.
 */

public class Question {
    private int operand1;
    private int operand2;
    private Operation operation;
    private Difficulty difficulty;

    /**
     * Constructs a new Question based on the provided difficulty level.
     * 
     * @param difficulty the difficulty level for generating operands
     */

    public Question(Difficulty difficulty) {
        this.difficulty = difficulty;
        generateQuestion();
    }

    private void generateQuestion() {
        Random random = new Random();
        operand1 = random.nextInt(10 * difficulty.getLevel());
        operand2 = random.nextInt(10 * difficulty.getLevel());
        operation = Operation.values()[random.nextInt(Operation.values().length)];
    }

    /**
     * Checks if the provided answer is correct for the given question.
     * 
     * @param answer the user's answer to the arithmetic question
     * @return true if the answer is correct, false otherwise
     */

    public boolean isCorrect(int answer) {
        switch(operation) {
            case PLUS: return operand1 + operand2 == answer;
            case MINUS: return operand1 - operand2 == answer;
            case MULTIPLY: return operand1 * operand2 == answer;
            case DIVIDE: return operand2 != 0 && operand1 / operand2 == answer;
            default: return false;
        }
    }

    /**
     * Returns the string representation of the question in the format "operand1 operator operand2".
     * 
     * @return the formatted question as a string
     */

    @Override
    public String toString() {
        return operand1 + " " + operation.label + " " + operand2;
    }
}
