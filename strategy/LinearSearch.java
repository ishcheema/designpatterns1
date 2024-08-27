import java.util.List;

public class LinearSearch implements SearchBehavior {
    @Override
    public boolean contains(List<Person> people, Person person) {
        for (Person item : people) {
            if (item.equals(person)) {
                return true;
            }
        }
        return false;
    }
}
