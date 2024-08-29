import java.util.ArrayList;
import java.util.List;

public class BestSellers implements Subject {
    private final List<Observer> observers;
    private final List<Book> bestSellers;

    public BestSellers() {
        observers = new ArrayList<>();
        bestSellers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book newBook = new Book(title, genre, authorFirstName, authorLastName, description);
        bestSellers.add(newBook);
        notifyObservers(newBook);
    }
}
