package Id_26470.Q4;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) throws ProcurementDataException {
        if (orgName == null || orgName.trim().isEmpty())
            throw new ProcurementDataException("orgName cannot be empty");
        this.orgName = orgName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws ProcurementDataException {
        if (address == null || address.trim().isEmpty())
            throw new ProcurementDataException("address cannot be empty");
        this.address = address;
    }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) throws ProcurementDataException {
        if (contactEmail == null || !contactEmail.contains("@"))
            throw new ProcurementDataException("contactEmail must be a valid email");
        this.contactEmail = contactEmail;
    }
}
