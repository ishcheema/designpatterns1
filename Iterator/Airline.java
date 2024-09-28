import java.util.ArrayList;
import java.util.Iterator;

public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights(); // Load flights using FlightLoader
    }

    public String getTitle() {
        return title;
    }

    public Iterator<Flight> createIterator(String fromCode, String toCode) {
        try {
            Airport from = Airport.valueOf(fromCode.toUpperCase());
            Airport to = Airport.valueOf(toCode.toUpperCase());
            return new FlightIterator(flights, from, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Must enter valid airport codes");
            return null;
        }
    }
}
