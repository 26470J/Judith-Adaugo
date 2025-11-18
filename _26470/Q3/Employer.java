package Id_26470.Q3;

public class Employer extends TaxPayer{
    private String employerName;
    private String employerTIN; // 9 digits
    private String contact;

    public Employer(int id, String createdDate, String updatedDate, String authorityName, String region, String email, String categoryName, double rate, String code, String tin, String taxpayerName, String address, String employerName, String employerTIN, String contact) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address);
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() { return employerName; }
    public void setEmployerName(String employerName) throws TaxDataException {
        if (employerName == null || employerName.trim().isEmpty())
            throw new TaxDataException("employerName cannot be empty");
        this.employerName = employerName;
    }

    public String getEmployerTIN() { return employerTIN; }
    public void setEmployerTIN(String employerTIN) throws TaxDataException {
        if (employerTIN == null || !employerTIN.matches("\\d{9}"))
            throw new TaxDataException("Employer TIN must be 9 digits");
        this.employerTIN = employerTIN;
    }

    public String getContact() { return contact; }
    public void setContact(String contact) throws TaxDataException {
        if (contact == null || !contact.matches("\\d{10}"))
            throw new TaxDataException("Employer contact must be 10 digits");
        this.contact = contact;
    }
}
