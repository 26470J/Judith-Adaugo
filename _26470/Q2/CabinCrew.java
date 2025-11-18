package Id_26470.Q2;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;


    public CabinCrew(int id, String createdDate, String updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears, String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }


    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if (role == null || role.isEmpty())
            throw new IllegalArgumentException("Role cannot be empty");
        this.role = role;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        if (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))
            throw new IllegalArgumentException("Shift must be Day or Night");
        this.shift = shift;
    }
}
