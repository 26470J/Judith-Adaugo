package Id_26470.Q5;

public class Institution extends Entity {
    private String institutionName;
    private String code; // >=3 chars
    private String address;

    public Institution(int id, String createdDate, String updatedDate, String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() { return institutionName; }
    public void setInstitutionName(String institutionName) throws AttendanceDataException {
        if (institutionName == null || institutionName.trim().isEmpty())
            throw new AttendanceDataException("institutionName cannot be empty");
        this.institutionName = institutionName;
    }

    public String getCode() { return code; }
    public void setCode(String code) throws AttendanceDataException {
        if (code == null || code.trim().length() < 3)
            throw new AttendanceDataException("institution code must be at least 3 chars");
        this.code = code;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws AttendanceDataException {
        if (address == null || address.trim().isEmpty())
            throw new AttendanceDataException("address cannot be empty");
        this.address = address;
    }
}

