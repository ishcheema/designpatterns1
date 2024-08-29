

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Store implements Observer {
    private final Queue<Book> bestSellers;

    public Store(Subject subject) {
        this.bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }

    @Override
    public void update(Book book) {
        if (bestSellers.size() >= 5) {
            bestSellers.poll();  // Remove the oldest book if we have more than 5
        }
        bestSellers.offer(book);
    }

    public List<Book> getBestSellers() {
        return new ArrayList<>(bestSellers);
    }
}
