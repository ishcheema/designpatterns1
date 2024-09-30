import java.util.ArrayList;
import java.util.Iterator;

/**
 * An iterator for filtering and traversing flights between two specific airports.
 */

public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Constructs a FlightIterator for the specified list of flights and airports.
     *
     * @param flights The list of flights.
     * @param from The origin airport.
     * @param to The destination airport.
     */

    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.from = from;
        this.to = to;
        this.position = 0;
    }

    /**
     * Returns true if there are more flights between the specified airports.
     *
     * @return True if there are more flights, false otherwise.
     */

    @Override
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    }

    /**
     * Returns the next flight between the specified airports.
     *
     * @return The next flight.
     */

    @Override
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}
