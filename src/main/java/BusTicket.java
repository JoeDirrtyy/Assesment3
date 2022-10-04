public class BusTicket extends Ticket{

    private final double price = 50.0;

    public BusTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }
}
