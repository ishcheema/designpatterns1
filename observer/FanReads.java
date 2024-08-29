import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FanReads implements Observer {
    private final Map<Genre, List<Book>> recommendations;

    public FanReads(Subject subject, String firstName, String lastName) {
        this.recommendations = new HashMap<>();
        subject.registerObserver(this);
    }

    @Override
    public void update(Book book) {
        recommendations.computeIfAbsent(book.getGenre(), k -> new ArrayList<>()).add(book);
    }

    public List<Book> getRecommendations(Genre genre) {
        return recommendations.getOrDefault(genre, new ArrayList<>());
    }
}
