import java.time.LocalTime;

public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    @Override
    public String toString() {
        int durationHours = endTime.getHour() - startTime.getHour();
        int durationMinutes = endTime.getMinute() - startTime.getMinute();
        String duration = durationHours + "h " + durationMinutes + "m";

        String transferInfo = numTransfers == 0 ? "Direct Flight" : numTransfers + (numTransfers == 1 ? " Stopover" : " Transfers");

        return from + " to " + to + " " + startTime + " - " + endTime + " (" + duration + ") " + transferInfo;
    }
}
