public  class Passenger extends Person{
    public Passenger(String name, double creditCardLimit) {
        super(name);
    }

    Ticket ticket;
    private double creditCardLimit;
    private String[] luggage;

    public Passenger(String name, Ticket ticket, double creditCardLimit, String[] luggage) {
        super(name);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }


    public Ticket getTicket() {
        return ticket;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public String[] getLuggage() {
        return luggage;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }

    public int getAmtOfLuggage(){
        return 0;
    }
    public void printTicket(Ticket ticket){
        System.out.println(ticket.getPrice());
    }
}
