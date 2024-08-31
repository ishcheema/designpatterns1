import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The FanReads class that implements the Observer interface.
 * Maintains a list of book recommendations based on genre.
 */

public class FanReads implements Observer {
    private final Map<Genre, List<Book>> recommendations;

    /**
     * Constructs a new FanReads instance and registers it with the subject.
     *
     * @param subject   the subject to observe.
     * @param firstName the first name of the fan.
     * @param lastName  the last name of the fan.
     */

    public FanReads(Subject subject, String firstName, String lastName) {
        this.recommendations = new HashMap<>();
        subject.registerObserver(this);
    }

    /**
     * Updates the recommendations with a new book based on its genre.
     *
     * @param book the new book that has been added to the best sellers list.
     */

    @Override
    public void update(Book book) {
        recommendations.computeIfAbsent(book.getGenre(), k -> new ArrayList<>()).add(book);
    }

    /**
     * Returns a list of recommended books for a specific genre.
     *
     * @param genre the genre of the books to be recommended.
     * @return the list of recommended books.
     */

    public List<Book> getRecommendations(Genre genre) {
        return recommendations.getOrDefault(genre, new ArrayList<>());
    }
}
