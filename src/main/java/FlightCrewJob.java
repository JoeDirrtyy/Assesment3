public enum FlightCrewJob {

   PILOT(0), CO_PILOT(1), FLIGHT_ATTENDANT(2);


    private final int job;


    FlightCrewJob(int job) {
        this.job = job;
    }

    public int getJob() {
        return job;
    }
}
