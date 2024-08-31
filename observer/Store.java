

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The Store class that implements the Observer interface.
 * Maintains a queue of the top 5 best-selling books.
 */

public class Store implements Observer {
    private final Queue<Book> bestSellers;

    /**
     * Constructs a new Store instance and registers it with the subject.
     *
     * @param subject the subject to observe.
     */

    public Store(Subject subject) {
        this.bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }

    /**
     * Updates the store with a new book.
     * If the list exceeds 5 books, the oldest book is removed.
     *
     * @param book the new book that has been added to the best sellers list.
     */

    @Override
    public void update(Book book) {
        if (bestSellers.size() >= 5) {
            bestSellers.poll();  // Remove the oldest book if we have more than 5
        }
        bestSellers.offer(book);
    }

    /**
     * Returns the list of top 5 best-selling books.
     *
     * @return the list of best-selling books.
     */

    public List<Book> getBestSellers() {
        return new ArrayList<>(bestSellers);
    }
}
