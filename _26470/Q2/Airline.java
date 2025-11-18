package Id_26470.Q2;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;


    public Airline(int id, String createdDate, String updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }


    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        if (!airlineCode.matches("[A-Za-z]{2,4}"))
            throw new IllegalArgumentException("Airline code must be 2–4 letters");
        this.airlineCode = airlineCode;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        if (!contactEmail.contains("@"))
            throw new IllegalArgumentException("Invalid email");
        this.contactEmail = contactEmail;
    }
}
