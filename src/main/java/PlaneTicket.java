public class PlaneTicket extends Ticket{

    private final double price = 100.00;

    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }

    public boolean isAFrequentFlyer(){
        return true;
    }
}
