package Id_26470.Q2;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, String createdDate, String updatedDate, String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || !code.matches("[A-Z]{3}"))
            throw new IllegalArgumentException("Airport code must be 3 uppercase letters");
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
