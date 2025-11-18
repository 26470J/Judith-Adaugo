package Id_26470.Q3;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;


    public TaxAuthority(int id, String createdDate, String updatedDate, String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }


    public String getAuthorityName() { return authorityName; }
    public void setAuthorityName(String authorityName) throws TaxDataException {
        if (authorityName == null || authorityName.trim().isEmpty())
            throw new TaxDataException("authorityName cannot be empty");
        this.authorityName = authorityName;
    }

    public String getRegion() { return region; }
    public void setRegion(String region) throws TaxDataException {
        if (region == null || region.trim().isEmpty())
            throw new TaxDataException("region cannot be empty");
        this.region = region;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws TaxDataException {
        if (email == null || !email.contains("@"))
            throw new TaxDataException("invalid email for TaxAuthority");
        this.email = email;
    }
}

