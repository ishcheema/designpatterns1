

public class Book {
    private final String title;
    private final Genre genre;
    private final String authorFirstName;
    private final String authorLastName;
    private final String description;

    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "----- " + title + "-----\n" +
               genre.label + " by: " + authorFirstName + " " + authorLastName + "\n" +
               description + "\n";
    }
}
