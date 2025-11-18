package Id_26470.Q2;

public class Booking  extends Passenger{
    private String bookingDate;
    private String seatNumber;
    private String travelClass;


    public Booking(int id, String createdDate, String updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift, String passengerName, int age, String gender, String contact, String bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact);
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        if (!travelClass.matches("(?i)Economy|Business|First"))
            throw new IllegalArgumentException("Invalid travel class");
        this.travelClass = travelClass;
    }
}
