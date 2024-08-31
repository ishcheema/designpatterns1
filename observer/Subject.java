

public interface Subject {

    /**
     * Registers an observer to the subject.
     *
     * @param observer the observer to be registered.
     */

    void registerObserver(Observer observer);


    /**
     * Removes an observer from the subject.
     *
     * @param observer the observer to be removed.
     */

    void removeObserver(Observer observer);


    /**
     * Notifies all registered observers of a new update.
     *
     * @param book the book that has been added to the best sellers.
     */

    void notifyObservers(Book book);
}
