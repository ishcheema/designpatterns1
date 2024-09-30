import java.time.LocalTime;

/**
 * Represents a flight with details such as flight number, airports, start and end times, and the number of transfers.
 */

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a Flight with the specified details.
     *
     * @param flightNum The flight number.
     * @param from The origin airport.
     * @param to The destination airport.
     * @param startTime The start time of the flight.
     * @param endTime The end time of the flight.
     * @param numTransfers The number of transfers.
     */

    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Returns the origin airport.
     *
     * @return The origin airport.
     */

    public Airport getFrom() {
        return from;
    }

    /**
     * Returns the destination airport.
     *
     * @return The destination airport.
     */

    public Airport getTo() {
        return to;
    }

    /**
     * Checks if this flight is between the specified airports.
     *
     * @param from The origin airport.
     * @param to The destination airport.
     * @return True if the flight is between the specified airports, false otherwise.
     */

    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    /**
     * Returns a string representation of the flight, including details like origin, destination, and transfers.
     *
     * @return A string representation of the flight.
     */

    @Override
    public String toString() {
        int durationHours = endTime.getHour() - startTime.getHour();
        int durationMinutes = endTime.getMinute() - startTime.getMinute();
        String duration = durationHours + "h " + durationMinutes + "m";

        String transferInfo = numTransfers == 0 ? "Direct Flight" : numTransfers + (numTransfers == 1 ? " Stopover" : " Transfers");

        return from + " to " + to + " " + startTime + " - " + endTime + " (" + duration + ") " + transferInfo;
    }
}
