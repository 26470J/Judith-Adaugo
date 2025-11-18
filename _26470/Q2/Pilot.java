package Id_26470.Q2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;


    public Pilot(int id, String createdDate, String updatedDate, String airportName, String code, String location, String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure, String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare);
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }


    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.isEmpty())
            throw new IllegalArgumentException("License cannot be empty");
        this.licenseNumber = licenseNumber;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 2)
            throw new IllegalArgumentException("Pilot must have at least 2 years experience");
        this.experienceYears = experienceYears;
    }
}
