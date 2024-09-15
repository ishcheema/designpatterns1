import java.util.Random;

public class Question {
    private int operand1;
    private int operand2;
    private Operation operation;
    private Difficulty difficulty;

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

    public boolean isCorrect(int answer) {
        switch(operation) {
            case PLUS: return operand1 + operand2 == answer;
            case MINUS: return operand1 - operand2 == answer;
            case MULTIPLY: return operand1 * operand2 == answer;
            case DIVIDE: return operand2 != 0 && operand1 / operand2 == answer;
            default: return false;
        }
    }

    @Override
    public String toString() {
        return operand1 + " " + operation.label + " " + operand2;
    }
}
