import java.util.Iterator;
import java.util.Scanner;

/**
 * The main driver for the airline system. Takes user input for airport codes and displays matching flights.
 */

public class AirlineDriver {

    /**
     * Constructs an AirlineDriver and allows user to find flights between two airports.
     */
   
    public AirlineDriver(){
        Airline american = new Airline("American Airlines");
        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter Origin Airport Code: ");
        String fromCode = reader.nextLine();

        System.out.print("Enter Destination Airport Code: ");
        String toCode = reader.nextLine();

        Iterator<Flight> flights = american.createIterator(fromCode, toCode);

        System.out.println();

        if(flights == null){
            return;
        }


        while(flights.hasNext()){
            System.out.println("  " + flights.next());
        }
    }

    /**
     * The main method, which starts the AirlineDriver.
     *
     * @param args Command-line arguments.
     */

    public static void main(String[] args){
        AirlineDriver driver = new AirlineDriver();
    }
}
