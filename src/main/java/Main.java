public class Main {
    public static void main(String[] args) {

     FlightCrewJob flightCrewJob1 = FlightCrewJob.PILOT;
     FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PILOT;
     FlightCrewJob flightCrewJob3 = FlightCrewJob.FLIGHT_ATTENDANT;

     CrewMember crewMember1 = new CrewMember("Barry", FlightCrewJob.PILOT, 100000.00f);
     CrewMember crewMember2 = new CrewMember("Jeffery", FlightCrewJob.CO_PILOT, 90000.00f);
     CrewMember crewMember3 = new CrewMember("Carol",FlightCrewJob.FLIGHT_ATTENDANT, 70000.0f);

     Ticket ticket = new Ticket("");
     BusTicket busTicket = new BusTicket(10,"","","",0);


    Passenger passenger57 = new Passenger("Joe",1000.00);
    Passenger passenger07 = new Passenger("Larry",800.00);




    }
}
