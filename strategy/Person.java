
import java.util.Objects;

/**
 * Creates a new Person
 */
public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private String reminder;

    /**
     * Creates a new Person
     * @param firstName The person's first name
     * @param lastName The person's last name
     * @param phoneNumber The person's phone number
     * @param reminder The note saved about the person
     */
    public Person(String firstName, String lastName, String phoneNumber, String reminder) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.reminder = reminder;
    }

    /**
     * Sets the note about the person
     * @param reminder A note about the person
     */
    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    /**
     * Gets the First Name of the Person
     * @return Person's First Name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the Last Name of the Person
     * @return Person's Last Name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the Phone Number of the Person
     * @return The Person's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the Personal Note about the person
     * @return The personal note about the person
     */
    public String getReminder() {
        return reminder;
    }

    /**
     * Lexicographically compares itself to the person provided
     * @param person The person to compare to
     * @return 1 if it's bigger than the person passed in, 0 if equal, and -1 if smaller
     */
    @Override
    public int compareTo(Person person) {
        int lastNameComparison = lastName.compareTo(person.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        return firstName.compareTo(person.getFirstName());
    }

    /**
     * Compares this Person to another for equality
     * @param obj The object to compare to
     * @return true if equal and false if different
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return firstName.equalsIgnoreCase(person.firstName) && lastName.equalsIgnoreCase(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    /**
     * Creates a string representation of the person
     * @return all the information about the person
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + phoneNumber + " (" + reminder + ").";
    }
}
