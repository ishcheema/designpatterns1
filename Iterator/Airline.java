import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents an airline with a list of flights.
 */

public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructs an Airline with the specified title and loads its flights.
     *
     * @param title The name of the airline.
     */

    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights(); // Load flights using FlightLoader
    }

    /**
     * Returns the title of the airline.
     *
     * @return The title of the airline.
     */

    public String getTitle() {
        return title;
    }

    /**
     * Creates an iterator for flights between the specified origin and destination airports.
     *
     * @param fromCode The airport code of the origin.
     * @param toCode The airport code of the destination.
     * @return An iterator for flights between the given airports, or null if invalid airport codes are provided.
     */


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
