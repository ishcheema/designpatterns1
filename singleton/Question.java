import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    // Constructor to initialize the question, correct answer, and answers
    public Question(String question, int correctAnswer, String... answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }

    // Returns the question as a formatted string with answer choices
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(question + "\n");
        for (int i = 0; i < answers.size(); i++) {
            sb.append((i + 1) + ". " + answers.get(i) + "\n");
        }
        return sb.toString();
    }

    // Checks if the given answer is correct
    public boolean isCorrect(int userAnswer) {
        return userAnswer - 1 == correctAnswer;
    }

    // Returns the correct answer as a string
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }
}
