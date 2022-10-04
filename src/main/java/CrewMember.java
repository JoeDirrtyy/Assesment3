public class CrewMember extends Person implements IServAble, IPayable{
    public CrewMember(String name,FlightCrewJob job, float salary) {
        super(name);
    }

private float salary;

    @Override
    public void printPaymentammount(Ticket ticket) {

    }

    @Override
    public void serve(Person person) {

    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "salary=" + salary +
                '}';
    }
}
