import java.util.List;

public class BinarySearch implements SearchBehavior {
    @Override
    public boolean contains(List<Person> people, Person person) {
        int left = 0;
        int right = people.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            Person midPerson = people.get(mid);
            
            int comparison = midPerson.compareTo(person);
            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}