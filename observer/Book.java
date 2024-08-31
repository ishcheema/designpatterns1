

/**
 * The Book class represents a book in the system.
 */

public class Book {
    private final String title;
    private final Genre genre;
    private final String authorFirstName;
    private final String authorLastName;
    private final String description;

    /**
     * Constructs a new Book instance.
     *
     * @param title           the title of the book.
     * @param genre           the genre of the book.
     * @param authorFirstName the first name of the author.
     * @param authorLastName  the last name of the author.
     * @param description     the description of the book.
     */

    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    /**
     * Returns the title of the book.
     *
     * @return the title of the book.
     */

    public String getTitle() {
        return title;
    }

    /**
     * Returns the genre of the book.
     *
     * @return the genre of the book.
     */

    public Genre getGenre() {
        return genre;
    }

    /**
     * Returns the first name of the author.
     *
     * @return the first name of the author.
     */

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Returns the last name of the author.
     *
     * @return the last name of the author.
     */

    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Returns the description of the book.
     *
     * @return the description of the book.
     */

    public String getDescription() {
        return description;
    }

    /**
     * Returns a string representation of the book.
     *
     * @return a string representation of the book.
     */

    @Override
    public String toString() {
        return "----- " + title + "-----\n" +
               genre.label + " by: " + authorFirstName + " " + authorLastName + "\n" +
               description + "\n";
    }
}
