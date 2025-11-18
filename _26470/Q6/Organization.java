package Id_26470.Q6;
public class Organization extends Entity {
    private String orgName;
    private String orgCode;      // >=3 chars
    private String rssbNumber;   // 8 digits
    private String contactEmail;

    public Organization() { super(); }

    public Organization(int id, String createdDate, String updatedDate,
                        String orgName, String orgCode, String rssbNumber, String contactEmail)
            throws PayrollDataException {
        super(id, createdDate, updatedDate);
        setOrgName(orgName);
        setOrgCode(orgCode);
        setRssbNumber(rssbNumber);
        setContactEmail(contactEmail);
    }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) throws PayrollDataException {
        if (orgName == null || orgName.trim().isEmpty())
            throw new PayrollDataException("orgName cannot be empty");
        this.orgName = orgName;
    }

    public String getOrgCode() { return orgCode; }
    public void setOrgCode(String orgCode) throws PayrollDataException {
        if (orgCode == null || orgCode.trim().length() < 3)
            throw new PayrollDataException("orgCode must be at least 3 characters");
        this.orgCode = orgCode;
    }

    public String getRssbNumber() { return rssbNumber; }
    public void setRssbNumber(String rssbNumber) throws PayrollDataException {
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}"))
            throw new PayrollDataException("rssbNumber must be exactly 8 digits");
        this.rssbNumber = rssbNumber;
    }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) throws PayrollDataException {
        if (contactEmail == null || !contactEmail.contains("@"))
            throw new PayrollDataException("contactEmail must be a valid email");
        this.contactEmail = contactEmail;
    }
}
