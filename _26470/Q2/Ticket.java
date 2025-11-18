package Id_26470.Q2;

public class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;


    public Ticket(int id, String createdDate, String updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, String bookingDate, String seatNumber, String travelClass, String paymentDate, String paymentMethod, double amountPaid, String ticketNumber, String issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }


    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }


    public double calculateFare() {
        double tax = getBaseFare() * 0.15;
        double discount = 0;

        if (getTravelClass().equalsIgnoreCase("Business"))
            discount = 20;
        if (getTravelClass().equalsIgnoreCase("First"))
            discount = 50;

        return getBaseFare() + tax - discount;
    }
}
