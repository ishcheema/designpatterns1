import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Attendees {
    private final String title;
    private final List<Person> people;
    private SearchBehavior searchBehavior;

    public Attendees(String title) {
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();  // Default to LinearSearch
    }

    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if (!searchBehavior.contains(people, person)) {
            people.add(person);
            if (searchBehavior instanceof BinarySearch) {
                Collections.sort(people); // Sort the list when using BinarySearch
            }
            return person;
        } else {
            return null;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
        if (searchBehavior instanceof BinarySearch) {
            Collections.sort(people); // Sort the list immediately when switching to BinarySearch
        }
    }

    public List<Person> getList() {
        return people;
    }
}
